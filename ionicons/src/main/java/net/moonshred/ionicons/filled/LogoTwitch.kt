package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoTwitch: ImageVector
  get() {
    if (_LogoTwitch != null) {
      return _LogoTwitch!!
    }
    _LogoTwitch = ImageVector.Builder(
      name = "Filled.LogoTwitch",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 32f)
        lineTo(48f, 112f)
        verticalLineTo(416f)
        horizontalLineToRelative(96f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(64f)
        lineToRelative(64f, -64f)
        horizontalLineToRelative(80f)
        lineTo(464f, 304f)
        verticalLineTo(32f)
        close()
        moveTo(416f, 288f)
        lineToRelative(-64f, 64f)
        horizontalLineTo(256f)
        lineToRelative(-64f, 64f)
        verticalLineTo(352f)
        horizontalLineTo(112f)
        verticalLineTo(80f)
        horizontalLineTo(416f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 143f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(129f)
        horizontalLineToRelative(-48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(208f, 143f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(129f)
        horizontalLineToRelative(-48f)
        close()
      }
    }.build()

    return _LogoTwitch!!
  }

@Suppress("ObjectPropertyName")
private var _LogoTwitch: ImageVector? = null
