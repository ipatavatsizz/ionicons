package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoVenmo: ImageVector
  get() {
    if (_LogoVenmo != null) {
      return _LogoVenmo!!
    }
    _LogoVenmo = ImageVector.Builder(
      name = "Filled.LogoVenmo",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(444.17f, 32f)
        horizontalLineTo(70.28f)
        curveTo(49.85f, 32f, 32f, 46.7f, 32f, 66.89f)
        verticalLineTo(441.6f)
        curveTo(32f, 461.91f, 49.85f, 480f, 70.28f, 480f)
        horizontalLineTo(444.06f)
        curveTo(464.6f, 480f, 480f, 461.8f, 480f, 441.61f)
        verticalLineTo(66.89f)
        curveTo(480.12f, 46.7f, 464.6f, 32f, 444.17f, 32f)
        close()
        moveTo(278f, 387f)
        horizontalLineTo(174.32f)
        lineTo(132.75f, 138.44f)
        lineToRelative(90.75f, -8.62f)
        lineToRelative(22f, 176.87f)
        curveToRelative(20.53f, -33.45f, 45.88f, -86f, 45.88f, -121.87f)
        curveToRelative(0f, -19.62f, -3.36f, -33f, -8.61f, -44f)
        lineTo(365.4f, 124.1f)
        curveToRelative(9.56f, 15.78f, 13.86f, 32f, 13.86f, 52.57f)
        curveTo(379.25f, 242.17f, 323.34f, 327.26f, 278f, 387f)
        close()
      }
    }.build()

    return _LogoVenmo!!
  }

@Suppress("ObjectPropertyName")
private var _LogoVenmo: ImageVector? = null
