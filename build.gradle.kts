plugins {
    kotlin("jvm") version "2.2.20"
    id("com.gradleup.shadow") version "9.1.0"
}

group = "org.extrateam.java"
version = "1.0.0"

repositories {
    mavenCentral()

    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")

    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}