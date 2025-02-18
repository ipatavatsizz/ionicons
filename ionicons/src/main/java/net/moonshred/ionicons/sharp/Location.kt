package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Location: ImageVector
  get() {
    if (_LocationSharp != null) {
      return _LocationSharp!!
    }
    _LocationSharp = ImageVector.Builder(
      name = "Sharp.LocationSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(167.67f, 32f, 96f, 96.51f, 96f, 176f)
        curveToRelative(0f, 128f, 160f, 304f, 160f, 304f)
        reflectiveCurveTo(416f, 304f, 416f, 176f)
        curveTo(416f, 96.51f, 344.33f, 32f, 256f, 32f)
        close()
        moveTo(256f, 256f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, -64f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 256f)
        close()
      }
    }.build()

    return _LocationSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LocationSharp: ImageVector? = null
