package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ArrowForwardCircle: ImageVector
  get() {
    if (_ArrowForwardCircleSharp != null) {
      return _ArrowForwardCircleSharp!!
    }
    _ArrowForwardCircleSharp = ImageVector.Builder(
      name = "Sharp.ArrowForwardCircleSharp",
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
        moveTo(240f, 336.09f)
        lineTo(303.58f, 272f)
        horizontalLineTo(154f)
        verticalLineTo(240f)
        horizontalLineTo(303.58f)
        lineTo(240f, 175.91f)
        lineToRelative(22.71f, -22.54f)
        lineTo(364.54f, 256f)
        lineTo(262.7f, 358.63f)
        close()
      }
    }.build()

    return _ArrowForwardCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowForwardCircleSharp: ImageVector? = null
