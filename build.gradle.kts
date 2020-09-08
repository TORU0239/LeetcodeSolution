import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
    application
}
group = "me.wonyoung"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "MainKt"
}