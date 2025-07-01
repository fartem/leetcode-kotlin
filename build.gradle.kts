import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import xyz.fartem.leetcodekotlin.ci.DuplicateLinkCheckTask

plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "xyz.fartem.leetcodekotlin"
version = "1.1.6"

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

tasks.register<DuplicateLinkCheckTask>("duplicateLinksChecker") {
    readmeFile = file("README.md")
}

tasks.named("check") {
    dependsOn("duplicateLinksChecker")
}

application {
    mainClass.set("MainKt")
}