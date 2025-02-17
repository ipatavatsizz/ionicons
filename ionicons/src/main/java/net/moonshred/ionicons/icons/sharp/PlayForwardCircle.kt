package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PlayForwardCircle: ImageVector
  get() {
    if (_PlayForwardCircleSharp != null) {
      return _PlayForwardCircleSharp!!
    }
    _PlayForwardCircleSharp = ImageVector.Builder(
      name = "Sharp.PlayForwardCircleSharp",
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
        moveTo(264f, 343.25f)
        lineTo(264f, 271.81f)
        lineTo(144f, 344.13f)
        lineTo(144f, 167.71f)
        lineToRelative(120f, 72.48f)
        lineTo(264f, 168f)
        lineToRelative(136.53f, 88f)
        close()
      }
    }.build()

    return _PlayForwardCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlayForwardCircleSharp: ImageVector? = null
