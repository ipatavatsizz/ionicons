package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Binoculars: ImageVector
  get() {
    if (_BinocularsSharp != null) {
      return _BinocularsSharp!!
    }
    _BinocularsSharp = ImageVector.Builder(
      name = "Sharp.BinocularsSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(164f, 64f)
        curveTo(142.71f, 64f, 126.82f, 70.76f, 114.92f, 82.83f)
        curveTo(103.85f, 94.06f, 97.37f, 108.87f, 92.13f, 122.11f)
        lineTo(23.28f, 305.69f)
        curveTo(22.61f, 307.39f, 21.55f, 310.28f, 20.97f, 312.02f)
        curveTo(20.72f, 312.7f, 20.52f, 313.39f, 20.37f, 314.08f)
        curveTo(17.53f, 323.56f, 16f, 333.6f, 16f, 344f)
        curveTo(16f, 401.44f, 62.56f, 448f, 120f, 448f)
        curveTo(177.44f, 448f, 224f, 401.44f, 224f, 344f)
        verticalLineTo(283.54f)
        lineTo(224.04f, 283.53f)
        lineTo(288f, 283.54f)
        verticalLineTo(343.89f)
        lineTo(288f, 344f)
        curveTo(288f, 401.44f, 334.56f, 448f, 392f, 448f)
        curveTo(449.44f, 448f, 496f, 401.44f, 496f, 344f)
        curveTo(496f, 333.6f, 494.47f, 323.56f, 491.63f, 314.08f)
        curveTo(491.31f, 313f, 488.72f, 305.69f, 488.72f, 305.69f)
        lineTo(420.51f, 123.78f)
        lineTo(419.88f, 122.11f)
        curveTo(414.63f, 108.87f, 408.15f, 94.06f, 397.08f, 82.83f)
        curveTo(385.18f, 70.76f, 369.29f, 64f, 348f, 64f)
        curveTo(329.56f, 64f, 314.07f, 71.24f, 303.39f, 83.61f)
        curveTo(292.94f, 95.71f, 288f, 111.64f, 288f, 128f)
        verticalLineTo(162.81f)
        lineTo(224f, 162.81f)
        verticalLineTo(128f)
        curveTo(224f, 111.64f, 219.06f, 95.71f, 208.61f, 83.61f)
        curveTo(197.93f, 71.24f, 182.44f, 64f, 164f, 64f)
        close()
        moveTo(56f, 344f)
        curveTo(56f, 308.65f, 84.65f, 280f, 120f, 280f)
        curveTo(155.35f, 280f, 184f, 308.65f, 184f, 344f)
        curveTo(184f, 379.35f, 155.35f, 408f, 120f, 408f)
        curveTo(84.65f, 408f, 56f, 379.35f, 56f, 344f)
        close()
        moveTo(328f, 344f)
        curveTo(328f, 308.65f, 356.65f, 280f, 392f, 280f)
        curveTo(427.35f, 280f, 456f, 308.65f, 456f, 344f)
        curveTo(456f, 379.35f, 427.35f, 408f, 392f, 408f)
        curveTo(356.65f, 408f, 328f, 379.35f, 328f, 344f)
        close()
      }
    }.build()

    return _BinocularsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BinocularsSharp: ImageVector? = null
