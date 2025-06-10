plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id ("kotlin-kapt")
    id("org.jetbrains.kotlin.kapt")
    id("kotlin-parcelize")
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.e_commerceapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.e_commerceapp"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

kapt {
    correctErrorTypes = true
}


dependencies {
    implementation ("com.google.dagger:hilt-android:2.51.1")
    implementation(project(":data"))
    implementation(project(":domain"))
    kapt ("com.google.dagger:hilt-compiler:2.51.1")

    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")

    implementation ("com.github.bumptech.glide:glide:4.16.0")

    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation("androidx.fragment:fragment-ktx:1.8.6")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}