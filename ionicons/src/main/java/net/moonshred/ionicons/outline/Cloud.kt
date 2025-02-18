package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Cloud: ImageVector
  get() {
    if (_CloudOutline != null) {
      return _CloudOutline!!
    }
    _CloudOutline = ImageVector.Builder(
      name = "Outline.CloudOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 240f)
        curveToRelative(-8.89f, -89.54f, -71f, -144f, -144f, -144f)
        curveToRelative(-69f, 0f, -113.44f, 48.2f, -128f, 96f)
        curveTo(68f, 198f, 16f, 235.59f, 16f, 304f)
        curveToRelative(0f, 66f, 54f, 112f, 120f, 112f)
        horizontalLineTo(396f)
        curveToRelative(55f, 0f, 100f, -27.44f, 100f, -88f)
        curveTo(496f, 268.18f, 443f, 242.24f, 400f, 240f)
        close()
      }
    }.build()

    return _CloudOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudOutline: ImageVector? = null
