package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bluetooth: ImageVector
  get() {
    if (_BluetoothSharp != null) {
      return _BluetoothSharp!!
    }
    _BluetoothSharp = ImageVector.Builder(
      name = "Sharp.BluetoothSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(397.41f, 161.13f)
        lineTo(236f, -0.28f)
        verticalLineToRelative(212.8f)
        lineTo(141.83f, 131.8f)
        lineToRelative(-26f, 30.37f)
        lineTo(225.27f, 256f)
        lineTo(115.8f, 349.83f)
        lineToRelative(26f, 30.37f)
        lineTo(236f, 299.48f)
        verticalLineToRelative(212.8f)
        lineTo(397.41f, 350.87f)
        lineTo(286.73f, 256f)
        close()
        moveTo(276f, 96.28f)
        lineToRelative(62.59f, 62.59f)
        lineTo(276f, 212.52f)
        close()
        moveTo(338.58f, 353.13f)
        lineTo(276f, 415.72f)
        lineTo(276f, 299.48f)
        close()
      }
    }.build()

    return _BluetoothSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BluetoothSharp: ImageVector? = null
