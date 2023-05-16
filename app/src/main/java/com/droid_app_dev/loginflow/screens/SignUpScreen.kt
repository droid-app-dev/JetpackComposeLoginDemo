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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.droid_app_dev.loginflow.R
import com.droid_app_dev.loginflow.components.*
import com.droid_app_dev.loginflow.data.LoginViewModel
import com.droid_app_dev.loginflow.data.UIEvent
import com.droid_app_dev.loginflow.navigation.LoginDemoRouter
import com.droid_app_dev.loginflow.navigation.Screen

@Composable
fun SignUpScreen(loginViewModel: LoginViewModel = viewModel()) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {

           // NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))

            RoundCornerImageView()

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.FirstNameChanged(it))
                }
            )

           /* MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.LastNameChanged(it))
                }
            )*/

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.message),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.EmailChanged(it))
                }
            )

            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_lock),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.PasswordChanged(it))
                }
            )

         /*   CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })
*/
            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register),
            onButtonClicked = {
                loginViewModel.onEvent(UIEvent.RegisterButtonClicked)
            })

            Spacer(modifier = Modifier.height(20.dp))

            //DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                LoginDemoRouter.navigateTo(Screen.LoginScreen)
            })
        }

    }


}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}