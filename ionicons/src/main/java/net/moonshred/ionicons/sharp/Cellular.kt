package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Cellular: ImageVector
  get() {
    if (_CellularSharp != null) {
      return _CellularSharp!!
    }
    _CellularSharp = ImageVector.Builder(
      name = "Sharp.CellularSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 432f)
        horizontalLineTo(400f)
        verticalLineTo(80f)
        horizontalLineToRelative(96f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 432f)
        horizontalLineTo(272f)
        verticalLineTo(160f)
        horizontalLineToRelative(96f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 432f)
        horizontalLineTo(144f)
        verticalLineTo(224f)
        horizontalLineToRelative(96f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 432f)
        horizontalLineTo(16f)
        verticalLineTo(288f)
        horizontalLineToRelative(96f)
        close()
      }
    }.build()

    return _CellularSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CellularSharp: ImageVector? = null
