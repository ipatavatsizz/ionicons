package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Notifications: ImageVector
  get() {
    if (_NotificationsOutline != null) {
      return _NotificationsOutline!!
    }
    _NotificationsOutline = ImageVector.Builder(
      name = "Outline.NotificationsOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(427.68f, 351.43f)
        curveTo(402f, 320f, 383.87f, 304f, 383.87f, 217.35f)
        curveTo(383.87f, 138f, 343.35f, 109.73f, 310f, 96f)
        curveToRelative(-4.43f, -1.82f, -8.6f, -6f, -9.95f, -10.55f)
        curveTo(294.2f, 65.54f, 277.8f, 48f, 256f, 48f)
        reflectiveCurveTo(217.79f, 65.55f, 212f, 85.47f)
        curveToRelative(-1.35f, 4.6f, -5.52f, 8.71f, -9.95f, 10.53f)
        curveToRelative(-33.39f, 13.75f, -73.87f, 41.92f, -73.87f, 121.35f)
        curveTo(128.13f, 304f, 110f, 320f, 84.32f, 351.43f)
        curveTo(73.68f, 364.45f, 83f, 384f, 101.61f, 384f)
        horizontalLineTo(410.49f)
        curveTo(429f, 384f, 438.26f, 364.39f, 427.68f, 351.43f)
        close()
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
    }.build()

    return _NotificationsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsOutline: ImageVector? = null
