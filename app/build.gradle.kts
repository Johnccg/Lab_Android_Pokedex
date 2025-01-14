plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.pokedex_lab"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pokedex_lab"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Retrofit
    implementation(libs.retrofit2)
    implementation(libs.converter.gson)
    //implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    //implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    //Glide
    implementation (libs.glide)
    annotationProcessor (libs.compiler)
    implementation (libs.glide.transformations)
    //implementation ("com.github.bumptech.glide:glide:4.12.0")
    //annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    //implementation ("jp.wasabeef:glide-transformations:4.3.0")

    //Corrutinas
    implementation (libs.kotlinx.coroutines.android)
    //implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'

    //Fragment
    implementation (libs.androidx.fragment.ktx)
    //implementation "androidx.fragment:fragment-ktx:1.5.0"

    //Activity
    implementation (libs.androidx.activity.ktx)
    //implementation "androidx.activity:activity-ktx:1.5.0"

    //Data binding
    implementation (libs.androidx.databinding.runtime)
    //implementation 'androidx.databinding:databinding-runtime:7.1.2'

    // ViewModel
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    //implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    // LiveData
    implementation (libs.lifecycle.livedata.ktx)
    //implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.3.1"
}