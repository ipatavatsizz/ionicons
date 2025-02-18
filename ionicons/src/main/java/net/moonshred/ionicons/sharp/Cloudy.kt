package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Cloudy: ImageVector
  get() {
    if (_CloudySharp != null) {
      return _CloudySharp!!
    }
    _CloudySharp = ImageVector.Builder(
      name = "Sharp.CloudySharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376f, 432f)
        horizontalLineTo(116f)
        curveToRelative(-32.37f, 0f, -60.23f, -8.57f, -80.59f, -24.77f)
        curveTo(12.24f, 388.78f, 0f, 361.39f, 0f, 328f)
        curveToRelative(0f, -61.85f, 48.44f, -95.34f, 97.75f, -102.64f)
        curveToRelative(6.52f, -41.18f, 24f, -76.4f, 51.11f, -102.46f)
        arcTo(153.57f, 153.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 80f)
        curveToRelative(35.5f, 0f, 68.24f, 11.69f, 94.68f, 33.8f)
        arcToRelative(
          156.42f,
          156.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          45.22f,
          63.61f
        )
        curveToRelative(30.26f, 4.81f, 57.45f, 17.18f, 77.38f, 35.36f)
        curveTo(498.61f, 235.88f, 512f, 267.42f, 512f, 304f)
        curveToRelative(0f, 36f, -14.38f, 68.88f, -40.49f, 92.59f)
        curveTo(446.36f, 419.43f, 412.44f, 432f, 376f, 432f)
        close()
      }
    }.build()

    return _CloudySharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudySharp: ImageVector? = null
