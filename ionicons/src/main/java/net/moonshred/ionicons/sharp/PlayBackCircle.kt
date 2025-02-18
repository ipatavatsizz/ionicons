package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PlayBackCircle: ImageVector
  get() {
    if (_PlayBackCircleSharp != null) {
      return _PlayBackCircleSharp!!
    }
    _PlayBackCircleSharp = ImageVector.Builder(
      name = "Sharp.PlayBackCircleSharp",
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
        moveTo(111.47f, 256f)
        lineTo(248f, 168f)
        verticalLineToRelative(72.16f)
        lineToRelative(120f, -72.48f)
        lineTo(368f, 344.13f)
        lineTo(248f, 271.81f)
        verticalLineToRelative(71.44f)
        close()
      }
    }.build()

    return _PlayBackCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlayBackCircleSharp: ImageVector? = null
