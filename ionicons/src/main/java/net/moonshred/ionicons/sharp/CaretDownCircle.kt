package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CaretDownCircle: ImageVector
  get() {
    if (_CaretDownCircleSharp != null) {
      return _CaretDownCircleSharp!!
    }
    _CaretDownCircleSharp = ImageVector.Builder(
      name = "Sharp.CaretDownCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 256f)
        curveToRelative(0f, -114.87f, -93.13f, -208f, -208f, -208f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveTo(464f, 370.87f, 464f, 256f)
        close()
        moveTo(364.27f, 212f)
        lineTo(256f, 342.09f)
        lineTo(147.73f, 212f)
        close()
      }
    }.build()

    return _CaretDownCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretDownCircleSharp: ImageVector? = null
