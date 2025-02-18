package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ArrowForward: ImageVector
  get() {
    if (_ArrowForwardOutline != null) {
      return _ArrowForwardOutline!!
    }
    _ArrowForwardOutline = ImageVector.Builder(
      name = "Outline.ArrowForwardOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(268f, 112f)
        lineToRelative(144f, 144f)
        lineToRelative(-144f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(392f, 256f)
        lineTo(100f, 256f)
      }
    }.build()

    return _ArrowForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowForwardOutline: ImageVector? = null
