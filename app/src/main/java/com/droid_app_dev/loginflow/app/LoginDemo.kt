package com.droid_app_dev.loginflow.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.droid_app_dev.loginflow.navigation.LoginDemoRouter
import com.droid_app_dev.loginflow.navigation.Screen
import com.droid_app_dev.loginflow.screens.LoginScreen
import com.droid_app_dev.loginflow.screens.SignUpScreen
import com.droid_app_dev.loginflow.screens.TermsAndConditionsScreen

@Composable
fun LoginDemo() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Crossfade(targetState = LoginDemoRouter.currentScreen) { currentState->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
                is Screen.LoginScreen ->{
                    LoginScreen()
                }
            }
        }

    }
}