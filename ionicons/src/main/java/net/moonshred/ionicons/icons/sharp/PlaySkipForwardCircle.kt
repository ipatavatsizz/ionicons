package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PlaySkipForwardCircle: ImageVector
  get() {
    if (_PlaySkipForwardCircleSharp != null) {
      return _PlaySkipForwardCircleSharp!!
    }
    _PlaySkipForwardCircleSharp = ImageVector.Builder(
      name = "Sharp.PlaySkipForwardCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
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
        lineTo(304f, 336f)
        lineTo(304f, 267f)
        lineTo(176f, 344.37f)
        lineTo(176f, 167.49f)
        lineTo(304f, 245f)
        lineTo(304f, 176f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _PlaySkipForwardCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipForwardCircleSharp: ImageVector? = null
