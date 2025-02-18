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

val Ionicons.Filled.CodeDownload: ImageVector
  get() {
    if (_CodeDownload != null) {
      return _CodeDownload!!
    }
    _CodeDownload = ImageVector.Builder(
      name = "Filled.CodeDownload",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 368f)
        lineToRelative(-128f, -112f)
        lineToRelative(128f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 368f)
        lineToRelative(128f, -112f)
        lineToRelative(-128f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 288.1f)
        lineToRelative(64f, 63.9f)
        lineToRelative(64f, -63.9f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 160f)
        lineTo(256f, 336.03f)
      }
    }.build()

    return _CodeDownload!!
  }

@Suppress("ObjectPropertyName")
private var _CodeDownload: ImageVector? = null
