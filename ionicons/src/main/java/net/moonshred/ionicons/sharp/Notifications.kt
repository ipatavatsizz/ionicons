package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Notifications: ImageVector
  get() {
    if (_NotificationsSharp != null) {
      return _NotificationsSharp!!
    }
    _NotificationsSharp = ImageVector.Builder(
      name = "Sharp.NotificationsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 480f)
        arcToRelative(
          80.09f,
          80.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          73.3f,
          -48f
        )
        horizontalLineTo(182.7f)
        arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 288f)
        verticalLineTo(227.47f)
        curveTo(400f, 157f, 372.64f, 95.61f, 304f, 80f)
        lineToRelative(-8f, -48f)
        horizontalLineTo(216f)
        lineToRelative(-8f, 48f)
        curveToRelative(-68.88f, 15.61f, -96f, 76.76f, -96f, 147.47f)
        verticalLineTo(288f)
        lineTo(64f, 352f)
        verticalLineToRelative(48f)
        horizontalLineTo(448f)
        verticalLineTo(352f)
        close()
      }
    }.build()

    return _NotificationsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsSharp: ImageVector? = null
