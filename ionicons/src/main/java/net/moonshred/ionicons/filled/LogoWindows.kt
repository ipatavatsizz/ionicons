package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoWindows: ImageVector
  get() {
    if (_LogoWindows != null) {
      return _LogoWindows!!
    }
    _LogoWindows = ImageVector.Builder(
      name = "Filled.LogoWindows",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 265f)
        horizontalLineTo(232f)
        verticalLineTo(444f)
        lineToRelative(248f, 36f)
        verticalLineTo(265f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(216f, 265f)
        horizontalLineTo(32f)
        verticalLineTo(415f)
        lineToRelative(184f, 26.7f)
        verticalLineTo(265f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 32f)
        lineTo(232f, 67.4f)
        verticalLineTo(249f)
        horizontalLineTo(480f)
        verticalLineTo(32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(216f, 69.7f)
        lineTo(32f, 96f)
        verticalLineTo(249f)
        horizontalLineTo(216f)
        verticalLineTo(69.7f)
        close()
      }
    }.build()

    return _LogoWindows!!
  }

@Suppress("ObjectPropertyName")
private var _LogoWindows: ImageVector? = null
