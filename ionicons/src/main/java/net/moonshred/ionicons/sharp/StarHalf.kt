package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.StarHalf: ImageVector
  get() {
    if (_StarHalfSharp != null) {
      return _StarHalfSharp!!
    }
    _StarHalfSharp = ImageVector.Builder(
      name = "Sharp.StarHalfSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 203.3f)
        horizontalLineTo(312.36f)
        lineTo(256f, 32f)
        lineTo(199.64f, 203.3f)
        horizontalLineTo(16f)
        lineTo(166.21f, 308.7f)
        lineTo(107.71f, 480f)
        lineTo(256f, 373.84f)
        lineTo(404.29f, 480f)
        lineTo(345.68f, 308.7f)
        close()
        moveTo(274.63f, 347.82f)
        lineTo(256f, 334.49f)
        verticalLineTo(134.39f)
        lineToRelative(26f, 78.91f)
        lineToRelative(7.24f, 22f)
        horizontalLineTo(394.63f)
        lineToRelative(-67.32f, 47.2f)
        lineToRelative(-19.69f, 13.81f)
        lineToRelative(7.78f, 22.75f)
        lineToRelative(26.26f, 76.75f)
        close()
      }
    }.build()

    return _StarHalfSharp!!
  }

@Suppress("ObjectPropertyName")
private var _StarHalfSharp: ImageVector? = null
