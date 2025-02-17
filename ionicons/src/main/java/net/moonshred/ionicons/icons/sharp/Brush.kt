package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Brush: ImageVector
  get() {
    if (_BrushSharp != null) {
      return _BrushSharp!!
    }
    _BrushSharp = ImageVector.Builder(
      name = "Sharp.BrushSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 96f)
        lineTo(416f, 32f)
        lineTo(172f, 292f)
        lineToRelative(64f, 64f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(142f, 320f)
        curveToRelative(-36.52f, 0f, -66f, 30.63f, -66f, 68.57f)
        curveToRelative(0f, 25.43f, -31f, 45.72f, -44f, 45.72f)
        curveTo(52.24f, 462.17f, 86.78f, 480f, 120f, 480f)
        curveToRelative(48.62f, 0f, 88f, -40.91f, 88f, -91.43f)
        curveTo(208f, 350.63f, 178.52f, 320f, 142f, 320f)
        close()
      }
    }.build()

    return _BrushSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BrushSharp: ImageVector? = null
