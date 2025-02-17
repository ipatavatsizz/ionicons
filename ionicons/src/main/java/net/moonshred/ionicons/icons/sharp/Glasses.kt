package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Glasses: ImageVector
  get() {
    if (_GlassesSharp != null) {
      return _GlassesSharp!!
    }
    _GlassesSharp = ImageVector.Builder(
      name = "Sharp.GlassesSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 176f)
        horizontalLineTo(16f)
        verticalLineToRelative(64f)
        horizontalLineTo(37.24f)
        lineTo(49.68f, 352f)
        horizontalLineTo(221.55f)
        lineTo(240f, 241.32f)
        verticalLineTo(240f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        verticalLineToRelative(1.32f)
        lineTo(290.45f, 352f)
        horizontalLineTo(462.32f)
        lineToRelative(12.44f, -112f)
        horizontalLineTo(496f)
        close()
      }
    }.build()

    return _GlassesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GlassesSharp: ImageVector? = null
