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

val Ionicons.Filled.TrendingDown: ImageVector
  get() {
    if (_TrendingDown != null) {
      return _TrendingDown!!
    }
    _TrendingDown = ImageVector.Builder(
      name = "Filled.TrendingDown",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 368f)
        lineToRelative(112f, 0f)
        lineToRelative(0f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 144f)
        lineTo(169.37f, 265.37f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.26f, 0f)
        lineToRelative(50.74f, -50.74f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45.26f, 0f)
        lineTo(448f, 352f)
      }
    }.build()

    return _TrendingDown!!
  }

@Suppress("ObjectPropertyName")
private var _TrendingDown: ImageVector? = null
