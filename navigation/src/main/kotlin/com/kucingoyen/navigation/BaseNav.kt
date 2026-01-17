package com.kucingoyen.navigation

sealed interface BaseNav {

    enum class Auth : BaseNav {
        SplashScreen, LoginScreen
    }

}

