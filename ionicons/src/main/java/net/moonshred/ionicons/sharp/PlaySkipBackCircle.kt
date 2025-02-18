package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PlaySkipBackCircle: ImageVector
  get() {
    if (_PlaySkipBackCircleSharp != null) {
      return _PlaySkipBackCircleSharp!!
    }
    _PlaySkipBackCircleSharp = ImageVector.Builder(
      name = "Sharp.PlaySkipBackCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 256f)
        curveToRelative(0f, 114.69f, 93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        reflectiveCurveTo(48f, 141.31f, 48f, 256f)
        close()
        moveTo(176f, 176f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(69f)
        lineToRelative(128f, -77.53f)
        lineTo(336f, 344.37f)
        lineTo(208f, 267f)
        verticalLineToRelative(69f)
        lineTo(176f, 336f)
        close()
      }
    }.build()

    return _PlaySkipBackCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipBackCircleSharp: ImageVector? = null
