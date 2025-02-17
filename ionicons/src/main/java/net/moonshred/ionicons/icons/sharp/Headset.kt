package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Headset: ImageVector
  get() {
    if (_HeadsetSharp != null) {
      return _HeadsetSharp!!
    }
    _HeadsetSharp = ImageVector.Builder(
      name = "Sharp.HeadsetSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(411.16f, 97.45f)
        curveTo(368.43f, 55.85f, 311.88f, 32f, 256f, 32f)
        reflectiveCurveTo(143.57f, 55.85f, 100.84f, 97.45f)
        curveTo(56.45f, 140.67f, 32f, 196f, 32f, 256f)
        reflectiveCurveTo(58.84f, 374.49f, 77.42f, 408.25f)
        reflectiveCurveTo(121f, 480f, 144f, 480f)
        curveToRelative(32f, 0f, 96f, -32f, 96f, -32f)
        lineTo(128f, 240f)
        lineTo(73.58f, 271.73f)
        arcToRelative(
          176.07f,
          176.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1f,
          -18.84f
        )
        curveToRelative(0f, -48.57f, 19.32f, -94.1f, 56.15f, -130f)
        curveTo(164.24f, 88.34f, 210f, 70f, 256f, 70f)
        reflectiveCurveToRelative(91.73f, 18.34f, 127.27f, 52.93f)
        curveToRelative(36.83f, 35.86f, 56.14f, 81.39f, 56.14f, 130f)
        arcToRelative(
          175.56f,
          175.56f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1f,
          18.82f
        )
        lineTo(384f, 240f)
        lineTo(272f, 448f)
        reflectiveCurveToRelative(64f, 32f, 96f, 32f)
        curveToRelative(23f, 0f, 48f, -38f, 66.58f, -71.75f)
        reflectiveCurveTo(480f, 316f, 480f, 256f)
        reflectiveCurveTo(455.55f, 140.67f, 411.16f, 97.45f)
        close()
      }
    }.build()

    return _HeadsetSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HeadsetSharp: ImageVector? = null
