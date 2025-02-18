package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ChevronUpCircle: ImageVector
  get() {
    if (_ChevronUpCircleSharp != null) {
      return _ChevronUpCircleSharp!!
    }
    _ChevronUpCircleSharp = ImageVector.Builder(
      name = "Sharp.ChevronUpCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
        moveTo(352f, 318.63f)
        lineTo(256f, 222.63f)
        lineTo(160f, 318.63f)
        lineTo(137.37f, 296f)
        lineTo(256f, 177.37f)
        lineTo(374.63f, 296f)
        close()
      }
    }.build()

    return _ChevronUpCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronUpCircleSharp: ImageVector? = null
