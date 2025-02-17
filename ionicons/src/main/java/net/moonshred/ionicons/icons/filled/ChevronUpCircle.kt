package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ChevronUpCircle: ImageVector
  get() {
    if (_ChevronUpCircle != null) {
      return _ChevronUpCircle!!
    }
    _ChevronUpCircle = ImageVector.Builder(
      name = "Filled.ChevronUpCircle",
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
        moveTo(363.31f, 307.31f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, 0f)
        lineTo(256f, 222.63f)
        lineToRelative(-84.69f, 84.68f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, -22.62f)
        lineToRelative(96f, -96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 0f)
        lineToRelative(96f, 96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 363.31f, 307.31f)
        close()
      }
    }.build()

    return _ChevronUpCircle!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronUpCircle: ImageVector? = null
