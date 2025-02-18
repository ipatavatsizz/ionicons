package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Hammer: ImageVector
  get() {
    if (_HammerSharp != null) {
      return _HammerSharp!!
    }
    _HammerSharp = ImageVector.Builder(
      name = "Sharp.HammerSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(294.28f, 256.9f)
        lineToRelative(-54.42f, -54.41f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17f, 0f)
        lineTo(12.45f, 401f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.27f, 17.2f)
        lineToRelative(66.05f, 66.28f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.22f, -0.23f)
        lineTo(294.26f, 273.89f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 294.28f, 256.9f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(499.33f, 199.33f)
        lineToRelative(-43.89f, -43.58f)
        arcToRelative(
          21.46f,
          21.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -15.28f,
          -6.26f
        )
        arcToRelative(
          21.89f,
          21.89f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -12.79f,
          4.14f
        )
        curveToRelative(0f, -0.43f, 0.06f, -0.85f, 0.09f, -1.22f)
        curveToRelative(0.45f, -6.5f, 1.15f, -16.32f, -5.2f, -25.22f)
        arcToRelative(
          258f,
          258f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -24.8f,
          -28.74f
        )
        arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -0.08f)
        curveToRelative(-13.32f, -13.12f, -42.31f, -37.83f, -86.72f, -55.94f)
        arcTo(139.55f, 139.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 257.56f, 32f)
        curveTo(226f, 32f, 202f, 46.24f, 192.81f, 54.68f)
        arcTo(53.4f, 53.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 86.17f)
        lineTo(192f, 96f)
        reflectiveCurveToRelative(8.06f, -2f, 13.86f, -3.39f)
        arcToRelative(
          62.73f,
          62.73f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          18.45f,
          -1.15f
        )
        curveTo(237.5f, 92.55f, 253.1f, 99.1f, 260f, 104.55f)
        curveToRelative(11.7f, 9.41f, 17.33f, 22.09f, 18.26f, 41.09f)
        curveToRelative(0.2f, 4.23f, -9.52f, 21.35f, -24.16f, 39.84f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.61f, 10.62f)
        lineToRelative(45.37f, 45.37f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 0.25f)
        curveToRelative(12.07f, -11f, 30.49f, -28f, 34.67f, -30.59f)
        curveToRelative(7.69f, -4.73f, 13.19f, -5.64f, 14.7f, -5.8f)
        arcToRelative(
          19.18f,
          19.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          11.29f,
          2.38f
        )
        arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, 0.95f)
        lineToRelative(-1.82f, 1.73f)
        lineToRelative(-0.3f, 0.28f)
        arcToRelative(
          21.52f,
          21.52f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0.05f,
          30.54f
        )
        lineToRelative(43.95f, 43.68f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.28f, 0f)
        lineToRelative(74.68f, -74.2f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 499.33f, 199.33f)
        close()
      }
    }.build()

    return _HammerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HammerSharp: ImageVector? = null
