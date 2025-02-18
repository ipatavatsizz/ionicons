package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.TrendingUp: ImageVector
  get() {
    if (_TrendingUpSharp != null) {
      return _TrendingUpSharp!!
    }
    _TrendingUpSharp = ImageVector.Builder(
      name = "Sharp.TrendingUpSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(352f, 144f)
        lineToRelative(112f, 0f)
        lineToRelative(0f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(48f, 368f)
        lineToRelative(144f, -144f)
        lineToRelative(96f, 96f)
        lineToRelative(160f, -160f)
      }
    }.build()

    return _TrendingUpSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TrendingUpSharp: ImageVector? = null
