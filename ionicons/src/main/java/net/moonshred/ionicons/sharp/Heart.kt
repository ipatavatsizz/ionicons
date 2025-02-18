package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Heart: ImageVector
  get() {
    if (_HeartSharp != null) {
      return _HeartSharp!!
    }
    _HeartSharp = ImageVector.Builder(
      name = "Sharp.HeartSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 448f)
        lineToRelative(-9f, -6f)
        curveToRelative(-42.78f, -28.57f, -96.91f, -60.86f, -137f, -108.32f)
        curveToRelative(-42.25f, -50f, -62.52f, -101.35f, -62f, -157f)
        curveTo(48.63f, 114.54f, 98.46f, 64f, 159.08f, 64f)
        curveToRelative(48.11f, 0f, 80.1f, 28f, 96.92f, 48.21f)
        curveTo(272.82f, 92f, 304.81f, 64f, 352.92f, 64f)
        curveTo(413.54f, 64f, 463.37f, 114.54f, 464f, 176.65f)
        curveToRelative(0.56f, 55.68f, -19.71f, 107f, -62f, 157f)
        curveTo(361.91f, 381.14f, 307.78f, 413.43f, 265f, 442f)
        close()
      }
    }.build()

    return _HeartSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HeartSharp: ImageVector? = null
