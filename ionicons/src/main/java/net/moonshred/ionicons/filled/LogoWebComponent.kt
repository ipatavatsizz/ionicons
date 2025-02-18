package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoWebComponent: ImageVector
  get() {
    if (_LogoWebComponent != null) {
      return _LogoWebComponent!!
    }
    _LogoWebComponent = ImageVector.Builder(
      name = "Filled.LogoWebComponent",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 256f)
        lineToRelative(-120f, -208f)
        lineToRelative(-136.26f, 0f)
        lineToRelative(-43.84f, 76f)
        lineToRelative(136.21f, 0f)
        lineToRelative(76.15f, 132f)
        lineToRelative(-76.15f, 132f)
        lineToRelative(-136.21f, 0f)
        lineToRelative(43.84f, 76f)
        lineToRelative(136.26f, 0f)
        lineToRelative(120f, -208f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(179.9f, 388f)
        lineToRelative(-76.16f, -132f)
        lineToRelative(76.16f, -132f)
        lineToRelative(0f, 0f)
        lineToRelative(43.84f, -76f)
        lineToRelative(-87.74f, 0f)
        lineToRelative(-120f, 208f)
        lineToRelative(120f, 208f)
        lineToRelative(87.74f, 0f)
        lineToRelative(-43.84f, -76f)
        lineToRelative(0f, 0f)
        close()
      }
    }.build()

    return _LogoWebComponent!!
  }

@Suppress("ObjectPropertyName")
private var _LogoWebComponent: ImageVector? = null
