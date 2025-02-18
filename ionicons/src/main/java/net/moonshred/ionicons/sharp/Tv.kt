package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Tv: ImageVector
  get() {
    if (_TvSharp != null) {
      return _TvSharp!!
    }
    _TvSharp = ImageVector.Builder(
      name = "Sharp.TvSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(488f, 384f)
        horizontalLineTo(24f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(88f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
        horizontalLineTo(488f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        verticalLineTo(376f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 488f, 384f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(116f, 400f)
        lineTo(396f, 400f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 404f)
        lineTo(400f, 428f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 396f, 432f)
        lineTo(116f, 432f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 428f)
        lineTo(112f, 404f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 400f)
        close()
      }
    }.build()

    return _TvSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TvSharp: ImageVector? = null
