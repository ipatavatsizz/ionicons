package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.CaretForwardCircle: ImageVector
  get() {
    if (_CaretForwardCircleSharp != null) {
      return _CaretForwardCircleSharp!!
    }
    _CaretForwardCircleSharp = ImageVector.Builder(
      name = "Sharp.CaretForwardCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(212f, 147.73f)
        lineTo(342.09f, 256f)
        lineTo(212f, 364.27f)
        close()
      }
    }.build()

    return _CaretForwardCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretForwardCircleSharp: ImageVector? = null
