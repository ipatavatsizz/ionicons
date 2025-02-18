package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoTumblr: ImageVector
  get() {
    if (_LogoTumblr != null) {
      return _LogoTumblr!!
    }
    _LogoTumblr = ImageVector.Builder(
      name = "Filled.LogoTumblr",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(390f, 32f)
        horizontalLineTo(120f)
        curveToRelative(-49.19f, 0f, -88f, 38.81f, -88f, 88f)
        verticalLineTo(390f)
        curveToRelative(0f, 49.19f, 38.81f, 90f, 88f, 90f)
        horizontalLineTo(390f)
        curveToRelative(49.19f, 0f, 90f, -40.81f, 90f, -90f)
        verticalLineTo(120f)
        curveTo(480f, 70.81f, 439.19f, 32f, 390f, 32f)
        close()
        moveTo(336f, 396f)
        horizontalLineTo(284f)
        curveToRelative(-42.51f, 0f, -72f, -23.68f, -72f, -76f)
        verticalLineTo(240f)
        horizontalLineTo(176f)
        verticalLineTo(192f)
        curveToRelative(42.51f, -11f, 57.95f, -48.32f, 60f, -80f)
        horizontalLineToRelative(44f)
        verticalLineToRelative(72f)
        horizontalLineToRelative(52f)
        verticalLineToRelative(56f)
        horizontalLineTo(280f)
        lineToRelative(-0.39f, 70.51f)
        curveToRelative(0f, 21.87f, 11f, 29.43f, 28.62f, 29.43f)
        lineTo(336f, 340f)
        close()
      }
    }.build()

    return _LogoTumblr!!
  }

@Suppress("ObjectPropertyName")
private var _LogoTumblr: ImageVector? = null
