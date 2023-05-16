package com.droid_app_dev.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.droid_app_dev.loginflow.R
import com.droid_app_dev.loginflow.components.*
import com.droid_app_dev.loginflow.navigation.LoginDemoRouter
import com.droid_app_dev.loginflow.navigation.Screen
import com.droid_app_dev.loginflow.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {

          //  NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))

            RoundCornerImageView()

            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.message),
            onTextSelected = {})

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.lock),
                onTextSelected = {}
            )

            Spacer(modifier = Modifier.height(20.dp))

            UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(10.dp))

            ButtonComponent(value = stringResource(id = R.string.login),
            onButtonClicked = {})

            Spacer(modifier = Modifier.height(20.dp))

           // DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                LoginDemoRouter.navigateTo(Screen.SignUpScreen)
            })
        }
    }

    SystemBackButtonHandler {
        LoginDemoRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}