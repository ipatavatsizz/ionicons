package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ReorderTwo: ImageVector
  get() {
    if (_ReorderTwoSharp != null) {
      return _ReorderTwoSharp!!
    }
    _ReorderTwoSharp = ImageVector.Builder(
      name = "Sharp.ReorderTwoSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(118f, 304f)
        lineTo(394f, 304f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(118f, 208f)
        lineTo(394f, 208f)
      }
    }.build()

    return _ReorderTwoSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReorderTwoSharp: ImageVector? = null
