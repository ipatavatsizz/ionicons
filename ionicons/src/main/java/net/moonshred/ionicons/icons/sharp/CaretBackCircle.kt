package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CaretBackCircle: ImageVector
  get() {
    if (_CaretBackCircleSharp != null) {
      return _CaretBackCircleSharp!!
    }
    _CaretBackCircleSharp = ImageVector.Builder(
      name = "Sharp.CaretBackCircleSharp",
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
        moveTo(300f, 364.27f)
        lineTo(169.91f, 256f)
        lineTo(300f, 147.73f)
        close()
      }
    }.build()

    return _CaretBackCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretBackCircleSharp: ImageVector? = null
