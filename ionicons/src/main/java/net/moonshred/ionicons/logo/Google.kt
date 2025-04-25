package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Google: ImageVector
  get() {
    if (_Google != null) {
      return _Google!!
    }
    _Google = ImageVector.Builder(
      name = "Logo.Google",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(473.16f, 221.48f)
        lineToRelative(-2.26f, -9.59f)
        horizontalLineTo(262.46f)
        verticalLineToRelative(88.22f)
        horizontalLineTo(387f)
        curveToRelative(-12.93f, 61.4f, -72.93f, 93.72f, -121.94f, 93.72f)
        curveToRelative(-35.66f, 0f, -73.25f, -15f, -98.13f, -39.11f)
        arcToRelative(
          140.08f,
          140.08f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -41.8f,
          -98.88f
        )
        curveToRelative(0f, -37.16f, 16.7f, -74.33f, 41f, -98.78f)
        reflectiveCurveToRelative(61f, -38.13f, 97.49f, -38.13f)
        curveToRelative(41.79f, 0f, 71.74f, 22.19f, 82.94f, 32.31f)
        lineToRelative(62.69f, -62.36f)
        curveTo(390.86f, 72.72f, 340.34f, 32f, 261.6f, 32f)
        horizontalLineToRelative(0f)
        curveToRelative(-60.75f, 0f, -119f, 23.27f, -161.58f, 65.71f)
        curveTo(58f, 139.5f, 36.25f, 199.93f, 36.25f, 256f)
        reflectiveCurveTo(56.83f, 369.48f, 97.55f, 411.6f)
        curveTo(141.06f, 456.52f, 202.68f, 480f, 266.13f, 480f)
        curveToRelative(57.73f, 0f, 112.45f, -22.62f, 151.45f, -63.66f)
        curveToRelative(38.34f, -40.4f, 58.17f, -96.3f, 58.17f, -154.9f)
        curveTo(475.75f, 236.77f, 473.27f, 222.12f, 473.16f, 221.48f)
        close()
      }
    }.build()

    return _Google!!
  }

@Suppress("ObjectPropertyName")
private var _Google: ImageVector? = null
