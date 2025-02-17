package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoX: ImageVector
  get() {
    if (_LogoX != null) {
      return _LogoX!!
    }
    _LogoX = ImageVector.Builder(
      name = "Filled.LogoX",
      defaultWidth = 16.dp,
      defaultHeight = 16.dp,
      viewportWidth = 16f,
      viewportHeight = 16f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(9.333f, 6.929f)
        lineTo(14.546f, 1f)
        horizontalLineTo(13.311f)
        lineTo(8.783f, 6.147f)
        lineTo(5.169f, 1f)
        horizontalLineTo(1f)
        lineTo(6.466f, 8.783f)
        lineTo(1f, 15f)
        horizontalLineTo(2.235f)
        lineTo(7.014f, 9.564f)
        lineTo(10.831f, 15f)
        horizontalLineTo(15f)
        lineTo(9.333f, 6.929f)
        close()
        moveTo(7.641f, 8.852f)
        lineTo(7.087f, 8.076f)
        lineTo(2.68f, 1.911f)
        horizontalLineTo(4.578f)
        lineTo(8.135f, 6.888f)
        lineTo(8.687f, 7.664f)
        lineTo(13.31f, 14.133f)
        horizontalLineTo(11.413f)
        lineTo(7.641f, 8.852f)
        close()
      }
    }.build()

    return _LogoX!!
  }

@Suppress("ObjectPropertyName")
private var _LogoX: ImageVector? = null
