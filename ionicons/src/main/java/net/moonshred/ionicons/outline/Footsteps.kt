package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Footsteps: ImageVector
  get() {
    if (_FootstepsOutline != null) {
      return _FootstepsOutline!!
    }
    _FootstepsOutline = ImageVector.Builder(
      name = "Outline.FootstepsOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(200f, 246.84f)
        curveToRelative(8.81f, 58.62f, -7.33f, 90.67f, -52.91f, 97.41f)
        curveToRelative(-50.65f, 7.49f, -71.52f, -26.44f, -80.33f, -85.06f)
        curveToRelative(-11.85f, -78.88f, 16f, -127.94f, 55.71f, -131.1f)
        curveTo(158.61f, 125.22f, 191.18f, 188.23f, 200f, 246.84f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(223.65f, 409.53f)
        curveToRelative(3.13f, 33.28f, -14.86f, 64.34f, -42f, 69.66f)
        curveToRelative(-27.4f, 5.36f, -58.71f, -16.37f, -65.09f, -49.19f)
        reflectiveCurveToRelative(17.75f, -34.56f, 47.32f, -40.21f)
        reflectiveCurveTo(219.87f, 369.39f, 223.65f, 409.53f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(312f, 150.83f)
        curveToRelative(-8.81f, 58.62f, 7.33f, 90.67f, 52.9f, 97.41f)
        curveToRelative(50.66f, 7.49f, 71.52f, -26.44f, 80.33f, -85.06f)
        curveToRelative(11.86f, -78.89f, -16f, -128.22f, -55.7f, -131.1f)
        curveTo(353.13f, 29.44f, 320.82f, 92.21f, 312f, 150.83f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(288.35f, 313.53f)
        curveToRelative(-3.13f, 33.27f, 14.86f, 64.34f, 42f, 69.66f)
        curveToRelative(27.4f, 5.36f, 58.71f, -16.37f, 65.09f, -49.19f)
        reflectiveCurveToRelative(-17.75f, -34.56f, -47.32f, -40.22f)
        reflectiveCurveTo(292.13f, 273.38f, 288.35f, 313.53f)
        close()
      }
    }.build()

    return _FootstepsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FootstepsOutline: ImageVector? = null
