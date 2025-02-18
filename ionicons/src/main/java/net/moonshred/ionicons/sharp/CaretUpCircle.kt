package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.CaretUpCircle: ImageVector
  get() {
    if (_CaretUpCircleSharp != null) {
      return _CaretUpCircleSharp!!
    }
    _CaretUpCircleSharp = ImageVector.Builder(
      name = "Sharp.CaretUpCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
        moveTo(147.73f, 300f)
        lineTo(256f, 169.91f)
        lineTo(364.27f, 300f)
        close()
      }
    }.build()

    return _CaretUpCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretUpCircleSharp: ImageVector? = null
