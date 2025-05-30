package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Flickr: ImageVector
  get() {
    if (_Flickr != null) {
      return _Flickr!!
    }
    _Flickr = ImageVector.Builder(
      name = "Logo.Flickr",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        horizontalLineToRelative(0f)
        curveTo(132.8f, 32f, 32f, 132.8f, 32f, 256f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 123.2f, 100.8f, 224f, 224f, 224f)
        horizontalLineToRelative(0f)
        curveToRelative(123.2f, 0f, 224f, -100.8f, 224f, -224f)
        horizontalLineToRelative(0f)
        curveTo(480f, 132.8f, 379.2f, 32f, 256f, 32f)
        close()
        moveTo(173.84f, 312f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 228f, 257.84f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 173.84f, 312f)
        close()
        moveTo(341.84f, 312f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 396f, 257.84f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 341.84f, 312f)
        close()
      }
    }.build()

    return _Flickr!!
  }

@Suppress("ObjectPropertyName")
private var _Flickr: ImageVector? = null
