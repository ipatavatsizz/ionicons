package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ChevronUp: ImageVector
  get() {
    if (_ChevronUp != null) {
      return _ChevronUp!!
    }
    _ChevronUp = ImageVector.Builder(
      name = "Filled.ChevronUp",
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
        moveTo(112f, 328f)
        lineToRelative(144f, -144f)
        lineToRelative(144f, 144f)
      }
    }.build()

    return _ChevronUp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronUp: ImageVector? = null
