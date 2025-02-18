package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CloudDone: ImageVector
  get() {
    if (_CloudDoneSharp != null) {
      return _CloudDoneSharp!!
    }
    _CloudDoneSharp = ImageVector.Builder(
      name = "Sharp.CloudDoneSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(414.25f, 225.36f)
        curveToRelative(-6.52f, -41.18f, -24.05f, -76.4f, -51.11f, -102.46f)
        arcTo(153.57f, 153.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 80f)
        curveToRelative(-35.5f, 0f, -68.24f, 11.69f, -94.68f, 33.8f)
        arcToRelative(
          156.42f,
          156.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -45.22f,
          63.61f
        )
        curveToRelative(-30.26f, 4.81f, -57.45f, 17.18f, -77.38f, 35.37f)
        curveTo(13.39f, 235.88f, 0f, 267.42f, 0f, 304f)
        curveToRelative(0f, 36f, 14.38f, 68.88f, 40.49f, 92.59f)
        curveTo(65.64f, 419.43f, 99.56f, 432f, 136f, 432f)
        lineTo(396f, 432f)
        curveToRelative(32.37f, 0f, 60.23f, -8.57f, 80.59f, -24.77f)
        curveTo(499.76f, 388.78f, 512f, 361.39f, 512f, 328f)
        curveTo(512f, 266.15f, 463.56f, 232.66f, 414.25f, 225.36f)
        close()
        moveTo(209.62f, 360.36f)
        lineTo(140.4f, 283.66f)
        lineTo(164.16f, 262.22f)
        lineTo(208.78f, 311.68f)
        lineTo(315.07f, 185.48f)
        lineTo(339.54f, 206.09f)
        close()
      }
    }.build()

    return _CloudDoneSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudDoneSharp: ImageVector? = null
