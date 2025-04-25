package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Vue: ImageVector
  get() {
    if (_Vue != null) {
      return _Vue!!
    }
    _Vue = ImageVector.Builder(
      name = "Logo.Vue",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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

    return _Vue!!
  }

@Suppress("ObjectPropertyName")
private var _Vue: ImageVector? = null
