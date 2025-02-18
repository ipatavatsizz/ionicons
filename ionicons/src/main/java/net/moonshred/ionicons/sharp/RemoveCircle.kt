package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.RemoveCircle: ImageVector
  get() {
    if (_RemoveCircleSharp != null) {
      return _RemoveCircleSharp!!
    }
    _RemoveCircleSharp = ImageVector.Builder(
      name = "Sharp.RemoveCircleSharp",
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
        moveTo(352f, 272f)
        lineTo(160f, 272f)
        lineTo(160f, 240f)
        lineTo(352f, 240f)
        close()
      }
    }.build()

    return _RemoveCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RemoveCircleSharp: ImageVector? = null
