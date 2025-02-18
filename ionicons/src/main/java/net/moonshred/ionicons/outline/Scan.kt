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

val Ionicons.Outline.Scan: ImageVector
  get() {
    if (_ScanOutline != null) {
      return _ScanOutline!!
    }
    _ScanOutline = ImageVector.Builder(
      name = "Outline.ScanOutline",
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
        moveTo(336f, 448f)
        horizontalLineToRelative(56f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 176f)
        verticalLineTo(120f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
        horizontalLineTo(336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 448f)
        horizontalLineTo(120f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
        verticalLineTo(336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 176f)
        verticalLineTo(120f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
        horizontalLineToRelative(56f)
      }
    }.build()

    return _ScanOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ScanOutline: ImageVector? = null
