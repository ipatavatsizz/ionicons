package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ReorderTwo: ImageVector
  get() {
    if (_ReorderTwo != null) {
      return _ReorderTwo!!
    }
    _ReorderTwo = ImageVector.Builder(
      name = "Filled.ReorderTwo",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(118f, 304f)
        lineTo(394f, 304f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(118f, 208f)
        lineTo(394f, 208f)
      }
    }.build()

    return _ReorderTwo!!
  }

@Suppress("ObjectPropertyName")
private var _ReorderTwo: ImageVector? = null
