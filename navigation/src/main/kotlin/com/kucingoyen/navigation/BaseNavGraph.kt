package com.kucingoyen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kucingoyen.auth.screens.login.LoginScreen
import com.kucingoyen.auth.screens.splash.SplashScreen

@Composable
fun BaseNavGraph(navController : NavHostController){
    NavHost(navController, startDestination = BaseNav.Auth.SplashScreen.name) {

        composable(route = BaseNav.Auth.SplashScreen.name) { navBackStackEntry ->
            SplashScreen(navController)
        }

        navigation(
            startDestination = BaseNav.Auth.LoginScreen.name,
            route = NavModule.AuthModule.name){

            composable(route = BaseNav.Auth.LoginScreen.name) { navBackStackEntry ->
                LoginScreen()
            }
        }
    }
}