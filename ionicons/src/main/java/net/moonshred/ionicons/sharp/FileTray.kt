package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.FileTray: ImageVector
  get() {
    if (_FileTraySharp != null) {
      return _FileTraySharp!!
    }
    _FileTraySharp = ImageVector.Builder(
      name = "Sharp.FileTraySharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 64f)
        horizontalLineTo(64f)
        lineTo(32f, 256f)
        verticalLineTo(448f)
        horizontalLineTo(480f)
        verticalLineTo(256f)
        close()
        moveTo(436f, 256f)
        horizontalLineTo(320f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -128f, 0f)
        horizontalLineTo(76f)
        lineTo(98f, 106f)
        horizontalLineTo(414f)
        close()
      }
    }.build()

    return _FileTraySharp!!
  }

@Suppress("ObjectPropertyName")
private var _FileTraySharp: ImageVector? = null
