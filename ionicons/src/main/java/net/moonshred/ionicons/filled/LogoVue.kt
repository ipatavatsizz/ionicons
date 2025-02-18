package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoVue: ImageVector
  get() {
    if (_LogoVue != null) {
      return _LogoVue!!
    }
    _LogoVue = ImageVector.Builder(
      name = "Filled.LogoVue",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 144.03f)
        lineToRelative(-55.49f, -96.11f)
        lineToRelative(-79.43f, 0f)
        lineToRelative(134.92f, 233.69f)
        lineToRelative(134.92f, -233.69f)
        lineToRelative(-79.43f, 0f)
        lineToRelative(-55.49f, 96.11f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(409.4f, 47.92f)
        lineToRelative(-153.4f, 265.69f)
        lineToRelative(-153.4f, -265.69f)
        lineToRelative(-86.86f, 0f)
        lineToRelative(240.26f, 416.16f)
        lineToRelative(240.26f, -416.16f)
        lineToRelative(-86.86f, 0f)
        close()
      }
    }.build()

    return _LogoVue!!
  }

@Suppress("ObjectPropertyName")
private var _LogoVue: ImageVector? = null
