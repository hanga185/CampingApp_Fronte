import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id ("kotlin-kapt")
}

android {
    namespace = "com.camp.campingapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.camp.campingapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled= true
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
        jvmTarget =JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        viewBinding = true
    }
//    viewBinding {
//        enabled = true
//    }

}

dependencies {
    implementation(platform("com.google.firebase:firebase-bom:32.2.2"))
    implementation("com.google.firebase:firebase-analytics-ktx")


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.google.firebase:firebase-bom:29.0.0")
    implementation ("com.google.android.gms:play-services-auth:19.2.0")
    implementation ("androidx.multidex:multidex:2.0.1")
    implementation ("com.google.firebase:firebase-auth-ktx:21.0.1")

    implementation ("com.google.firebase:firebase-firestore-ktx:24.0.0")
    implementation ("com.google.firebase:firebase-storage-ktx:20.0.0")
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation ("com.firebaseui:firebase-ui-storage:8.0.0")
    implementation ("com.github.bumptech.glide:compiler:4.12.0")
}