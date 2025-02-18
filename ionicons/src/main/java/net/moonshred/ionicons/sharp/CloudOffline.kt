package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CloudOffline: ImageVector
  get() {
    if (_CloudOfflineSharp != null) {
      return _CloudOfflineSharp!!
    }
    _CloudOfflineSharp = ImageVector.Builder(
      name = "Sharp.CloudOfflineSharp",
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
        moveTo(38.72f, 212.78f)
        curveTo(13.39f, 235.88f, 0f, 267.42f, 0f, 304f)
        curveToRelative(0f, 36f, 14.38f, 68.88f, 40.49f, 92.59f)
        curveTo(65.64f, 419.43f, 99.56f, 432f, 136f, 432f)
        horizontalLineTo(364.12f)
        lineTo(110.51f, 178.39f)
        curveTo(82.5f, 183.78f, 57.42f, 195.72f, 38.72f, 212.78f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(476.59f, 407.23f)
        curveTo(499.76f, 388.78f, 512f, 361.39f, 512f, 328f)
        curveToRelative(0f, -61.85f, -48.44f, -95.34f, -97.75f, -102.64f)
        curveToRelative(-6.52f, -41.18f, -24.05f, -76.4f, -51.11f, -102.46f)
        arcTo(153.57f, 153.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 80f)
        curveToRelative(-30.47f, 0f, -58.9f, 8.62f, -83.07f, 25f)
        lineTo(475.75f, 407.86f)
        curveTo(476f, 407.65f, 476.32f, 407.45f, 476.59f, 407.23f)
        close()
      }
    }.build()

    return _CloudOfflineSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudOfflineSharp: ImageVector? = null
