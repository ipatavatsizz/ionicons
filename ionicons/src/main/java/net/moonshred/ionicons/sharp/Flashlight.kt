package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Flashlight: ImageVector
  get() {
    if (_FlashlightSharp != null) {
      return _FlashlightSharp!!
    }
    _FlashlightSharp = ImageVector.Builder(
      name = "Sharp.FlashlightSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(330f, 16f)
        lineToRelative(-42.68f, 42.7f)
        lineToRelative(165.98f, 165.98f)
        lineToRelative(42.7f, -42.68f)
        lineToRelative(-166f, -166f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(429.21f, 243.85f)
        lineTo(268f, 82.59f)
        lineTo(249.65f, 168f)
        lineTo(16f, 402f)
        lineToRelative(94f, 94f)
        lineTo(344.23f, 262.2f)
        close()
        moveTo(240.21f, 299.92f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -25.25f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240.19f, 299.92f)
        close()
      }
    }.build()

    return _FlashlightSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlashlightSharp: ImageVector? = null
