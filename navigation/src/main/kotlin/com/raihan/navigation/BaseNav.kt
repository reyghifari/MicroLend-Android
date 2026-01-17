package com.raihan.navigation

sealed interface BaseNav {

    enum class Auth : BaseNav {
        SplashScreen, LoginScreen
    }

}

