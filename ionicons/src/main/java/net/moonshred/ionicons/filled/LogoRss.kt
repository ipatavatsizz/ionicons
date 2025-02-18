package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoRss: ImageVector
  get() {
    if (_LogoRss != null) {
      return _LogoRss!!
    }
    _LogoRss = ImageVector.Builder(
      name = "Filled.LogoRss",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(108.56f, 342.78f)
        arcToRelative(
          60.34f,
          60.34f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          60.56f,
          60.44f
        )
        arcTo(60.63f, 60.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108.56f, 342.78f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 186.67f)
        verticalLineToRelative(86.55f)
        curveToRelative(52f, 0f, 101.94f, 15.39f, 138.67f, 52.11f)
        reflectiveCurveToRelative(52f, 86.56f, 52f, 138.67f)
        horizontalLineToRelative(86.66f)
        curveTo(325.33f, 312.44f, 199.67f, 186.67f, 48f, 186.67f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 48f)
        verticalLineToRelative(86.56f)
        curveToRelative(185.25f, 0f, 329.22f, 144.08f, 329.22f, 329.44f)
        horizontalLineTo(464f)
        curveTo(464f, 234.66f, 277.67f, 48f, 48f, 48f)
        close()
      }
    }.build()

    return _LogoRss!!
  }

@Suppress("ObjectPropertyName")
private var _LogoRss: ImageVector? = null
