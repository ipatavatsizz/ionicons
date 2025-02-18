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

val Ionicons.Outline.NotificationsOff: ImageVector
  get() {
    if (_NotificationsOffOutline != null) {
      return _NotificationsOffOutline!!
    }
    _NotificationsOffOutline = ImageVector.Builder(
      name = "Outline.NotificationsOffOutline",
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
        moveTo(128.51f, 204.59f)
        quadToRelative(-0.37f, 6.15f, -0.37f, 12.76f)
        curveTo(128.14f, 304f, 110f, 320f, 84.33f, 351.43f)
        curveTo(73.69f, 364.45f, 83f, 384f, 101.62f, 384f)
        horizontalLineTo(320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(414.5f, 335.3f)
        curveToRelative(-18.48f, -23.45f, -30.62f, -47.05f, -30.62f, -118f)
        curveTo(383.88f, 138f, 343.36f, 109.73f, 310f, 96f)
        curveToRelative(-4.43f, -1.82f, -8.6f, -6f, -9.95f, -10.55f)
        curveTo(294.21f, 65.54f, 277.82f, 48f, 256f, 48f)
        reflectiveCurveTo(217.8f, 65.55f, 212f, 85.47f)
        curveToRelative(-1.35f, 4.6f, -5.52f, 8.71f, -10f, 10.53f)
        arcToRelative(
          149.57f,
          149.57f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -18f,
          8.79f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 384f)
        verticalLineToRelative(16f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -128f, 0f)
        verticalLineTo(384f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(448f, 448f)
        lineTo(64f, 64f)
      }
    }.build()

    return _NotificationsOffOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsOffOutline: ImageVector? = null
