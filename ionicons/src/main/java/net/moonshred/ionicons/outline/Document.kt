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

val Ionicons.Outline.Document: ImageVector
  get() {
    if (_DocumentOutline != null) {
      return _DocumentOutline!!
    }
    _DocumentOutline = ImageVector.Builder(
      name = "Outline.DocumentOutline",
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
        moveTo(416f, 221.25f)
        verticalLineTo(416f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
        horizontalLineTo(144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(96f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
        horizontalLineToRelative(98.75f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 9.37f)
        lineTo(406.63f, 198.63f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 221.25f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 56f)
        verticalLineTo(176f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(408f)
      }
    }.build()

    return _DocumentOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentOutline: ImageVector? = null
