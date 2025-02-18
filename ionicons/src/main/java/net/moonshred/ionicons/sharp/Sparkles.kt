package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Sparkles: ImageVector
  get() {
    if (_SparklesSharp != null) {
      return _SparklesSharp!!
    }
    _SparklesSharp = ImageVector.Builder(
      name = "Sharp.SparklesSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(208f, 512f)
        lineTo(155.62f, 372.38f)
        lineTo(16f, 320f)
        lineToRelative(139.62f, -52.38f)
        lineTo(208f, 128f)
        lineToRelative(52.38f, 139.62f)
        lineTo(400f, 320f)
        lineTo(260.38f, 372.38f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(88f, 176f)
        lineTo(64.43f, 111.57f)
        lineTo(0f, 88f)
        lineTo(64.43f, 64.43f)
        lineTo(88f, 0f)
        lineToRelative(23.57f, 64.43f)
        lineTo(176f, 88f)
        lineToRelative(-64.43f, 23.57f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 256f)
        lineToRelative(-31.11f, -80.89f)
        lineTo(288f, 144f)
        lineToRelative(80.89f, -31.11f)
        lineTo(400f, 32f)
        lineToRelative(31.11f, 80.89f)
        lineTo(512f, 144f)
        lineToRelative(-80.89f, 31.11f)
        close()
      }
    }.build()

    return _SparklesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SparklesSharp: ImageVector? = null
