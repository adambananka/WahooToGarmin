plugins {
    kotlin("jvm") version "2.1.20"
    application
}

group = "com.github.adambananka.wahootogarmin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.dropbox.core:dropbox-core-sdk:7.0.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}