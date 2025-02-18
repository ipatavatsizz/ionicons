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

val Ionicons.Outline.Storefront: ImageVector
  get() {
    if (_StorefrontOutline != null) {
      return _StorefrontOutline!!
    }
    _StorefrontOutline = ImageVector.Builder(
      name = "Outline.StorefrontOutline",
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
        moveTo(448f, 448f)
        lineTo(448f, 240f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 240f)
        lineTo(64f, 448f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(382.47f, 48f)
        horizontalLineTo(129.53f)
        curveTo(107.74f, 48f, 88.06f, 60f, 79.6f, 78.46f)
        lineTo(36.3f, 173f)
        curveToRelative(-14.58f, 31.81f, 9.63f, 67.85f, 47.19f, 69f)
        quadToRelative(1f, 0f, 2f, 0f)
        curveToRelative(31.4f, 0f, 56.85f, -25.18f, 56.85f, -52.23f)
        curveToRelative(0f, 27f, 25.46f, 52.23f, 56.86f, 52.23f)
        reflectiveCurveTo(256f, 218.62f, 256f, 189.77f)
        curveToRelative(0f, 27f, 25.45f, 52.23f, 56.85f, 52.23f)
        reflectiveCurveToRelative(56.86f, -23.38f, 56.86f, -52.23f)
        curveToRelative(0f, 28.85f, 25.45f, 52.23f, 56.85f, 52.23f)
        quadToRelative(1f, 0f, 1.95f, 0f)
        curveToRelative(37.56f, -1.17f, 61.77f, -37.21f, 47.19f, -69f)
        lineTo(432.4f, 78.46f)
        curveTo(423.94f, 60f, 404.26f, 48f, 382.47f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(32f, 464f)
        lineTo(480f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(136f, 288f)
        horizontalLineToRelative(80f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineToRelative(88f)
        arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
        horizontalLineTo(112f)
        arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
        verticalLineTo(312f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 288f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(288f, 464f)
        verticalLineTo(312f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineToRelative(64f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(464f)
      }
    }.build()

    return _StorefrontOutline!!
  }

@Suppress("ObjectPropertyName")
private var _StorefrontOutline: ImageVector? = null
