package com.droid_app_dev.loginflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.droid_app_dev.loginflow.app.LoginDemo

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginDemo()
        }
    }
}

@Preview
@Composable
fun DefaultPreview(){
    LoginDemo()
}