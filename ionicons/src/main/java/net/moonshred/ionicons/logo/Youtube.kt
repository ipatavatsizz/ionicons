package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Youtube: ImageVector
  get() {
    if (_Youtube != null) {
      return _Youtube!!
    }
    _Youtube = ImageVector.Builder(
      name = "Logo.Youtube",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(508.64f, 148.79f)
        curveToRelative(0f, -45f, -33.1f, -81.2f, -74f, -81.2f)
        curveTo(379.24f, 65f, 322.74f, 64f, 265f, 64f)
        horizontalLineTo(247f)
        curveToRelative(-57.6f, 0f, -114.2f, 1f, -169.6f, 3.6f)
        curveToRelative(-40.8f, 0f, -73.9f, 36.4f, -73.9f, 81.4f)
        curveTo(1f, 184.59f, -0.06f, 220.19f, 0f, 255.79f)
        quadToRelative(-0.15f, 53.4f, 3.4f, 106.9f)
        curveToRelative(0f, 45f, 33.1f, 81.5f, 73.9f, 81.5f)
        curveToRelative(58.2f, 2.7f, 117.9f, 3.9f, 178.6f, 3.8f)
        quadToRelative(91.2f, 0.3f, 178.6f, -3.8f)
        curveToRelative(40.9f, 0f, 74f, -36.5f, 74f, -81.5f)
        curveToRelative(2.4f, -35.7f, 3.5f, -71.3f, 3.4f, -107f)
        quadTo(512.24f, 202.29f, 508.64f, 148.79f)
        close()
        moveTo(207f, 353.89f)
        verticalLineTo(157.39f)
        lineToRelative(145f, 98.2f)
        close()
      }
    }.build()

    return _Youtube!!
  }

@Suppress("ObjectPropertyName")
private var _Youtube: ImageVector? = null
