package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.BatteryDead: ImageVector
  get() {
    if (_BatteryDeadSharp != null) {
      return _BatteryDeadSharp!!
    }
    _BatteryDeadSharp = ImageVector.Builder(
      name = "Sharp.BatteryDeadSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(32f, 144f)
        horizontalLineToRelative(400f)
        verticalLineToRelative(224f)
        horizontalLineToRelative(-400f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(480f, 218.67f)
        lineTo(480f, 293.33f)
      }
    }.build()

    return _BatteryDeadSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BatteryDeadSharp: ImageVector? = null
