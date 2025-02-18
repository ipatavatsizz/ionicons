package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ChevronBackCircle: ImageVector
  get() {
    if (_ChevronBackCircleSharp != null) {
      return _ChevronBackCircleSharp!!
    }
    _ChevronBackCircleSharp = ImageVector.Builder(
      name = "Sharp.ChevronBackCircleSharp",
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
        moveTo(318.63f, 352f)
        lineTo(296f, 374.63f)
        lineTo(177.37f, 256f)
        lineTo(296f, 137.37f)
        lineTo(318.63f, 160f)
        lineToRelative(-96f, 96f)
        close()
      }
    }.build()

    return _ChevronBackCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronBackCircleSharp: ImageVector? = null
