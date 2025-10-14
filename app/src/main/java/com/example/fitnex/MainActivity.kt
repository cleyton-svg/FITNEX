package com.example.fitnex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitnex.ui.screens.WelcomeScreen
import com.example.fitnex.ui.theme.FitnexTheme

// Esta es la actividad principal de la app
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Esto se ejecuta en tiempo de ejecución en el emulador/dispositivo
            FitnexTheme {
                WelcomeScreen(
                    onSignUpClick = { /* acción */ },
                    onLoginClick = { /* acción */ }
                )
            }
        }
    }
}

// 🔹 Preview para Android Studio
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivityPreview() {
    FitnexTheme {
        WelcomeScreen(
            onSignUpClick = {},
            onLoginClick = {}
        )
    }
}
