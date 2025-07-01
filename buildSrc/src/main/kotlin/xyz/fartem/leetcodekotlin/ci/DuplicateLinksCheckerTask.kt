package xyz.fartem.leetcodekotlin.ci

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import xyz.fartem.leetcodekotlin.tools.ensure
import xyz.fartem.leetcodekotlin.tools.ensureNot
import java.io.File

abstract class DuplicateLinksCheckerTask : DefaultTask() {

    @get:InputFile
    abstract var file: File

    @TaskAction
    fun checkForDuplicateLinks() {
        ensure(file.exists()) {
            "${file.name} not found at ${file.path}"
        }

        val content = file.readText()
        val regex = Regex("https://[^\\s\\]\\[)>\"]+")
        val matches = regex.findAll(content).map { it.value }.toList()

        val duplicates = matches
            .groupingBy { it }
            .eachCount()
            .filter { it.value > 1 }

        ensureNot(duplicates.isNotEmpty()) {
            buildString {
                appendLine("Duplicate HTTPS links found in ${file.name}:")
                duplicates.forEach { (url, count) ->
                    appendLine(" - $url ($count occurrences)")
                }
            }
        }
    }
}
