package xyz.fartem.leetcodekotlin.ci

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import xyz.fartem.leetcodekotlin.tools.ensure
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

abstract class VersionCheckerTask : DefaultTask() {

    @get:Input
    abstract var remoteBuildGradleUrl: URL

    @TaskAction
    fun checkVersions() {
        val remoteVersion = extractRemoteVersion()

        ensure(remoteVersion.isNotEmpty()) {
            "Remote version is empty"
        }

        val localVersion = project.version.toString()

        ensure(localVersion > remoteVersion) {
            "Version mismatch! Local: $localVersion, Remote: $remoteVersion"
        }
    }

    private fun extractRemoteVersion(): String {
        val connection = remoteBuildGradleUrl.openConnection()

        BufferedReader(InputStreamReader(connection.getInputStream())).use { reader ->
            val regex = """version\s*=\s*"([^"]+)"""".toRegex()

            reader.lineSequence().forEach { line ->
                regex.find(line)?.let { matchResult ->
                    return matchResult.groupValues[1]
                }
            }
        }

        return ""
    }
}
