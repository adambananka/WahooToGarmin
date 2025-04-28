plugins {
    // Apply the shared build logic from a convention plugin.
    id("buildsrc.convention.kotlin-jvm")
    // Apply Kotlin Serialization plugin from `gradle/libs.versions.toml`.
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    // Apply the kotlinx bundle of dependencies from the version catalog (`gradle/libs.versions.toml`).
    implementation(libs.bundles.kotlinx)
    implementation(libs.dropbox.sdk)
    testImplementation(kotlin("test"))
}
