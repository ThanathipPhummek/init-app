// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
//    ext.kotlin_version = "1.9.0"

    repositories {
        google()
        mavenCentral()
//        maven {
//            url "https://plugins.gradle.org/m2/"
//        }
//        maven {
//            url 'https://gitlab.com/api/v4/projects/41062496/packages/maven'
//        }
    }
}


plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}