package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ChevronForward: ImageVector
  get() {
    if (_ChevronForward != null) {
      return _ChevronForward!!
    }
    _ChevronForward = ImageVector.Builder(
      name = "Filled.ChevronForward",
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

    return _ChevronForward!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronForward: ImageVector? = null
