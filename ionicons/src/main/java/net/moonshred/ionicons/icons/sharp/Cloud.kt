package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Cloud: ImageVector
  get() {
    if (_CloudSharp != null) {
      return _CloudSharp!!
    }
    _CloudSharp = ImageVector.Builder(
      name = "Sharp.CloudSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(396f, 432f)
        horizontalLineTo(136f)
        curveToRelative(-36.44f, 0f, -70.36f, -12.57f, -95.51f, -35.41f)
        curveTo(14.38f, 372.88f, 0f, 340f, 0f, 304f)
        curveToRelative(0f, -36.58f, 13.39f, -68.12f, 38.72f, -91.22f)
        curveToRelative(19.93f, -18.19f, 47.12f, -30.56f, 77.38f, -35.37f)
        arcToRelative(
          156.42f,
          156.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          45.22f,
          -63.61f
        )
        curveTo(187.76f, 91.69f, 220.5f, 80f, 256f, 80f)
        arcToRelative(
          153.57f,
          153.57f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          107.14f,
          42.9f
        )
        curveToRelative(27.06f, 26.06f, 44.59f, 61.28f, 51.11f, 102.46f)
        curveTo(463.56f, 232.66f, 512f, 266.15f, 512f, 328f)
        curveToRelative(0f, 33.39f, -12.24f, 60.78f, -35.41f, 79.23f)
        curveTo(456.23f, 423.43f, 428.37f, 432f, 396f, 432f)
        close()
      }
    }.build()

    return _CloudSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudSharp: ImageVector? = null
