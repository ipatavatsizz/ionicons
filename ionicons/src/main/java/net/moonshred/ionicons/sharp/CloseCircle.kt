package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CloseCircle: ImageVector
  get() {
    if (_CloseCircleSharp != null) {
      return _CloseCircleSharp!!
    }
    _CloseCircleSharp = ImageVector.Builder(
      name = "Sharp.CloseCircleSharp",
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
        moveTo(342.63f, 320f)
        lineTo(320f, 342.63f)
        lineToRelative(-64f, -64f)
        lineToRelative(-64f, 64f)
        lineTo(169.37f, 320f)
        lineToRelative(64f, -64f)
        lineToRelative(-64f, -64f)
        lineTo(192f, 169.37f)
        lineToRelative(64f, 64f)
        lineToRelative(64f, -64f)
        lineTo(342.63f, 192f)
        lineToRelative(-64f, 64f)
        close()
      }
    }.build()

    return _CloseCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloseCircleSharp: ImageVector? = null
