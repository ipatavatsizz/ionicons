package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Leaf: ImageVector
  get() {
    if (_LeafSharp != null) {
      return _LeafSharp!!
    }
    _LeafSharp = ImageVector.Builder(
      name = "Sharp.LeafSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(150.38f, 253.68f)
        lineToRelative(21.94f, -23.3f)
        lineToRelative(11.65f, 11f)
        curveToRelative(73.63f, 69.36f, 147.51f, 111.56f, 234.45f, 133.07f)
        curveToRelative(11.73f, -32f, 12.77f, -67.22f, 2.64f, -101.58f)
        curveToRelative(-13.44f, -45.59f, -44.74f, -85.31f, -90.49f, -114.86f)
        curveToRelative(-40.25f, -26f, -76.6f, -32.09f, -115.09f, -38.54f)
        curveToRelative(-21.12f, -3.54f, -43f, -7.2f, -66.85f, -14.43f)
        curveTo(104.85f, 91.76f, 58.94f, 52.3f, 58.48f, 51.91f)
        lineTo(33.4f, 30.15f)
        lineTo(32f, 63.33f)
        curveToRelative(-0.1f, 2.56f, -2.42f, 63.57f, 14.22f, 147.77f)
        curveToRelative(17.58f, 89f, 50.24f, 155.85f, 97.07f, 198.63f)
        curveToRelative(38f, 34.69f, 87.62f, 53.9f, 136.93f, 53.9f)
        arcTo(185.88f, 185.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 308f, 461.56f)
        curveToRelative(41.72f, -6.32f, 76.43f, -27.27f, 96f, -57.75f)
        curveToRelative(-89.5f, -23.28f, -165.95f, -67.55f, -242f, -139.16f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(467.43f, 384.19f)
        curveToRelative(-16.83f, -2.59f, -33.13f, -5.84f, -49f, -9.77f)
        arcTo(158.49f, 158.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 406.3f, 400.1f)
        curveToRelative(-0.74f, 1.25f, -1.51f, 2.49f, -2.29f, 3.71f)
        arcToRelative(
          583.43f,
          583.43f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          58.55f,
          12f
        )
        lineToRelative(15.82f, 2.44f)
        lineToRelative(4.86f, -31.63f)
        close()
      }
    }.build()

    return _LeafSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LeafSharp: ImageVector? = null
