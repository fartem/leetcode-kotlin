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
        val regex = Regex("""\| ?(\d+)\.""")
        val errors = mutableListOf<String>()

        val order = regex.findAll(content).map { it.groupValues[1].toInt() }.toList()

        order.forEachIndexed { i, num ->
            if (i > 0) {
                val prev = order[i - 1]

                when {
                    prev > num -> errors.add("$prev > $num")
                    prev == num -> errors.add("$prev == $num")
                }
            }
        }

        ensure(errors.isEmpty()) {
            buildString {
                appendLine("Incorrect order in ${file.name} for next numbers:")
                errors.forEach {
                    appendLine(it)
                }
            }
        }
    }
}
