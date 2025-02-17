package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.NotificationsCircle: ImageVector
  get() {
    if (_NotificationsCircleSharp != null) {
      return _NotificationsCircleSharp!!
    }
    _NotificationsCircleSharp = ImageVector.Builder(
      name = "Sharp.NotificationsCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(295.68f, 351.43f)
        curveToRelative(0f, 0.19f, 0f, 0.38f, 0f, 0.57f)
        horizontalLineTo(296f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(256f, 384f)
        curveToRelative(-22.48f, 0f, -40f, -10.25f, -40f, -32f)
        horizontalLineToRelative(80f)
        curveTo(295.7f, 373.37f, 278.29f, 384f, 256f, 384f)
        close()
        moveTo(368f, 336f)
        lineTo(144f, 336f)
        lineTo(144f, 308f)
        lineToRelative(28f, -36f)
        lineTo(172f, 239.7f)
        curveToRelative(0f, -40.41f, 15.82f, -75.35f, 56f, -84.27f)
        lineTo(232f, 128f)
        horizontalLineToRelative(48f)
        lineToRelative(4f, 27.43f)
        curveToRelative(40f, 8.92f, 56f, 44f, 56f, 84.27f)
        lineTo(340f, 272f)
        lineToRelative(28f, 36f)
        close()
      }
    }.build()

    return _NotificationsCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsCircleSharp: ImageVector? = null
