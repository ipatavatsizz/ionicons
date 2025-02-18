package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ReorderThree: ImageVector
  get() {
    if (_ReorderThree != null) {
      return _ReorderThree!!
    }
    _ReorderThree = ImageVector.Builder(
      name = "Filled.ReorderThree",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(102f, 256f)
        lineTo(410f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(102f, 176f)
        lineTo(410f, 176f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(102f, 336f)
        lineTo(410f, 336f)
      }
    }.build()

    return _ReorderThree!!
  }

@Suppress("ObjectPropertyName")
private var _ReorderThree: ImageVector? = null
