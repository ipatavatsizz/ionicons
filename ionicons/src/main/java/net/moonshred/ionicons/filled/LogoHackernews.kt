package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoHackernews: ImageVector
  get() {
    if (_LogoHackernews != null) {
      return _LogoHackernews!!
    }
    _LogoHackernews = ImageVector.Builder(
      name = "Filled.LogoHackernews",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 32f)
        verticalLineTo(480f)
        horizontalLineTo(480f)
        verticalLineTo(32f)
        close()
        moveTo(281.67f, 282.83f)
        verticalLineToRelative(84f)
        horizontalLineTo(235f)
        verticalLineToRelative(-84f)
        lineToRelative(-77f, -140f)
        horizontalLineTo(213f)
        lineToRelative(46.32f, 97.54f)
        lineToRelative(44.33f, -97.54f)
        horizontalLineToRelative(52.73f)
        close()
      }
    }.build()

    return _LogoHackernews!!
  }

@Suppress("ObjectPropertyName")
private var _LogoHackernews: ImageVector? = null
