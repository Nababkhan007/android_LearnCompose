package com.khan.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

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
    val color: Color = if (isSystemInDarkTheme())
        Color.White
    else
        Color.Black
    Text(
        text = "Hello, $message, Welcome Here",
        color = color,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Cursive,
    )
}

@Preview
@Composable
fun LearnComposePreview() {
    WelcomeMessage(message = "Compose")
}