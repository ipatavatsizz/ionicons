package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Navigate: ImageVector
  get() {
    if (_NavigateSharp != null) {
      return _NavigateSharp!!
    }
    _NavigateSharp = ImageVector.Builder(
      name = "Sharp.NavigateSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 32f)
        lineToRelative(-448f, 208f)
        lineToRelative(240f, 0f)
        lineToRelative(0f, 240f)
        lineToRelative(208f, -448f)
        close()
      }
    }.build()

    return _NavigateSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NavigateSharp: ImageVector? = null
