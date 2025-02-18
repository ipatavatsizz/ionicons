package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ChevronCollapse: ImageVector
  get() {
    if (_ChevronCollapse != null) {
      return _ChevronCollapse!!
    }
    _ChevronCollapse = ImageVector.Builder(
      name = "Filled.ChevronCollapse",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(117.86f, 88.28f)
        curveToRelative(-8.68f, 10.02f, -7.6f, 25.17f, 2.42f, 33.85f)
        lineToRelative(120f, 104f)
        curveToRelative(9.02f, 7.82f, 22.42f, 7.82f, 31.44f, 0f)
        lineToRelative(120f, -104f)
        curveToRelative(10.02f, -8.68f, 11.1f, -23.84f, 2.42f, -33.85f)
        reflectiveCurveToRelative(-23.84f, -11.1f, -33.85f, -2.42f)
        lineTo(256f, 176.24f)
        lineTo(151.72f, 85.86f)
        curveToRelative(-10.02f, -8.68f, -25.17f, -7.6f, -33.85f, 2.42f)
        close()
        moveTo(117.86f, 423.72f)
        curveToRelative(-8.68f, -10.02f, -7.6f, -25.17f, 2.42f, -33.85f)
        lineToRelative(120f, -104f)
        curveToRelative(9.02f, -7.82f, 22.42f, -7.82f, 31.44f, 0f)
        lineToRelative(120f, 104f)
        curveToRelative(10.02f, 8.68f, 11.1f, 23.84f, 2.42f, 33.85f)
        reflectiveCurveToRelative(-23.84f, 11.1f, -33.85f, 2.42f)
        lineTo(256f, 335.76f)
        lineToRelative(-104.28f, 90.38f)
        curveToRelative(-10.02f, 8.68f, -25.17f, 7.6f, -33.85f, -2.42f)
        close()
      }
    }.build()

    return _ChevronCollapse!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronCollapse: ImageVector? = null
