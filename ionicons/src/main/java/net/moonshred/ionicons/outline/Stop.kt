package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Stop: ImageVector
  get() {
    if (_StopOutline != null) {
      return _StopOutline!!
    }
    _StopOutline = ImageVector.Builder(
      name = "Outline.StopOutline",
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
        moveTo(120f, 96f)
        lineTo(392f, 96f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 120f)
        lineTo(416f, 392f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 392f, 416f)
        lineTo(120f, 416f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 392f)
        lineTo(96f, 120f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 96f)
        close()
      }
    }.build()

    return _StopOutline!!
  }

@Suppress("ObjectPropertyName")
private var _StopOutline: ImageVector? = null
