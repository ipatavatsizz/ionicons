package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.NotificationsOffCircle: ImageVector
  get() {
    if (_NotificationsOffCircleSharp != null) {
      return _NotificationsOffCircleSharp!!
    }
    _NotificationsOffCircleSharp = ImageVector.Builder(
      name = "Sharp.NotificationsOffCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(144f, 308f)
        lineToRelative(28f, -36f)
        lineTo(172f, 239.7f)
        arcToRelative(
          131.83f,
          131.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.34f,
          -25.42f
        )
        lineTo(285.92f, 336f)
        lineTo(144f, 336f)
        close()
        moveTo(256.18f, 384f)
        curveTo(233.6f, 384f, 216f, 373.75f, 216f, 352f)
        horizontalLineToRelative(80f)
        curveTo(295.7f, 373.37f, 278.55f, 384f, 256.18f, 384f)
        close()
        moveTo(349.66f, 380.26f)
        lineTo(138.66f, 153.26f)
        lineTo(162.34f, 131.74f)
        lineTo(373.34f, 358.74f)
        close()
        moveTo(368f, 330.85f)
        lineToRelative(-0.32f, -0.38f)
        lineToRelative(0f, 0f)
        lineToRelative(0f, 0f)
        lineTo(212.18f, 160.84f)
        arcTo(73.4f, 73.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 228f, 155.43f)
        lineTo(232f, 128f)
        horizontalLineToRelative(48f)
        lineToRelative(4f, 27.43f)
        curveToRelative(40f, 8.92f, 56f, 44f, 56f, 84.27f)
        lineTo(340f, 272f)
        lineToRelative(28f, 36f)
        close()
      }
    }.build()

    return _NotificationsOffCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NotificationsOffCircleSharp: ImageVector? = null
