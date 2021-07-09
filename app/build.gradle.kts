plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Constants.compileSdk
    buildToolsVersion = Constants.buildToolsVersion

    defaultConfig {
        applicationId = "com.thepipecat.lab.pomodoro"
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = Constants.javaVersion
        targetCompatibility = Constants.javaVersion
    }

    kotlinOptions {
        jvmTarget = Constants.javaVersion.toString()
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta07"
    }
}

dependencies {
    implementation(project(":domain"))

    // AndroidX
    implementation("androidx.core:core-ktx:${Constants.AndroidX.coreKtxVersion}")
    implementation("androidx.appcompat:appcompat:${Constants.AndroidX.appCompatVersion}")
    implementation("androidx.constraintlayout:constraintlayout:${Constants.AndroidX.constraintLayoutVersion}")
    implementation("androidx.navigation:navigation-fragment-ktx:${Constants.AndroidX.navigationVersion}")
    implementation("androidx.navigation:navigation-ui-ktx:${Constants.AndroidX.navigationVersion}")

    // Google
    implementation("com.google.android.material:material:${Constants.Google.materialVersion}")

    // Koin
    implementation("io.insert-koin:koin-android:${Constants.koinVersion}")
    implementation("io.insert-koin:koin-android-compat:${Constants.koinVersion}")
    implementation("io.insert-koin:koin-androidx-workmanager:${Constants.koinVersion}")
    implementation("io.insert-koin:koin-androidx-compose:${Constants.koinVersion}")

    // Compose
    implementation("androidx.compose.ui:ui:${Constants.composeVersion}")
    implementation("androidx.compose.ui:ui-tooling:${Constants.composeVersion}")
    implementation("androidx.compose.foundation:foundation:${Constants.composeVersion}")
    implementation("androidx.compose.material:material:${Constants.composeVersion}")
    implementation("androidx.compose.material:material-icons-core:${Constants.composeVersion}")
    implementation("androidx.compose.material:material-icons-extended:${Constants.composeVersion}")
    implementation("androidx.compose.runtime:runtime-livedata:${Constants.composeVersion}")
    implementation("androidx.compose.runtime:runtime-rxjava2:${Constants.composeVersion}")

    // Tests
    testImplementation("junit:junit:${Constants.Test.junitVersion}")
    androidTestImplementation("androidx.test.ext:junit:${Constants.Test.junitExtVersion}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Constants.Test.espressoVersion}")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Constants.composeVersion}")
}
