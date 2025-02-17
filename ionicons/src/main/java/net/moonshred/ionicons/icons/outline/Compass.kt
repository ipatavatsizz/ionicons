package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Compass: ImageVector
  get() {
    if (_CompassOutline != null) {
      return _CompassOutline!!
    }
    _CompassOutline = ImageVector.Builder(
      name = "Outline.CompassOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(350.67f, 150.93f)
        lineToRelative(-117.2f, 46.88f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.66f, 35.66f)
        lineToRelative(-46.88f, 117.2f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.4f, 10.4f)
        lineToRelative(117.2f, -46.88f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.66f, -35.66f)
        lineToRelative(46.88f, -117.2f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 350.67f, 150.93f)
        close()
        moveTo(256f, 280f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 280f)
        close()
      }
    }.build()

    return _CompassOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CompassOutline: ImageVector? = null
