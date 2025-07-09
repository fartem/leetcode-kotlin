import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import xyz.fartem.leetcodekotlin.ci.DuplicateLinksCheckerTask
import xyz.fartem.leetcodekotlin.ci.LineOrderCheckerTask
import xyz.fartem.leetcodekotlin.ci.VersionCheckerTask
import java.net.URL

plugins {
    kotlin("jvm") version "1.9.10"
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
    application
}

group = "xyz.fartem.leetcodekotlin"
version = "1.2.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.register<DuplicateLinksCheckerTask>("duplicateLinksChecker") {
    file = file("README.md")
}

tasks.register<LineOrderCheckerTask>("lineOrderChecker") {
    file = file("README.md")
}

tasks.register<VersionCheckerTask>("versionChecker") {
    remoteBuildGradleUrl = URL(
        "https://raw.githubusercontent.com/fartem/leetcode-kotlin/refs/heads/master/build.gradle.kts"
    )
}

tasks.named("check") {
    dependsOn("duplicateLinksChecker")
    dependsOn("lineOrderChecker")
    dependsOn("versionChecker")
}

application {
    mainClass.set("MainKt")
}

detekt {
    config.setFrom("$projectDir/config/detekt.yaml")
}
