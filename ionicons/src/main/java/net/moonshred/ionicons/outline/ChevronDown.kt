package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ChevronDown: ImageVector
  get() {
    if (_ChevronDownOutline != null) {
      return _ChevronDownOutline!!
    }
    _ChevronDownOutline = ImageVector.Builder(
      name = "Outline.ChevronDownOutline",
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
        moveTo(112f, 184f)
        lineToRelative(144f, 144f)
        lineToRelative(144f, -144f)
      }
    }.build()

    return _ChevronDownOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronDownOutline: ImageVector? = null
