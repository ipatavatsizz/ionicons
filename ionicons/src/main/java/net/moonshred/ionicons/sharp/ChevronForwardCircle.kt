package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ChevronForwardCircle: ImageVector
  get() {
    if (_ChevronForwardCircleSharp != null) {
      return _ChevronForwardCircleSharp!!
    }
    _ChevronForwardCircleSharp = ImageVector.Builder(
      name = "Sharp.ChevronForwardCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(216f, 374.63f)
        lineTo(193.37f, 352f)
        lineToRelative(96f, -96f)
        lineToRelative(-96f, -96f)
        lineTo(216f, 137.37f)
        lineTo(334.63f, 256f)
        close()
      }
    }.build()

    return _ChevronForwardCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronForwardCircleSharp: ImageVector? = null
