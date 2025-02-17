package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ChevronForward: ImageVector
  get() {
    if (_ChevronForwardOutline != null) {
      return _ChevronForwardOutline!!
    }
    _ChevronForwardOutline = ImageVector.Builder(
      name = "Outline.ChevronForwardOutline",
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
        moveTo(184f, 112f)
        lineToRelative(144f, 144f)
        lineToRelative(-144f, 144f)
      }
    }.build()

    return _ChevronForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronForwardOutline: ImageVector? = null
