package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ChevronForwardCircle: ImageVector
  get() {
    if (_ChevronForwardCircleOutline != null) {
      return _ChevronForwardCircleOutline!!
    }
    _ChevronForwardCircleOutline = ImageVector.Builder(
      name = "Outline.ChevronForwardCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(64f, 256f)
        curveToRelative(0f, 106f, 86f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(216f, 352f)
        lineToRelative(96f, -96f)
        lineToRelative(-96f, -96f)
      }
    }.build()

    return _ChevronForwardCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronForwardCircleOutline: ImageVector? = null
