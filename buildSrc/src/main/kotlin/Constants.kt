import org.gradle.api.JavaVersion

object Constants {
    const val compileSdk = 30
    const val minSdk = 21
    const val targetSdk = 30
    const val buildToolsVersion = "30.0.3"
    val javaVersion = JavaVersion.VERSION_1_8

    const val gradleToolsVersion = "7.0.0-rc01"
    const val kotlinVersion = "1.4.32"
    const val koinVersion = "3.1.2"
    const val composeVersion = "1.0.0-rc01"
    const val retrofitVersion = "2.9.0"

    object AndroidX {
        const val coreKtxVersion = "1.6.0"
        const val appCompatVersion = "1.3.0"
        const val constraintLayoutVersion = "2.0.4"
        const val navigationVersion = "2.3.5"
    }

    object Google {
        const val materialVersion = "1.4.0"
    }

    object Test {
        const val junitVersion = "4.13.2"
        const val junitExtVersion = "1.1.3"
        const val espressoVersion = "3.4.0"
    }
}