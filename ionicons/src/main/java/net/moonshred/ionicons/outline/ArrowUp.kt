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

val Ionicons.Outline.ArrowUp: ImageVector
  get() {
    if (_ArrowUpOutline != null) {
      return _ArrowUpOutline!!
    }
    _ArrowUpOutline = ImageVector.Builder(
      name = "Outline.ArrowUpOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 244f)
        lineToRelative(144f, -144f)
        lineToRelative(144f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 120f)
        lineTo(256f, 412f)
      }
    }.build()

    return _ArrowUpOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpOutline: ImageVector? = null
