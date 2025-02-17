package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ColorFill: ImageVector
  get() {
    if (_ColorFillSharp != null) {
      return _ColorFillSharp!!
    }
    _ColorFillSharp = ImageVector.Builder(
      name = "Sharp.ColorFillSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 320f)
        reflectiveCurveToRelative(-64f, 48f, -64f, 99.84f)
        curveToRelative(0f, 33.28f, 28.67f, 60.16f, 64f, 60.16f)
        reflectiveCurveToRelative(64f, -27f, 64f, -60.16f)
        curveTo(480f, 368f, 416f, 320f, 416f, 320f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(144f, 32f)
        lineTo(68f, 108f)
        lineToRelative(70f, 70f)
        lineTo(32f, 280f)
        lineTo(208f, 464f)
        lineTo(360.8f, 315.7f)
        lineTo(416f, 304f)
        close()
        moveTo(168f, 148f)
        lineTo(128.4f, 107f)
        lineTo(144.28f, 91.11f)
        lineTo(184f, 132f)
        close()
      }
    }.build()

    return _ColorFillSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ColorFillSharp: ImageVector? = null
