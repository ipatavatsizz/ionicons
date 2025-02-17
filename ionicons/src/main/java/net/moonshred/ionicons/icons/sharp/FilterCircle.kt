package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.FilterCircle: ImageVector
  get() {
    if (_FilterCircleSharp != null) {
      return _FilterCircleSharp!!
    }
    _FilterCircleSharp = ImageVector.Builder(
      name = "Sharp.FilterCircleSharp",
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
        moveTo(304f, 352f)
        lineTo(208f, 352f)
        lineTo(208f, 320f)
        horizontalLineToRelative(96f)
        close()
        moveTo(352f, 288f)
        lineTo(160f, 288f)
        lineTo(160f, 256f)
        lineTo(352f, 256f)
        close()
        moveTo(384f, 224f)
        lineTo(128f, 224f)
        lineTo(128f, 192f)
        lineTo(384f, 192f)
        close()
      }
    }.build()

    return _FilterCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FilterCircleSharp: ImageVector? = null
