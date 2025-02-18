package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoStackoverflow: ImageVector
  get() {
    if (_LogoStackoverflow != null) {
      return _LogoStackoverflow!!
    }
    _LogoStackoverflow = ImageVector.Builder(
      name = "Filled.LogoStackoverflow",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(392f, 440f)
        verticalLineTo(320f)
        horizontalLineToRelative(40f)
        verticalLineTo(480f)
        horizontalLineTo(64f)
        verticalLineTo(320f)
        horizontalLineToRelative(40f)
        verticalLineTo(440f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(149.1f, 308.77f)
        lineToRelative(198.57f, 40.87f)
        lineToRelative(8.4f, -39.32f)
        lineTo(157.5f, 269.45f)
        close()
        moveTo(175.37f, 215.65f)
        lineTo(359.22f, 300f)
        lineTo(376f, 263.76f)
        lineTo(192.18f, 178.92f)
        close()
        moveTo(226.32f, 126.65f)
        lineTo(382.32f, 254.43f)
        lineTo(408.06f, 223.91f)
        lineTo(252.06f, 96.13f)
        close()
        moveTo(328f, 32f)
        lineTo(294.61f, 55.8f)
        lineTo(415.43f, 216.17f)
        lineTo(448f, 192f)
        close()
        moveTo(144f, 400f)
        lineTo(348f, 400f)
        lineTo(348f, 360f)
        lineTo(144f, 360f)
        close()
      }
    }.build()

    return _LogoStackoverflow!!
  }

@Suppress("ObjectPropertyName")
private var _LogoStackoverflow: ImageVector? = null
