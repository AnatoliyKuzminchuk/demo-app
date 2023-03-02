package int20h.troipsa.demoapp.ui.navigation

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

object DemoAppNavigationDefaults {
    @Composable
    fun navigationContentColor() = MaterialTheme.colorScheme.onSurfaceVariant

    @Composable
    fun navigationSelectedItemColor() = MaterialTheme.colorScheme.onPrimaryContainer

    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.primaryContainer
}