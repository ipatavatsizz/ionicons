package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.PlaySkipBackCircle: ImageVector
  get() {
    if (_PlaySkipBackCircle != null) {
      return _PlaySkipBackCircle!!
    }
    _PlaySkipBackCircle = ImageVector.Builder(
      name = "Filled.PlaySkipBackCircle",
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
        moveTo(176f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        verticalLineToRelative(53f)
        lineToRelative(111.68f, -67.46f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 186.87f)
        lineTo(336f, 325.13f)
        arcToRelative(
          10.78f,
          10.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -16.32f,
          9.31f
        )
        lineTo(208f, 267f)
        verticalLineToRelative(53f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        close()
      }
    }.build()

    return _PlaySkipBackCircle!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipBackCircle: ImageVector? = null
