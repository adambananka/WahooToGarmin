plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.jvm)
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.android.gradle)
}