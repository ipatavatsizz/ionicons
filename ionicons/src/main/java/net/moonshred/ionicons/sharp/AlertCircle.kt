package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.AlertCircle: ImageVector
  get() {
    if (_AlertCircleSharp != null) {
      return _AlertCircleSharp!!
    }
    _AlertCircleSharp = ImageVector.Builder(
      name = "Sharp.AlertCircleSharp",
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
        moveTo(276f, 367.91f)
        lineTo(236f, 367.91f)
        verticalLineToRelative(-40f)
        horizontalLineToRelative(40f)
        close()
        moveTo(272f, 304f)
        lineTo(240f, 304f)
        lineToRelative(-6f, -160f)
        horizontalLineToRelative(44f)
        close()
      }
    }.build()

    return _AlertCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AlertCircleSharp: ImageVector? = null
