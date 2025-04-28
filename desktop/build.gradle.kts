plugins {
    // Apply the shared build logic from a convention plugin.
    id("buildsrc.convention.kotlin-jvm")

    application
}

dependencies {
    implementation(project(":core"))
}

application {
    mainClass.set("MainKt")
}