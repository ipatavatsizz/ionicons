package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoDeviantart: ImageVector
  get() {
    if (_LogoDeviantart != null) {
      return _LogoDeviantart!!
    }
    _LogoDeviantart = ImageVector.Builder(
      name = "Filled.LogoDeviantart",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 103.28f)
        lineToRelative(0f, -87.28f)
        lineToRelative(-0.03f, 0f)
        lineToRelative(-89.28f, 0f)
        lineToRelative(-8.9f, 8.78f)
        lineToRelative(-42.15f, 78.48f)
        lineToRelative(-13.25f, 8.74f)
        lineToRelative(-150.39f, 0f)
        lineToRelative(0f, 119.85f)
        lineToRelative(82.68f, 0f)
        lineToRelative(7.36f, 8.71f)
        lineToRelative(-90.04f, 168.16f)
        lineToRelative(0f, 87.28f)
        lineToRelative(0.02f, 0f)
        lineToRelative(89.28f, 0f)
        lineToRelative(8.91f, -8.79f)
        lineToRelative(42.14f, -78.48f)
        lineToRelative(13.26f, -8.73f)
        lineToRelative(150.39f, 0f)
        lineToRelative(0f, -119.87f)
        lineToRelative(-82.68f, 0f)
        lineToRelative(-7.36f, -8.75f)
        lineToRelative(90.04f, -168.1f)
        close()
      }
    }.build()

    return _LogoDeviantart!!
  }

@Suppress("ObjectPropertyName")
private var _LogoDeviantart: ImageVector? = null
