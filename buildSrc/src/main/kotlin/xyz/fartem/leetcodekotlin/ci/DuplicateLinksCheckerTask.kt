package xyz.fartem.leetcodekotlin.ci

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import java.io.File

abstract class DuplicateLinkCheckTask : DefaultTask() {

    @get:InputFile
    abstract var readmeFile: File

    @TaskAction
    fun checkForDuplicateLinks() {
        if (!readmeFile.exists()) {
            throw GradleException("README.md file not found at ${readmeFile.path}")
        }

        val content = readmeFile.readText()
        val regex = Regex("https://[^\\s\\]\\[)>\"]+")
        val matches = regex.findAll(content).map { it.value }.toList()

        val duplicates = matches
            .groupingBy { it }
            .eachCount()
            .filter { it.value > 1 }

        if (duplicates.isNotEmpty()) {
            throw GradleException(
                buildString {
                    appendLine("Duplicate HTTPS links found in README.md:")
                    duplicates.forEach { (url, count) ->
                        appendLine(" - $url ($count occurrences)")
                    }
                }
            )
        }
    }
}
