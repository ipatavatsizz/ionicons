package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Receipt: ImageVector
  get() {
    if (_ReceiptOutline != null) {
      return _ReceiptOutline!!
    }
    _ReceiptOutline = ImageVector.Builder(
      name = "Outline.ReceiptOutline",
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
        moveTo(160f, 336f)
        lineToRelative(0f, -288f)
        lineToRelative(32f, 16f)
        lineToRelative(32f, -16f)
        lineToRelative(31.94f, 16f)
        lineToRelative(32.37f, -16f)
        lineToRelative(31.69f, 16f)
        lineToRelative(31.79f, -16f)
        lineToRelative(31.93f, 16f)
        lineToRelative(32.28f, -16f)
        lineToRelative(32.01f, 16f)
        lineToRelative(31.99f, -16f)
        lineToRelative(0f, 224f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(480f, 272f)
        verticalLineTo(384f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
        horizontalLineToRelative(0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
        verticalLineTo(336f)
        horizontalLineTo(48f)
        arcToRelative(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        curveToRelative(0f, 64f, 6.74f, 112f, 80f, 112f)
        horizontalLineTo(400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(224f, 144f)
        lineTo(416f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(288f, 224f)
        lineTo(416f, 224f)
      }
    }.build()

    return _ReceiptOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ReceiptOutline: ImageVector? = null
