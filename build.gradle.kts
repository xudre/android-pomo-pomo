buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Constants.gradleToolsVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Constants.kotlinVersion}")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
