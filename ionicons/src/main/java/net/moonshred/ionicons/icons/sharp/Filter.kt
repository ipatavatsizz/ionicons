package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Filter: ImageVector
  get() {
    if (_FilterSharp != null) {
      return _FilterSharp!!
    }
    _FilterSharp = ImageVector.Builder(
      name = "Sharp.FilterSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 120f)
        horizontalLineToRelative(480f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(-480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 232f)
        horizontalLineToRelative(320f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(-320f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 344f)
        horizontalLineToRelative(128f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(-128f)
        close()
      }
    }.build()

    return _FilterSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FilterSharp: ImageVector? = null
