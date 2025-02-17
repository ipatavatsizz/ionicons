package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HeartCircle: ImageVector
  get() {
    if (_HeartCircleSharp != null) {
      return _HeartCircleSharp!!
    }
    _HeartCircleSharp = ImageVector.Builder(
      name = "Sharp.HeartCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(330.69f, 300.82f)
        curveTo(322.19f, 311.18f, 291f, 339.3f, 256f, 364.33f)
        curveToRelative(-35f, -25f, -66.19f, -53.15f, -74.69f, -63.51f)
        curveToRelative(-20f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
        curveToRelative(0.31f, -31.06f, 25.22f, -56.33f, 55.53f, -56.33f)
        curveToRelative(22f, 0f, 37.3f, 12.41f, 46.19f, 22.76f)
        lineTo(256f, 193.5f)
        lineToRelative(2.27f, -2.75f)
        curveTo(267f, 180.29f, 282.42f, 168f, 304.46f, 168f)
        curveToRelative(30.31f, 0f, 55.22f, 25.27f, 55.53f, 56.33f)
        curveTo(360.27f, 251.42f, 350.68f, 276.45f, 330.69f, 300.82f)
        close()
      }
    }.build()

    return _HeartCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HeartCircleSharp: ImageVector? = null
