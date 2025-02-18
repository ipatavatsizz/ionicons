package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ChevronUpCircle: ImageVector
  get() {
    if (_ChevronUpCircleOutline != null) {
      return _ChevronUpCircleOutline!!
    }
    _ChevronUpCircleOutline = ImageVector.Builder(
      name = "Outline.ChevronUpCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 296f)
        lineToRelative(-96f, -96f)
        lineToRelative(-96f, 96f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 64f)
        curveTo(150f, 64f, 64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        close()
      }
    }.build()

    return _ChevronUpCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronUpCircleOutline: ImageVector? = null
