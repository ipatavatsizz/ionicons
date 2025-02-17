package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.BatteryFull: ImageVector
  get() {
    if (_BatteryFullSharp != null) {
      return _BatteryFullSharp!!
    }
    _BatteryFullSharp = ImageVector.Builder(
      name = "Sharp.BatteryFullSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(17f, 384f)
        horizontalLineTo(449f)
        verticalLineTo(128f)
        horizontalLineTo(17f)
        close()
        moveTo(49f, 160f)
        horizontalLineTo(417f)
        verticalLineTo(352f)
        horizontalLineTo(49f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(70.69f, 182.94f)
        horizontalLineToRelative(324.63f)
        verticalLineToRelative(146.13f)
        horizontalLineToRelative(-324.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(465f, 202.67f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(106.67f)
        horizontalLineToRelative(-32f)
        close()
      }
    }.build()

    return _BatteryFullSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BatteryFullSharp: ImageVector? = null
