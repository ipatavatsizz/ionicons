package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Tv: ImageVector
  get() {
    if (_TvOutline != null) {
      return _TvOutline!!
    }
    _TvOutline = ImageVector.Builder(
      name = "Outline.TvOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64.14f, 96f)
        lineTo(447.86f, 96f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 128.14f)
        lineTo(480f, 335.86f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 447.86f, 368f)
        lineTo(64.14f, 368f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 335.86f)
        lineTo(32f, 128.14f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.14f, 96f)
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

    return _TvOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TvOutline: ImageVector? = null
