package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Cellular: ImageVector
  get() {
    if (_CellularOutline != null) {
      return _CellularOutline!!
    }
    _CellularOutline = ImageVector.Builder(
      name = "Outline.CellularOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(424f, 96f)
        lineTo(472f, 96f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 104f)
        lineTo(480f, 408f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 472f, 416f)
        lineTo(424f, 416f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 408f)
        lineTo(416f, 104f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 424f, 96f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(296f, 176f)
        lineTo(344f, 176f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 184f)
        lineTo(352f, 408f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344f, 416f)
        lineTo(296f, 416f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288f, 408f)
        lineTo(288f, 184f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 296f, 176f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(168f, 240f)
        lineTo(216f, 240f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 248f)
        lineTo(224f, 408f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 416f)
        lineTo(168f, 416f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 408f)
        lineTo(160f, 248f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 240f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(40f, 304f)
        lineTo(88f, 304f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 312f)
        lineTo(96f, 408f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 416f)
        lineTo(40f, 416f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 408f)
        lineTo(32f, 312f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 304f)
        close()
      }
    }.build()

    return _CellularOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CellularOutline: ImageVector? = null
