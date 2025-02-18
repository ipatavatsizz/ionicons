package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Shield: ImageVector
  get() {
    if (_ShieldSharp != null) {
      return _ShieldSharp!!
    }
    _ShieldSharp = ImageVector.Builder(
      name = "Sharp.ShieldSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(174f, 69.06f, 121.38f, 86.46f, 32f, 96f)
        curveToRelative(0f, 77.59f, 5.27f, 133.36f, 25.29f, 184.51f)
        arcToRelative(
          348.86f,
          348.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          71.43f,
          112.41f
        )
        curveTo(178.32f, 445.58f, 232.89f, 473.32f, 256f, 480f)
        curveToRelative(23.11f, -6.68f, 77.68f, -34.42f, 127.28f, -87.08f)
        arcToRelative(
          348.86f,
          348.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          71.43f,
          -112.41f
        )
        curveTo(474.73f, 229.36f, 480f, 173.59f, 480f, 96f)
        curveTo(390.62f, 86.46f, 338f, 69.06f, 256f, 32f)
        close()
      }
    }.build()

    return _ShieldSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShieldSharp: ImageVector? = null
