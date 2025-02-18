package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PlayForward: ImageVector
  get() {
    if (_PlayForwardSharp != null) {
      return _PlayForwardSharp!!
    }
    _PlayForwardSharp = ImageVector.Builder(
      name = "Sharp.PlayForwardSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 400f)
        lineToRelative(240f, -144f)
        lineToRelative(-240f, -144f)
        lineToRelative(0f, 288f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 400f)
        lineToRelative(240f, -144f)
        lineToRelative(-240f, -144f)
        lineToRelative(0f, 288f)
        close()
      }
    }.build()

    return _PlayForwardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlayForwardSharp: ImageVector? = null
