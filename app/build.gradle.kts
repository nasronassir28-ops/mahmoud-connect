plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "dz.vetassistant"
    compileSdk = 35

    defaultConfig {
        applicationId = "dz.vetassistant"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
