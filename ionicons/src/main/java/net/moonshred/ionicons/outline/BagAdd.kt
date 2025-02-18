package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.BagAdd: ImageVector
  get() {
    if (_BagAddOutline != null) {
      return _BagAddOutline!!
    }
    _BagAddOutline = ImageVector.Builder(
      name = "Outline.BagAddOutline",
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
        moveTo(256f, 256f)
        lineTo(256f, 384f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 320f)
        lineTo(192f, 320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(80f, 176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(408f)
        curveToRelative(0f, 30.24f, 25.76f, 56f, 56f, 56f)
        horizontalLineTo(392f)
        curveToRelative(30.24f, 0f, 56f, -24.51f, 56f, -54.75f)
        verticalLineTo(192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(160f, 176f)
        verticalLineTo(144f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, -96f)
        horizontalLineToRelative(0f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
        verticalLineToRelative(32f)
      }
    }.build()

    return _BagAddOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BagAddOutline: ImageVector? = null
