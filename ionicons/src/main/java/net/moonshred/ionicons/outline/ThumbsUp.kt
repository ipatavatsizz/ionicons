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

val Ionicons.Outline.ThumbsUp: ImageVector
  get() {
    if (_ThumbsUpOutline != null) {
      return _ThumbsUpOutline!!
    }
    _ThumbsUpOutline = ImageVector.Builder(
      name = "Outline.ThumbsUpOutline",
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
        moveTo(320f, 458.16f)
        reflectiveCurveTo(304f, 464f, 256f, 464f)
        reflectiveCurveToRelative(-74f, -16f, -96f, -32f)
        horizontalLineTo(96f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, -64f)
        verticalLineTo(320f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
        horizontalLineToRelative(30f)
        arcToRelative(
          32.34f,
          32.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          27.37f,
          -15.4f
        )
        reflectiveCurveTo(162f, 221.81f, 188f, 176.78f)
        reflectiveCurveTo(264f, 64f, 272f, 48f)
        curveToRelative(29f, 0f, 43f, 22f, 34f, 47.71f)
        curveToRelative(-10.28f, 29.39f, -23.71f, 54.38f, -27.46f, 87.09f)
        curveToRelative(-0.54f, 4.78f, 3.14f, 12f, 7.95f, 12f)
        lineTo(416f, 205f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(416f, 271f)
        lineToRelative(-80f, -2f)
        curveToRelative(-20f, -1.84f, -32f, -12.4f, -32f, -30f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, -17.6f, 14f, -28.84f, 32f, -30f)
        lineToRelative(80f, -4f)
        curveToRelative(17.6f, 0f, 32f, 16.4f, 32f, 34f)
        verticalLineToRelative(0.17f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 271f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 336f)
        lineToRelative(-112f, -2f)
        curveToRelative(-18f, -0.84f, -32f, -12.41f, -32f, -30f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, -17.61f, 14f, -28.86f, 32f, -30f)
        lineToRelative(112f, -2f)
        arcToRelative(32.1f, 32.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        horizontalLineToRelative(0f)
        arcTo(32.1f, 32.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 336f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(400f, 464f)
        lineToRelative(-64f, -3f)
        curveToRelative(-21f, -1.84f, -32f, -11.4f, -32f, -29f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, -17.6f, 14.4f, -30f, 32f, -30f)
        lineToRelative(64f, -2f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        horizontalLineToRelative(0f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 464f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(432f, 400f)
        lineToRelative(-96f, -2f)
        curveToRelative(-19f, -0.84f, -32f, -12.4f, -32f, -30f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, -17.6f, 13f, -28.84f, 32f, -30f)
        lineToRelative(96f, -2f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        horizontalLineToRelative(0f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 400f)
        close()
      }
    }.build()

    return _ThumbsUpOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ThumbsUpOutline: ImageVector? = null
