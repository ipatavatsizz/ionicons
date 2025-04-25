package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Designernews: ImageVector
  get() {
    if (_Designernews != null) {
      return _Designernews!!
    }
    _Designernews = ImageVector.Builder(
      name = "Logo.Designernews",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(295.31f, 122.8f)
        lineToRelative(-72.45f, -58.8f)
        lineToRelative(72.68f, 122.64f)
        lineToRelative(-0.23f, -63.84f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(339.43f, 64f)
        verticalLineTo(259.6f)
        horizontalLineToRelative(-41.6f)
        lineTo(225.6f, 141.28f)
        lineToRelative(1.94f, 118.32f)
        horizontalLineTo(181.71f)
        verticalLineTo(131.2f)
        lineTo(139.09f, 96f)
        curveToRelative(1.14f, 1.44f, 2.28f, 2.88f, 3.31f, 4.44f)
        curveToRelative(11.43f, 16.68f, 17.14f, 36.6f, 17.14f, 60.6f)
        curveToRelative(0f, 59f, -35f, 98.52f, -87.88f, 98.52f)
        horizontalLineTo(0f)
        verticalLineToRelative(0.48f)
        lineTo(228.11f, 448f)
        horizontalLineTo(512f)
        verticalLineTo(205.72f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(111.89f, 162.52f)
        curveToRelative(0f, -34.8f, -16.23f, -54.12f, -45.38f, -54.12f)
        horizontalLineTo(44.57f)
        verticalLineTo(215.2f)
        horizontalLineTo(66.29f)
        curveTo(96f, 215.2f, 111.89f, 196.72f, 111.89f, 162.52f)
        close()
      }
    }.build()

    return _Designernews!!
  }

@Suppress("ObjectPropertyName")
private var _Designernews: ImageVector? = null
