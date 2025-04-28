pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    buildscript {
        val androidPluginVersion = "8.9.2"
        val kotlinVersion = "2.0.21"

        plugins {
            id("com.android.application").version(androidPluginVersion)
            id("com.android.library").version(androidPluginVersion)
            id("org.jetbrains.kotlin.android").version(kotlinVersion)
            id("org.jetbrains.kotlin.plugin.serialization").version(
                kotlinVersion
            )
        }
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    // Use the Foojay Toolchains plugin to automatically download JDKs required by subprojects.
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

include(":desktop")
include(":core")
include(":mobile")

rootProject.name = "WahooToGarmin"