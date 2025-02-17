package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.NotificationsOffCircle: ImageVector
  get() {
    if (_NotificationsOffCircleOutline != null) {
      return _NotificationsOffCircleOutline!!
    }
    _NotificationsOffCircleOutline = ImageVector.Builder(
      name = "Outline.NotificationsOffCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(220.24f, 352f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4.42f)
        curveTo(218.49f, 375.14f, 235.11f, 384f, 256f, 384f)
        reflectiveCurveToRelative(37.5f, -8.86f, 39.73f, -27.58f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4.42f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 378f)
        arcToRelative(
          15.93f,
          15.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -11.84f,
          -5.24f
        )
        lineToRelative(-192f, -212f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.68f, -21.52f)
        lineToRelative(192f, 212f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 378f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(174.68f, 232.21f)
        curveToRelative(0f, 53.33f, -11.54f, 61.46f, -27.87f, 80.8f)
        curveToRelative(-6.77f, 8f, -0.65f, 23f, 11.19f, 23f)
        horizontalLineTo(276.83f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, -6.7f)
        lineToRelative(-98f, -106.87f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.94f, 2.52f)
        curveTo(174.74f, 227.29f, 174.68f, 229.71f, 174.68f, 232.21f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(365.2f, 313f)
        curveToRelative(-16.33f, -19.34f, -27.86f, -27.47f, -27.86f, -80.8f)
        curveToRelative(0f, -48.86f, -25.78f, -66.23f, -47f, -74.67f)
        arcToRelative(
          11.39f,
          11.39f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -6.34f,
          -6.68f
        )
        curveTo(280.29f, 138.6f, 269.88f, 128f, 256f, 128f)
        reflectiveCurveToRelative(-24.31f, 10.6f, -28f, 22.86f)
        arcToRelative(
          11.35f,
          11.35f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -6.33f,
          6.68f
        )
        curveToRelative(-1.28f, 0.51f, -2.57f, 1.05f, -3.88f, 1.63f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, 6.36f)
        lineTo(361f, 323.21f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.94f, -2.95f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 365.2f, 313f)
        close()
      }
    }.build()

    return _NotificationsOffCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsOffCircleOutline: ImageVector? = null
