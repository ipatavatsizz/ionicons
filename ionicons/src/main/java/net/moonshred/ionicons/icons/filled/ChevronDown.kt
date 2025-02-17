package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ChevronDown: ImageVector
  get() {
    if (_ChevronDown != null) {
      return _ChevronDown!!
    }
    _ChevronDown = ImageVector.Builder(
      name = "Filled.ChevronDown",
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

    return _ChevronDown!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronDown: ImageVector? = null
