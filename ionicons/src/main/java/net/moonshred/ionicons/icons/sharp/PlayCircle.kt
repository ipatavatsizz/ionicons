package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PlayCircle: ImageVector
  get() {
    if (_PlayCircleSharp != null) {
      return _PlayCircleSharp!!
    }
    _PlayCircleSharp = ImageVector.Builder(
      name = "Sharp.PlayCircleSharp",
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
        moveTo(200f, 344f)
        verticalLineTo(168f)
        lineToRelative(144f, 88f)
        close()
      }
    }.build()

    return _PlayCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlayCircleSharp: ImageVector? = null
