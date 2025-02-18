package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Scan: ImageVector
  get() {
    if (_Scan != null) {
      return _Scan!!
    }
    _Scan = ImageVector.Builder(
      name = "Filled.Scan",
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
        moveTo(342f, 444f)
        horizontalLineToRelative(46f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(342f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(444f, 170f)
        verticalLineTo(124f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
        horizontalLineTo(342f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(170f, 444f)
        horizontalLineTo(124f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
        verticalLineTo(342f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(68f, 170f)
        verticalLineTo(124f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
        horizontalLineToRelative(46f)
      }
    }.build()

    return _Scan!!
  }

@Suppress("ObjectPropertyName")
private var _Scan: ImageVector? = null
