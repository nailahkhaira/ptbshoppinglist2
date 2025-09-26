package com.example.shoppinglist.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Light color scheme
private val LightColors = lightColorScheme(
    primary = TealLight,
    onPrimary = TealOn,
    primaryContainer = TealPrimaryContainer,
    onPrimaryContainer = TealOnPrimaryContainer,
    secondary = TealSecondary,
    secondaryContainer = TealSecondaryContainer,
    onSecondaryContainer = TealOnSecondaryContainer,
    background = TealBackground,
    onBackground = TealOnBackground,
    surface = TealSurface,
    onSurface = TealOnSurface,
)

// Dark color scheme
private val DarkColors = darkColorScheme(
    primary = TealDark,
    onPrimary = TealOn,
    primaryContainer = TealDarkPrimaryContainer,
    onPrimaryContainer = TealDarkOnPrimaryContainer,
    secondary = TealSecondary,
    secondaryContainer = TealDarkSecondaryContainer,
    onSecondaryContainer = TealDarkOnSecondaryContainer,
    background = TealDarkBackground,
    onBackground = TealDarkOnBackground,
    surface = TealSurfaceDark,
    onSurface = TealOnSurfaceDark,
)

@Composable
fun ShoppingListTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
