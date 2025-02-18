package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Link: ImageVector
  get() {
    if (_LinkSharp != null) {
      return _LinkSharp!!
    }
    _LinkSharp = ImageVector.Builder(
      name = "Sharp.LinkSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(200.66f, 352f)
        horizontalLineTo(144f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -192f)
        horizontalLineToRelative(55.41f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(312.59f, 160f)
        horizontalLineTo(368f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 192f)
        horizontalLineTo(311.34f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(169.07f, 256f)
        lineTo(344.93f, 256f)
      }
    }.build()

    return _LinkSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LinkSharp: ImageVector? = null
