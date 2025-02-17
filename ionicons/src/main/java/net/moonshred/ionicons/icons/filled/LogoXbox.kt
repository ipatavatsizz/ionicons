package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoXbox: ImageVector
  get() {
    if (_LogoXbox != null) {
      return _LogoXbox!!
    }
    _LogoXbox = ImageVector.Builder(
      name = "Filled.LogoXbox",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(126.8f, 248.3f)
        curveToRelative(39.7f, -58.6f, 77.9f, -92.8f, 77.9f, -92.8f)
        reflectiveCurveToRelative(-42.1f, -48.9f, -92.8f, -67.4f)
        lineToRelative(-3.3f, -0.8f)
        arcTo(224.13f, 224.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 77.2f, 391f)
        curveTo(77.2f, 386.6f, 77.8f, 320.7f, 126.8f, 248.3f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 256f)
        arcTo(223.71f, 223.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 403.4f, 87.3f)
        lineToRelative(-3.2f, 0.9f)
        curveToRelative(-50.7f, 18.5f, -92.9f, 67.4f, -92.9f, 67.4f)
        reflectiveCurveToRelative(38.2f, 34.2f, 77.9f, 92.8f)
        curveToRelative(49f, 72.4f, 49.6f, 138.3f, 49.5f, 142.7f)
        arcTo(222.8f, 222.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(201.2f, 80.9f)
        curveToRelative(29.3f, 13.1f, 54.6f, 34.6f, 54.6f, 34.6f)
        reflectiveCurveToRelative(25.5f, -21.4f, 54.8f, -34.6f)
        curveToRelative(36.8f, -16.5f, 64.9f, -11.3f, 72.3f, -9.5f)
        arcToRelative(
          224.06f,
          224.06f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -253.8f,
          0f
        )
        curveTo(136.3f, 69.6f, 164.3f, 64.3f, 201.2f, 80.9f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(358.7f, 292.9f)
        curveTo(312.4f, 236f, 255.8f, 199f, 255.8f, 199f)
        reflectiveCurveToRelative(-56.3f, 37f, -102.7f, 93.9f)
        curveToRelative(-39.8f, 48.9f, -54.6f, 84.8f, -62.6f, 107.8f)
        lineToRelative(-1.3f, 4.8f)
        arcToRelative(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = false, 333.6f, 0f)
        lineToRelative(-1.4f, -4.8f)
        curveTo(413.4f, 377.7f, 398.5f, 341.8f, 358.7f, 292.9f)
        close()
      }
    }.build()

    return _LogoXbox!!
  }

@Suppress("ObjectPropertyName")
private var _LogoXbox: ImageVector? = null
