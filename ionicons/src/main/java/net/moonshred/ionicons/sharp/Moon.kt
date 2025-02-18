package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Moon: ImageVector
  get() {
    if (_MoonSharp != null) {
      return _MoonSharp!!
    }
    _MoonSharp = ImageVector.Builder(
      name = "Sharp.MoonSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(152.62f, 126.77f)
        curveToRelative(0f, -33f, 4.85f, -66.35f, 17.23f, -94.77f)
        curveTo(87.54f, 67.83f, 32f, 151.89f, 32f, 247.38f)
        curveTo(32f, 375.85f, 136.15f, 480f, 264.62f, 480f)
        curveToRelative(95.49f, 0f, 179.55f, -55.54f, 215.38f, -137.85f)
        curveToRelative(-28.42f, 12.38f, -61.8f, 17.23f, -94.77f, 17.23f)
        curveTo(256.76f, 359.38f, 152.62f, 255.24f, 152.62f, 126.77f)
        close()
      }
    }.build()

    return _MoonSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MoonSharp: ImageVector? = null
