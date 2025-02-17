package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Shirt: ImageVector
  get() {
    if (_ShirtSharp != null) {
      return _ShirtSharp!!
    }
    _ShirtSharp = ImageVector.Builder(
      name = "Sharp.ShirtSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 42f)
        curveToRelative(-33.88f, 0f, -64f, -10f, -64f, -10f)
        lineToRelative(0f, 2f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 34f)
        lineToRelative(0f, -2f)
        reflectiveCurveTo(289.88f, 42f, 256f, 42f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 44f)
        curveToRelative(-5.49f, 47.76f, -46.79f, 85f, -96f, 85f)
        reflectiveCurveToRelative(-90.51f, -37.24f, -96f, -85f)
        lineTo(16f, 94f)
        lineTo(34f, 208f)
        lineToRelative(61.71f, 7.42f)
        curveToRelative(7.08f, 0.9f, 7.1f, 0.9f, 7.1f, 8.19f)
        lineTo(96f, 480f)
        horizontalLineTo(416f)
        lineToRelative(-6.81f, -256.39f)
        curveToRelative(-0.21f, -7f, -0.21f, -7f, 7.1f, -8.19f)
        lineTo(478f, 208f)
        lineTo(496f, 94f)
        close()
      }
    }.build()

    return _ShirtSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShirtSharp: ImageVector? = null
