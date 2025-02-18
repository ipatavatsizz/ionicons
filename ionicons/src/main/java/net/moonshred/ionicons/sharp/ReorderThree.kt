package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ReorderThree: ImageVector
  get() {
    if (_ReorderThreeSharp != null) {
      return _ReorderThreeSharp!!
    }
    _ReorderThreeSharp = ImageVector.Builder(
      name = "Sharp.ReorderThreeSharp",
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
        moveTo(102f, 256f)
        lineTo(410f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(102f, 176f)
        lineTo(410f, 176f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(102f, 336f)
        lineTo(410f, 336f)
      }
    }.build()

    return _ReorderThreeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReorderThreeSharp: ImageVector? = null
