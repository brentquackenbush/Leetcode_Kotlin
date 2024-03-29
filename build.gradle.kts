plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.dokka") version "1.8.20"
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1"
    application
}

group = "org.leetcode.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
