package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Edge: ImageVector
  get() {
    if (_Edge != null) {
      return _Edge!!
    }
    _Edge = ImageVector.Builder(
      name = "Logo.Edge",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(255.5f, 15f)
        horizontalLineToRelative(0f)
        curveToRelative(-132f, 0f, -240f, 108f, -240f, 240f)
        reflectiveCurveToRelative(108f, 240f, 240f, 240f)
        horizontalLineToRelative(0f)
        curveToRelative(85.4f, 0f, 160.8f, -45.2f, 203.3f, -112.9f)
        arcToRelative(6.87f, 6.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.1f, -9.7f)
        arcToRelative(
          108.64f,
          108.64f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -18.4f,
          8.6f
        )
        curveToRelative(-36.8f, 12.6f, -57.1f, 13.1f, -82.1f, 12f)
        curveToRelative(-27.9f, -1.2f, -61.9f, -10.8f, -85.8f, -25f)
        reflectiveCurveToRelative(-43.5f, -34.6f, -54.1f, -52.3f)
        reflectiveCurveToRelative(-17f, -39.9f, -14.1f, -68.3f)
        curveToRelative(2.9f, -29f, 29.4f, -52.6f, 60.4f, -52.6f)
        horizontalLineToRelative(0f)
        curveToRelative(33.5f, 0f, 60.8f, 26.6f, 60.8f, 60.1f)
        curveToRelative(0f, 17f, -8.1f, 31.7f, -18.5f, 43.5f)
        horizontalLineToRelative(0f)
        curveToRelative(-2.3f, 2.1f, -7.6f, 9.7f, 5.8f, 20f)
        curveToRelative(15.9f, 12.2f, 51.6f, 18f, 79.9f, 16.6f)
        reflectiveCurveToRelative(59.1f, -12.6f, 80.2f, -34.8f)
        curveToRelative(16.8f, -17.7f, 31.8f, -46.1f, 31.8f, -77.4f)
        curveTo(495.5f, 97.7f, 379.5f, 15f, 255.5f, 15f)
        close()
      }
    }.build()

    return _Edge!!
  }

@Suppress("ObjectPropertyName")
private var _Edge: ImageVector? = null
