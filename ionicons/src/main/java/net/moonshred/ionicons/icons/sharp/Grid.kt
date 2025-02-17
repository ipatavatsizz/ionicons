package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Grid: ImageVector
  get() {
    if (_GridSharp != null) {
      return _GridSharp!!
    }
    _GridSharp = ImageVector.Builder(
      name = "Sharp.GridSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 240f)
        horizontalLineTo(32f)
        verticalLineTo(32f)
        horizontalLineTo(240f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 240f)
        horizontalLineTo(272f)
        verticalLineTo(32f)
        horizontalLineTo(480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 480f)
        horizontalLineTo(32f)
        verticalLineTo(272f)
        horizontalLineTo(240f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 480f)
        horizontalLineTo(272f)
        verticalLineTo(272f)
        horizontalLineTo(480f)
        close()
      }
    }.build()

    return _GridSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GridSharp: ImageVector? = null
