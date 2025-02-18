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

val Ionicons.Outline.ThumbsDown: ImageVector
  get() {
    if (_ThumbsDownOutline != null) {
      return _ThumbsDownOutline!!
    }
    _ThumbsDownOutline = ImageVector.Builder(
      name = "Outline.ThumbsDownOutline",
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
        moveTo(192f, 53.84f)
        reflectiveCurveTo(208f, 48f, 256f, 48f)
        reflectiveCurveToRelative(74f, 16f, 96f, 32f)
        horizontalLineToRelative(64f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        verticalLineToRelative(48f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
        horizontalLineTo(386f)
        arcToRelative(
          32.34f,
          32.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -27.37f,
          15.4f
        )
        reflectiveCurveTo(350f, 290.19f, 324f, 335.22f)
        reflectiveCurveTo(248f, 448f, 240f, 464f)
        curveToRelative(-29f, 0f, -43f, -22f, -34f, -47.71f)
        curveToRelative(10.28f, -29.39f, 23.71f, -54.38f, 27.46f, -87.09f)
        curveToRelative(0.54f, -4.78f, -3.14f, -12f, -8f, -12f)
        lineTo(96f, 307f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(96f, 241f)
        lineToRelative(80f, 2f)
        curveToRelative(20f, 1.84f, 32f, 12.4f, 32f, 30f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 17.6f, -14f, 28.84f, -32f, 30f)
        lineToRelative(-80f, 4f)
        curveToRelative(-17.6f, 0f, -32f, -16.4f, -32f, -34f)
        verticalLineToRelative(-0.17f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 241f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(64f, 176f)
        lineToRelative(112f, 2f)
        curveToRelative(18f, 0.84f, 32f, 12.41f, 32f, 30f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 17.61f, -14f, 28.86f, -32f, 30f)
        lineTo(64f, 240f)
        arcToRelative(32.1f, 32.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
        horizontalLineToRelative(0f)
        arcTo(32.1f, 32.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 176f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(112f, 48f)
        lineToRelative(64f, 3f)
        curveToRelative(21f, 1.84f, 32f, 11.4f, 32f, 29f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 17.6f, -14.4f, 30f, -32f, 30f)
        lineToRelative(-64f, 2f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
        horizontalLineToRelative(0f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(80f, 112f)
        lineToRelative(96f, 2f)
        curveToRelative(19f, 0.84f, 32f, 12.4f, 32f, 30f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 17.6f, -13f, 28.84f, -32f, 30f)
        lineToRelative(-96f, 2f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
        horizontalLineToRelative(0f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 112f)
        close()
      }
    }.build()

    return _ThumbsDownOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ThumbsDownOutline: ImageVector? = null
