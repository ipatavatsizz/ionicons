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

val Ionicons.Outline.Cafe: ImageVector
  get() {
    if (_CafeOutline != null) {
      return _CafeOutline!!
    }
    _CafeOutline = ImageVector.Builder(
      name = "Outline.CafeOutline",
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
        moveTo(368f, 80f)
        horizontalLineToRelative(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineToRelative(34f)
        arcToRelative(46f, 46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46f, 46f)
        horizontalLineTo(368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96f, 80f)
        horizontalLineTo(368f)
        arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
        verticalLineTo(272f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
        horizontalLineTo(176f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
        verticalLineTo(80f)
        arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 416f)
        lineTo(400f, 416f)
      }
    }.build()

    return _CafeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CafeOutline: ImageVector? = null
