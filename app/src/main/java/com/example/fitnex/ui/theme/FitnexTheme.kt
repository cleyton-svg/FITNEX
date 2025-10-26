package com.example.fitnex.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFFF4C753),
    background = Color(0xFFF8F7F6),
    onBackground = Color(0xFF000000)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFF4C753),
    background = Color(0xFF221D10),
    onBackground = Color(0xFFFFFFFF)
)

@Composable
 fun FitnexTheme(darkTheme: Boolean = false, content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = androidx.compose.material3.Typography(),
        content = content
    )
}
