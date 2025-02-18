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

val Ionicons.Sharp.Add: ImageVector
  get() {
    if (_AddSharp != null) {
      return _AddSharp!!
    }
    _AddSharp = ImageVector.Builder(
      name = "Sharp.AddSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 112f)
        lineTo(256f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 256f)
        lineTo(112f, 256f)
      }
    }.build()

    return _AddSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AddSharp: ImageVector? = null
