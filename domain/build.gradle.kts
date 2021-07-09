plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdk = Constants.compileSdk
    buildToolsVersion = Constants.buildToolsVersion

    defaultConfig {
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = Constants.javaVersion
        targetCompatibility = Constants.javaVersion
    }

    kotlinOptions {
        jvmTarget = Constants.javaVersion.toString()
    }
}

dependencies {
    // AndroidX
    implementation("androidx.core:core-ktx:${Constants.AndroidX.coreKtxVersion}")
    implementation("androidx.appcompat:appcompat:${Constants.AndroidX.appCompatVersion}")

    // Google
    implementation("com.google.android.material:material:${Constants.Google.materialVersion}")

    // Koin
    implementation("io.insert-koin:koin-android:${Constants.koinVersion}")
    implementation("io.insert-koin:koin-android-compat:${Constants.koinVersion}")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:${Constants.retrofitVersion}")

    // Tests
    testImplementation("junit:junit:${Constants.Test.junitVersion}")
    androidTestImplementation("androidx.test.ext:junit:${Constants.Test.junitExtVersion}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${Constants.Test.espressoVersion}")
}
