// ui/theme/FitTheme.kt
package com.example.fitnex.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.fitnex.R

// Colors (from your mockup)
val Primary = Color(0xFF38E07B)
private val BackgroundLight = Color(0xFFF6F8F7)
private val BackgroundDark = Color(0xFF122017)
private val OnBackgroundLight = Color(0xFF122017)
private val OnBackgroundDark = Color(0xFFECEFEF)

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    background = BackgroundLight,
    onBackground = OnBackgroundLight,
    surface = Color.White.copy(alpha = 0.98f)
)

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = Color.Black,
    background = BackgroundDark,
    onBackground = OnBackgroundDark,
    surface = Color(0xFF14221A)
)


@Composable
fun FitTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (useDarkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(
            displayLarge = androidx.compose.ui.text.TextStyle(fontFamily = Lexend),
            displayMedium = androidx.compose.ui.text.TextStyle(fontFamily = Lexend),
            titleLarge = androidx.compose.ui.text.TextStyle(fontFamily = Lexend),
            bodyLarge = androidx.compose.ui.text.TextStyle(fontFamily = Lexend)
        ),
        content = content
    )
}
