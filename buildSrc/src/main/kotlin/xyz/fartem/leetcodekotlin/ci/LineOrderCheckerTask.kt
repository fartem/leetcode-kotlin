package xyz.fartem.leetcodekotlin.ci

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction
import xyz.fartem.leetcodekotlin.tools.ensure
import xyz.fartem.leetcodekotlin.tools.ensureNot
import java.io.File

abstract class LineOrderCheckerTask : DefaultTask() {

    @get:InputFile
    abstract var file: File

    @TaskAction
    fun checkForDuplicateLinks() {
        ensure(file.exists()) {
            "${file.name} not found at ${file.path}"
        }

        val regex = Regex("""\|\s*(\d+)\.""")
        val order = mutableListOf(0)

        file.readLines().forEach { line ->
            val num = regex.find(line)?.groupValues?.get(1)?.toIntOrNull()

            if (num != null) {
                val last = order.last()

                ensureNot(last >= num) {
                    buildString {
                        appendLine("Incorrect order in ${file.name}:")
                        appendLine("$last >= $num")
                    }
                }

                order.add(num)
            }
        }
    }
}
