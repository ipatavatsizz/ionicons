package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Tv: ImageVector
  get() {
    if (_Tv != null) {
      return _Tv!!
    }
    _Tv = ImageVector.Builder(
      name = "Filled.Tv",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(447.86f, 384f)
        horizontalLineTo(64.14f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 335.86f)
        verticalLineTo(128.14f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.14f, 80f)
        horizontalLineTo(447.86f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 496f, 128.14f)
        verticalLineTo(335.86f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 447.86f, 384f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(128f, 416f)
        lineTo(384f, 416f)
      }
    }.build()

    return _Tv!!
  }

@Suppress("ObjectPropertyName")
private var _Tv: ImageVector? = null
