plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
//    id("androidx.navigation.safeargs.kotlin")


}

android {
    namespace = "com.diangle.newsdxhome"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.diangle.newsdxhome"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    // Splash Screen
    implementation("androidx.core:core-splashscreen:1.1.0-alpha02")

    implementation ("androidx.multidex:multidex:2.0.1")

    implementation ("androidx.cardview:cardview:1.0.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    implementation ("com.google.android.material:material:1.5.0")
    implementation ("com.github.bumptech.glide:glide:4.12.0")

    //koin
    implementation ("io.insert-koin:koin-core:3.2.0")
    implementation ("io.insert-koin:koin-android:3.2.0")
    implementation ("io.insert-koin:koin-android:3.2.0")

    // timber
    implementation ("com.jakewharton.timber:timber:5.0.1")

    // Lottie
    implementation ("com.airbnb.android:lottie:4.2.0")

    // shimmer
    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")

    implementation ("androidx.room:room-runtime:2.4.0-alpha04")
    kapt ("androidx.room:room-compiler:2.4.0-alpha04")
    androidTestImplementation ("androidx.room:room-testing:2.4.0-alpha04")
    implementation ("androidx.room:room-ktx:2.4.0-alpha04")

    // retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")

    // coroutine flow
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    api ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    // database encryption
    implementation ("net.zetetic:android-database-sqlcipher:4.4.0")
    implementation ("androidx.sqlite:sqlite:2.1.0")
//
//    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
//    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

}