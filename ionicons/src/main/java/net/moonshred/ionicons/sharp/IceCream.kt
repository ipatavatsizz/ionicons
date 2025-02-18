package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.IceCream: ImageVector
  get() {
    if (_IceCreamSharp != null) {
      return _IceCreamSharp!!
    }
    _IceCreamSharp = ImageVector.Builder(
      name = "Sharp.IceCreamSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(359.72f, 112.37f)
        arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, -207.44f, 0f)
        arcTo(80.12f, 80.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 192f)
        curveToRelative(0f, 39.36f, 26.37f, 71.23f, 62.38f, 78.46f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.62f, 2f)
        verticalLineToRelative(38.83f)
        curveToRelative(0f, 21.84f, 17.2f, 40.22f, 39f, 40.74f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 41f, -40f)
        verticalLineTo(264.19f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.72f, -1.86f)
        arcTo(83.47f, 83.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 268f)
        arcToRelative(
          63.18f,
          63.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          42.24f,
          -16.59f
        )
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.74f, 0f)
        arcTo(74.63f, 74.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 272f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.72f, -159.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 300f)
        verticalLineToRelative(12f)
        arcToRelative(
          72.1f,
          72.1f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -58.21f,
          70.64f
        )
        lineTo(256f, 496f)
        lineToRelative(92.06f, -192.08f)
        arcToRelative(
          105.29f,
          105.29f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -49.18f,
          -14.36f
        )
        arcTo(93.75f, 93.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 300f)
        close()
      }
    }.build()

    return _IceCreamSharp!!
  }

@Suppress("ObjectPropertyName")
private var _IceCreamSharp: ImageVector? = null
