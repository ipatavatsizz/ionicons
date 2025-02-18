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

val Ionicons.Outline.TabletPortrait: ImageVector
  get() {
    if (_TabletPortraitOutline != null) {
      return _TabletPortraitOutline!!
    }
    _TabletPortraitOutline = ImageVector.Builder(
      name = "Outline.TabletPortraitOutline",
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
        moveTo(128f, 16f)
        lineTo(384f, 16f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 64f)
        lineTo(432f, 448f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 496f)
        lineTo(128f, 496f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 448f)
        lineTo(80f, 64f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 16f)
        close()
      }
    }.build()

    return _TabletPortraitOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TabletPortraitOutline: ImageVector? = null
