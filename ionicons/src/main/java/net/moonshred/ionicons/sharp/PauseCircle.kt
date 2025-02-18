package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PauseCircle: ImageVector
  get() {
    if (_PauseCircleSharp != null) {
      return _PauseCircleSharp!!
    }
    _PauseCircleSharp = ImageVector.Builder(
      name = "Sharp.PauseCircleSharp",
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
        moveTo(224f, 336f)
        lineTo(192f, 336f)
        lineTo(192f, 176f)
        horizontalLineToRelative(32f)
        close()
        moveTo(320f, 336f)
        lineTo(288f, 336f)
        lineTo(288f, 176f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _PauseCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PauseCircleSharp: ImageVector? = null
