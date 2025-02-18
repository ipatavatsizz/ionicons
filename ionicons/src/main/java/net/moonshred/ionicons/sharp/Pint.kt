package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Pint: ImageVector
  get() {
    if (_PintSharp != null) {
      return _PintSharp!!
    }
    _PintSharp = ImageVector.Builder(
      name = "Sharp.PintSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(399f, 99.29f)
        lineTo(394f, 16f)
        horizontalLineTo(118.45f)
        lineTo(113f, 99.26f)
        curveToRelative(-1.29f, 19.24f, -2.23f, 33.14f, 3.73f, 65.66f)
        curveToRelative(1.67f, 9.11f, 5.22f, 22.66f, 9.73f, 39.82f)
        curveToRelative(12.61f, 48f, 33.71f, 128.36f, 33.71f, 195.63f)
        verticalLineTo(496f)
        horizontalLineTo(351.85f)
        verticalLineTo(400.38f)
        curveToRelative(0f, -77.09f, 21.31f, -153.29f, 34f, -198.81f)
        curveToRelative(4.38f, -15.63f, 7.83f, -28f, 9.41f, -36.62f)
        curveTo(401.27f, 132.44f, 400.33f, 118.53f, 399f, 99.29f)
        close()
        moveTo(146.23f, 80f)
        lineToRelative(2f, -32f)
        horizontalLineTo(363.75f)
        lineToRelative(2f, 32f)
        close()
      }
    }.build()

    return _PintSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PintSharp: ImageVector? = null
