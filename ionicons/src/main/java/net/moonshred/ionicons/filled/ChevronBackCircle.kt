package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ChevronBackCircle: ImageVector
  get() {
    if (_ChevronBackCircle != null) {
      return _ChevronBackCircle!!
    }
    _ChevronBackCircle = ImageVector.Builder(
      name = "Filled.ChevronBackCircle",
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
        moveTo(291.31f, 340.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -22.62f, 22.62f)
        lineToRelative(-96f, -96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.62f)
        lineToRelative(96f, -96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 22.62f)
        lineTo(206.63f, 256f)
        close()
      }
    }.build()

    return _ChevronBackCircle!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronBackCircle: ImageVector? = null
