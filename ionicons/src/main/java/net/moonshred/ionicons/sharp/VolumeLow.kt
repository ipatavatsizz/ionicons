package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.VolumeLow: ImageVector
  get() {
    if (_VolumeLowSharp != null) {
      return _VolumeLowSharp!!
    }
    _VolumeLowSharp = ImageVector.Builder(
      name = "Sharp.VolumeLowSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(391.12f, 341.48f)
        lineToRelative(-28.6f, -14.36f)
        lineToRelative(7.18f, -14.3f)
        curveToRelative(9.49f, -18.9f, 14.3f, -38f, 14.3f, -56.82f)
        curveToRelative(0f, -19.36f, -4.66f, -37.92f, -14.25f, -56.73f)
        lineTo(362.48f, 185f)
        lineTo(391f, 170.48f)
        lineToRelative(7.26f, 14.25f)
        curveTo(410.2f, 208.16f, 416f, 231.47f, 416f, 256f)
        curveToRelative(0f, 23.83f, -6f, 47.78f, -17.7f, 71.18f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(189.65f, 176.1f)
        lineToRelative(-93.65f, 0f)
        lineToRelative(0f, 159.8f)
        lineToRelative(93.65f, 0f)
        lineToRelative(130.35f, 104.1f)
        lineToRelative(0f, -368f)
        lineToRelative(-130.35f, 104.1f)
        close()
      }
    }.build()

    return _VolumeLowSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeLowSharp: ImageVector? = null
