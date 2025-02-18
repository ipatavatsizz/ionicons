package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PlayBack: ImageVector
  get() {
    if (_PlayBackSharp != null) {
      return _PlayBackSharp!!
    }
    _PlayBackSharp = ImageVector.Builder(
      name = "Sharp.PlayBackSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 400f)
        lineToRelative(-240f, -144f)
        lineToRelative(240f, -144f)
        lineToRelative(0f, 288f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 400f)
        lineToRelative(-240f, -144f)
        lineToRelative(240f, -144f)
        lineToRelative(0f, 288f)
        close()
      }
    }.build()

    return _PlayBackSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlayBackSharp: ImageVector? = null
