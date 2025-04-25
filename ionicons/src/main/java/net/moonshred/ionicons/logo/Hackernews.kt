package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Hackernews: ImageVector
  get() {
    if (_Hackernews != null) {
      return _Hackernews!!
    }
    _Hackernews = ImageVector.Builder(
      name = "Logo.Hackernews",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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

    return _Hackernews!!
  }

@Suppress("ObjectPropertyName")
private var _Hackernews: ImageVector? = null
