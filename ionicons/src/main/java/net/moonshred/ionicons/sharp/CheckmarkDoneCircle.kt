package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CheckmarkDoneCircle: ImageVector
  get() {
    if (_CheckmarkDoneCircleSharp != null) {
      return _CheckmarkDoneCircleSharp!!
    }
    _CheckmarkDoneCircleSharp = ImageVector.Builder(
      name = "Sharp.CheckmarkDoneCircleSharp",
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
        moveTo(304.19f, 169.42f)
        lineTo(328.29f, 190.48f)
        lineTo(254.68f, 274.58f)
        lineTo(230.58f, 251.52f)
        close()
        moveTo(191.93f, 342.63f)
        lineTo(121.37f, 272f)
        lineTo(144f, 249.37f)
        lineTo(214.57f, 320f)
        close()
        moveTo(256.93f, 343.42f)
        lineTo(185.55f, 272f)
        lineToRelative(22.64f, -22.62f)
        lineToRelative(47.16f, 47.21f)
        lineTo(366.48f, 169.42f)
        lineToRelative(24.1f, 21.06f)
        close()
      }
    }.build()

    return _CheckmarkDoneCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CheckmarkDoneCircleSharp: ImageVector? = null
