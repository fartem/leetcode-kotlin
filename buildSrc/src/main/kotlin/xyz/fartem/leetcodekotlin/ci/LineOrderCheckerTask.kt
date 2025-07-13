package xyz.fartem.leetcodekotlin.ci

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import xyz.fartem.leetcodekotlin.tools.ensure
import java.io.File

abstract class LineOrderCheckerTask : DefaultTask() {

    @get:InputFile
    abstract var file: File

    @TaskAction
    fun checkForDuplicateLinks() {
        ensure(file.exists()) {
            "${file.name} not found at ${file.path}"
        }

        val content = file.readText()
        val errors = mutableListOf<String>()

        val blocks = content
            .split(Regex("(?m)^#{2,}\\s*.*$"))
            .map { it.trim() }
            .filter { it.isNotEmpty() }

        blocks.forEachIndexed { blockIndex, blockContent ->
            val regex = Regex("""\| ?(\d+)\.""")
            val numbers = regex
                .findAll(blockContent)
                .mapNotNull { it.groupValues.getOrNull(1)?.toIntOrNull() }
                .toList()

            numbers.forEachIndexed { index, current ->
                if (index > 0) {
                    val previous = numbers[index - 1]

                    when {
                        previous > current -> errors.add("$previous > $current")
                        previous == current -> errors.add("$previous == $current")
                    }
                }
            }
        }

        ensure(errors.isEmpty()) {
            buildString {
                appendLine("Incorrect order in ${file.name} for next numbers:")
                errors.forEach {
                    appendLine("- $it")
                }
            }
        }
    }
}
