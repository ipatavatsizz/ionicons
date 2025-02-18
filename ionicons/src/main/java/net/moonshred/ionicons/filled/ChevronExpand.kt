package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ChevronExpand: ImageVector
  get() {
    if (_ChevronExpand != null) {
      return _ChevronExpand!!
    }
    _ChevronExpand = ImageVector.Builder(
      name = "Filled.ChevronExpand",
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
        moveTo(136f, 208f)
        lineTo(256f, 104f)
        lineTo(376f, 208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(136f, 304f)
        lineTo(256f, 408f)
        lineTo(376f, 304f)
      }
    }.build()

    return _ChevronExpand!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronExpand: ImageVector? = null
