package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.FileTrayStacked: ImageVector
  get() {
    if (_FileTrayStackedSharp != null) {
      return _FileTrayStackedSharp!!
    }
    _FileTrayStackedSharp = ImageVector.Builder(
      name = "Sharp.FileTrayStackedSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 16f)
        horizontalLineTo(64f)
        lineTo(32f, 176f)
        verticalLineTo(320f)
        horizontalLineTo(480f)
        verticalLineTo(176f)
        close()
        moveTo(436f, 176f)
        horizontalLineTo(320f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -128f, 0f)
        horizontalLineTo(76f)
        lineTo(98f, 58f)
        horizontalLineTo(414f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 352f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -128f, 0f)
        horizontalLineTo(32f)
        verticalLineTo(496f)
        horizontalLineTo(480f)
        verticalLineTo(352f)
        close()
      }
    }.build()

    return _FileTrayStackedSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FileTrayStackedSharp: ImageVector? = null
