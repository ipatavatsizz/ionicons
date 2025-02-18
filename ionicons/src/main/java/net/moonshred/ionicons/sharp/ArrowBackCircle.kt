package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowBackCircle: ImageVector
  get() {
    if (_ArrowBackCircleSharp != null) {
      return _ArrowBackCircleSharp!!
    }
    _ArrowBackCircleSharp = ImageVector.Builder(
      name = "Sharp.ArrowBackCircleSharp",
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
        moveTo(272f, 175.91f)
        lineTo(208.42f, 240f)
        lineTo(358f, 240f)
        verticalLineToRelative(32f)
        lineTo(208.42f, 272f)
        lineTo(272f, 336.09f)
        lineTo(249.3f, 358.63f)
        lineTo(147.46f, 256f)
        lineTo(249.3f, 153.37f)
        close()
      }
    }.build()

    return _ArrowBackCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowBackCircleSharp: ImageVector? = null
