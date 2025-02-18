package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.PlayCircle: ImageVector
  get() {
    if (_PlayCircle != null) {
      return _PlayCircle!!
    }
    _PlayCircle = ImageVector.Builder(
      name = "Filled.PlayCircle",
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
        moveTo(330.77f, 265.3f)
        lineTo(216.32f, 334.44f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 325.13f)
        lineTo(200f, 186.87f)
        arcToRelative(
          10.78f,
          10.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          16.32f,
          -9.31f
        )
        lineTo(330.77f, 246.7f)
        arcTo(10.89f, 10.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 330.77f, 265.3f)
        close()
      }
    }.build()

    return _PlayCircle!!
  }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
