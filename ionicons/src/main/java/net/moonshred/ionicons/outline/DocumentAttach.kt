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

val Ionicons.Outline.DocumentAttach: ImageVector
  get() {
    if (_DocumentAttachOutline != null) {
      return _DocumentAttachOutline!!
    }
    _DocumentAttachOutline = ImageVector.Builder(
      name = "Outline.DocumentAttachOutline",
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
        moveTo(208f, 64f)
        horizontalLineToRelative(66.75f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 9.37f)
        lineTo(438.63f, 214.63f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 237.25f)
        verticalLineTo(432f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
        horizontalLineTo(192f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(304f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(288f, 72f)
        verticalLineTo(192f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(440f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(160f, 80f)
        verticalLineTo(232f)
        arcToRelative(23.69f, 23.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        curveToRelative(-12f, 0f, -24f, -9.1f, -24f, -24f)
        verticalLineTo(88f)
        curveToRelative(0f, -30.59f, 16.57f, -56f, 48f, -56f)
        reflectiveCurveToRelative(48f, 24.8f, 48f, 55.38f)
        verticalLineTo(226.13f)
        curveToRelative(0f, 43f, -27.82f, 77.87f, -72f, 77.87f)
        reflectiveCurveToRelative(-72f, -34.86f, -72f, -77.87f)
        verticalLineTo(144f)
      }
    }.build()

    return _DocumentAttachOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentAttachOutline: ImageVector? = null
