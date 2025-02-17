package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.NotificationsOff: ImageVector
  get() {
    if (_NotificationsOffSharp != null) {
      return _NotificationsOffSharp!!
    }
    _NotificationsOffSharp = ImageVector.Builder(
      name = "Sharp.NotificationsOffSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(41.37f, 64f)
        lineToRelative(22.63f, -22.63f)
        lineToRelative(406.63f, 406.63f)
        lineToRelative(-22.63f, 22.63f)
        close()
      }
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
        moveTo(112f, 227.47f)
        verticalLineTo(288f)
        lineTo(64f, 352f)
        verticalLineToRelative(48f)
        horizontalLineTo(332.12f)
        lineTo(115.87f, 183.75f)
        arcTo(236.75f, 236.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 227.47f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 352f)
        lineToRelative(-48f, -64f)
        verticalLineTo(227.47f)
        curveTo(400f, 157f, 372.64f, 95.61f, 304f, 80f)
        lineToRelative(-8f, -48f)
        horizontalLineTo(216f)
        lineToRelative(-8f, 48f)
        arcToRelative(
          117.45f,
          117.45f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -41.95f,
          18.17f
        )
        lineToRelative(282f, 282f)
        close()
      }
    }.build()

    return _NotificationsOffSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsOffSharp: ImageVector? = null
