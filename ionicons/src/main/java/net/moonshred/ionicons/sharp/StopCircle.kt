package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.StopCircle: ImageVector
  get() {
    if (_StopCircleSharp != null) {
      return _StopCircleSharp!!
    }
    _StopCircleSharp = ImageVector.Builder(
      name = "Sharp.StopCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(336f, 336f)
        lineTo(176f, 336f)
        lineTo(176f, 176f)
        lineTo(336f, 176f)
        close()
      }
    }.build()

    return _StopCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _StopCircleSharp: ImageVector? = null
