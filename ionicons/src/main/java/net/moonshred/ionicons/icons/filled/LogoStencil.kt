package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoStencil: ImageVector
  get() {
    if (_LogoStencil != null) {
      return _LogoStencil!!
    }
    _LogoStencil = ImageVector.Builder(
      name = "Filled.LogoStencil",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(188.8f, 334.07f)
        horizontalLineTo(386.13f)
        lineTo(279.47f, 448f)
        horizontalLineTo(83.2f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(512f, 199f)
        horizontalLineTo(106.61f)
        lineTo(0f, 313f)
        horizontalLineTo(405.39f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(232.2f, 64f)
        horizontalLineTo(428.8f)
        lineTo(322.62f, 177.93f)
        horizontalLineTo(125.87f)
        close()
      }
    }.build()

    return _LogoStencil!!
  }

@Suppress("ObjectPropertyName")
private var _LogoStencil: ImageVector? = null
