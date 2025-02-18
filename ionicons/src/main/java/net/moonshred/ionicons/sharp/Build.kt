package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Build: ImageVector
  get() {
    if (_BuildSharp != null) {
      return _BuildSharp!!
    }
    _BuildSharp = ImageVector.Builder(
      name = "Sharp.BuildSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(230f, 209.2f)
        lineTo(32f, 405.58f)
        lineTo(106.65f, 480f)
        lineTo(304.24f, 281.83f)
        curveToRelative(46.47f, 17.46f, 105.52f, 12.54f, 143f, -24.78f)
        curveToRelative(40.44f, -40.32f, 40.35f, -108f, 16.81f, -156.79f)
        lineToRelative(-87.33f, 87.06f)
        lineToRelative(-52.32f, -52.13f)
        lineToRelative(87.33f, -87.06f)
        curveTo(363f, 24.46f, 294.67f, 24.34f, 254.23f, 64.66f)
        curveTo(216.2f, 102.57f, 211.45f, 162.26f, 230f, 209.2f)
        close()
      }
    }.build()

    return _BuildSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BuildSharp: ImageVector? = null
