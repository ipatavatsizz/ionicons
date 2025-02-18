package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowRedoCircle: ImageVector
  get() {
    if (_ArrowRedoCircleSharp != null) {
      return _ArrowRedoCircleSharp!!
    }
    _ArrowRedoCircleSharp = ImageVector.Builder(
      name = "Sharp.ArrowRedoCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 256f)
        curveToRelative(0f, 114.87f, 93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        close()
        moveTo(146f, 344f)
        curveToRelative(0f, -68.13f, 22.67f, -137.14f, 119.17f, -137.14f)
        lineTo(265.17f, 152f)
        lineTo(366f, 248f)
        lineTo(265.17f, 344f)
        lineTo(265.17f, 289.14f)
        curveTo(198.48f, 289.14f, 173.85f, 308.43f, 146f, 344f)
        close()
      }
    }.build()

    return _ArrowRedoCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowRedoCircleSharp: ImageVector? = null
