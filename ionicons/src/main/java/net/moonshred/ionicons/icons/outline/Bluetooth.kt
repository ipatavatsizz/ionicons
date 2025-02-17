package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bluetooth: ImageVector
  get() {
    if (_BluetoothOutline != null) {
      return _BluetoothOutline!!
    }
    _BluetoothOutline = ImageVector.Builder(
      name = "Outline.BluetoothOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 352f)
        lineToRelative(224f, -192f)
        lineToRelative(-112f, -112f)
        lineToRelative(0f, 416f)
        lineToRelative(112f, -112f)
        lineToRelative(-224f, -192f)
      }
    }.build()

    return _BluetoothOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BluetoothOutline: ImageVector? = null
