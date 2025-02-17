package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.NotificationsCircle: ImageVector
  get() {
    if (_NotificationsCircleOutline != null) {
      return _NotificationsCircleOutline!!
    }
    _NotificationsCircleOutline = ImageVector.Builder(
      name = "Outline.NotificationsCircleOutline",
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
        curveToRelative(-21.24f, 8.46f, -47f, 25.8f, -47f, 74.67f)
        curveToRelative(0f, 53.33f, -11.54f, 61.46f, -27.87f, 80.8f)
        curveToRelative(-6.77f, 8f, -0.65f, 23f, 11.19f, 23f)
        horizontalLineTo(354f)
        curveTo(365.77f, 336f, 371.94f, 321f, 365.2f, 313f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(220.24f, 352f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4.42f)
        curveTo(218.49f, 375.14f, 235.11f, 384f, 256f, 384f)
        curveToRelative(20.67f, 0f, 37.14f, -9.15f, 39.66f, -27.52f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4.48f)
        close()
      }
    }.build()

    return _NotificationsCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsCircleOutline: ImageVector? = null
