package com.khan.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeMessage(message = "Compose")
        }
    }
}

@Composable
fun WelcomeMessage(message: String) {
    Text(text = "Hello, $message, Welcome Here")
}

@Preview
@Composable
fun LearnComposePreview() {
    WelcomeMessage(message = "Compose")
}