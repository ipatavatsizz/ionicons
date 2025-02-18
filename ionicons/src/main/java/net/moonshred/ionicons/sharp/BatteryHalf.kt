package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.BatteryHalf: ImageVector
  get() {
    if (_BatteryHalfSharp != null) {
      return _BatteryHalfSharp!!
    }
    _BatteryHalfSharp = ImageVector.Builder(
      name = "Sharp.BatteryHalfSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(70.69f, 182.92f)
        horizontalLineToRelative(185.31f)
        verticalLineToRelative(146.16f)
        horizontalLineToRelative(-185.31f)
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

    return _BatteryHalfSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BatteryHalfSharp: ImageVector? = null
