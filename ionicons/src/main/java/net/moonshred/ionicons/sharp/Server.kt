package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Server: ImageVector
  get() {
    if (_ServerSharp != null) {
      return _ServerSharp!!
    }
    _ServerSharp = ImageVector.Builder(
      name = "Sharp.ServerSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(125.29f, 40.73f)
        curveTo(159.8f, 25.16f, 206.27f, 16f, 256.5f, 16f)
        curveTo(306.73f, 16f, 352.97f, 25.16f, 387.25f, 40.75f)
        curveTo(420.14f, 55.71f, 448f, 80f, 448f, 112f)
        verticalLineTo(112.03f)
        curveTo(447.99f, 117.56f, 444.9f, 125.92f, 435.7f, 136.25f)
        curveTo(426.71f, 146.35f, 413.09f, 156.91f, 395.43f, 166.51f)
        curveTo(360.16f, 185.7f, 310.79f, 200f, 256f, 200f)
        curveTo(201.21f, 200f, 151.84f, 185.7f, 116.57f, 166.51f)
        curveTo(98.91f, 156.91f, 85.29f, 146.35f, 76.3f, 136.25f)
        curveTo(67.08f, 125.9f, 64f, 117.53f, 64f, 112f)
        curveTo(64f, 79.57f, 92.25f, 55.64f, 125.29f, 40.73f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(410.72f, 194.62f)
        curveTo(424.94f, 186.89f, 437.56f, 176.24f, 448f, 165.02f)
        verticalLineTo(258f)
        curveTo(448f, 263.53f, 444.92f, 269.9f, 435.7f, 280.25f)
        curveTo(426.71f, 290.35f, 413.09f, 300.91f, 395.43f, 310.51f)
        curveTo(360.16f, 329.7f, 310.79f, 344f, 256f, 344f)
        curveTo(201.21f, 344f, 151.84f, 329.7f, 116.57f, 310.51f)
        curveTo(98.91f, 300.91f, 85.29f, 290.35f, 76.3f, 280.25f)
        curveTo(67.08f, 269.9f, 64f, 263.53f, 64f, 258f)
        verticalLineTo(165.02f)
        curveTo(74.44f, 176.24f, 87.06f, 186.89f, 101.28f, 194.62f)
        curveTo(141.29f, 216.39f, 195.92f, 232f, 256f, 232f)
        curveTo(316.08f, 232f, 370.71f, 216.39f, 410.72f, 194.62f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 309.02f)
        verticalLineTo(400f)
        curveTo(64f, 432.22f, 92f, 456.17f, 124.93f, 471.13f)
        curveTo(159.3f, 486.76f, 205.65f, 496f, 256f, 496f)
        curveTo(306.35f, 496f, 352.7f, 486.76f, 387.07f, 471.13f)
        curveTo(420f, 456.17f, 448f, 432.22f, 448f, 400f)
        verticalLineTo(309.02f)
        curveTo(437.56f, 320.24f, 424.94f, 330.89f, 410.72f, 338.62f)
        curveTo(370.71f, 360.39f, 316.08f, 376f, 256f, 376f)
        curveTo(195.92f, 376f, 141.29f, 360.39f, 101.28f, 338.62f)
        curveTo(87.06f, 330.89f, 74.44f, 320.24f, 64f, 309.02f)
        close()
      }
    }.build()

    return _ServerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ServerSharp: ImageVector? = null
