package com.droid_app_dev.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.droid_app_dev.loginflow.R
import com.droid_app_dev.loginflow.components.HeadingTextComponent
import com.droid_app_dev.loginflow.navigation.LoginDemoRouter
import com.droid_app_dev.loginflow.navigation.Screen
import com.droid_app_dev.loginflow.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)) {

        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))
        }

    SystemBackButtonHandler {
        LoginDemoRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}