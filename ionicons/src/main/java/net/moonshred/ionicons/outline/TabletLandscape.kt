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

val Ionicons.Outline.TabletLandscape: ImageVector
  get() {
    if (_TabletLandscapeOutline != null) {
      return _TabletLandscapeOutline!!
    }
    _TabletLandscapeOutline = ImageVector.Builder(
      name = "Outline.TabletLandscapeOutline",
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
        moveTo(16f, 384f)
        lineTo(16f, 128f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 80f)
        lineTo(448f, 80f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 496f, 128f)
        lineTo(496f, 384f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 432f)
        lineTo(64f, 432f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 384f)
        close()
      }
    }.build()

    return _TabletLandscapeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TabletLandscapeOutline: ImageVector? = null
