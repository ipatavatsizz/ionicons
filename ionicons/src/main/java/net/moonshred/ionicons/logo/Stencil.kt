package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Stencil: ImageVector
  get() {
    if (_Stencil != null) {
      return _Stencil!!
    }
    _Stencil = ImageVector.Builder(
      name = "Logo.Stencil",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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

    return _Stencil!!
  }

@Suppress("ObjectPropertyName")
private var _Stencil: ImageVector? = null
