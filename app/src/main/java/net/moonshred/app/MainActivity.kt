package net.moonshred.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import net.moonshred.app.ui.theme.IoniconsTheme
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.outline.Construct
import net.moonshred.ionicons.outline.Home

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      IoniconsTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          TestIcon(
            icon = Ionicons.Outline.Home,
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}

@Composable
fun TestIcon(icon: ImageVector = Ionicons.Outline.Home, modifier: Modifier = Modifier) {
  Icon(
    icon,
    contentDescription = "Icon",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  IoniconsTheme {
    TestIcon(Ionicons.Outline.Construct)
  }
}