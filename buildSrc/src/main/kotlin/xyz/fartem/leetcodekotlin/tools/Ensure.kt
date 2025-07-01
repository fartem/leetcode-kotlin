package xyz.fartem.leetcodekotlin.tools

import org.gradle.api.GradleException

fun ensure(value: Boolean, message: () -> String) {
    if (!value) {
        throw GradleException(message())
    }
}

fun ensureNot(value: Boolean, message: () -> String) {
    if (value) {
        throw GradleException(message())
    }
}
