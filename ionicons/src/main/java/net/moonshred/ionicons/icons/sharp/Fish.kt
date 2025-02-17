package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Fish: ImageVector
  get() {
    if (_FishSharp != null) {
      return _FishSharp!!
    }
    _FishSharp = ImageVector.Builder(
      name = "Sharp.FishSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(335.45f, 256f)
        arcToRelative(
          214.83f,
          214.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          29.08f,
          -108f
        )
        lineToRelative(7.62f, -13.26f)
        arcToRelative(
          280.69f,
          280.69f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -48.64f,
          -7.15f
        )
        curveToRelative(-21.94f, -16.9f, -54.64f, -36.95f, -92.34f, -43.33f)
        lineTo(208f, 80f)
        lineToRelative(13.37f, 61.86f)
        curveTo(179.7f, 156f, 142.94f, 184.72f, 118.61f, 204.48f)
        quadToRelative(-7.06f, -5.91f, -14.78f, -11.55f)
        curveToRelative(-39.71f, -29f, -82.6f, -31.8f, -84.4f, -31.9f)
        lineTo(0f, 160f)
        lineToRelative(2.67f, 19.31f)
        curveToRelative(0.29f, 2f, 6.79f, 44.73f, 31.65f, 76.52f)
        curveTo(9.46f, 287.63f, 3f, 330.33f, 2.67f, 332.36f)
        lineTo(0f, 352f)
        lineToRelative(19.43f, -1.36f)
        curveToRelative(1.8f, -0.1f, 44.69f, -2.89f, 84.4f, -31.9f)
        quadToRelative(7.58f, -5.53f, 14.56f, -11.37f)
        curveToRelative(24.37f, 19.83f, 61.14f, 48.6f, 102.86f, 62.74f)
        lineTo(208f, 432f)
        lineToRelative(23.17f, -4.22f)
        curveToRelative(37.49f, -6.34f, 70.08f, -26.4f, 92f, -43.32f)
        arcToRelative(
          284.27f,
          284.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          49.32f,
          -7.23f
        )
        lineToRelative(-7.91f, -13.18f)
        arcTo(214.92f, 214.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 335.45f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(499.59f, 221.75f)
        curveToRelative(-5.85f, -9.88f, -16.54f, -24.9f, -34.19f, -40.28f)
        arcToRelative(
          209.82f,
          209.82f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -62f,
          -37f
        )
        lineTo(392.23f, 164f)
        arcToRelative(
          183.22f,
          183.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.09f,
          183.87f
        )
        lineToRelative(11.75f, 19.57f)
        arcToRelative(
          209.26f,
          209.26f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          61.42f,
          -36.49f
        )
        curveTo(497.05f, 303.47f, 512f, 269f, 512f, 256f)
        curveTo(512f, 243.69f, 504f, 229.26f, 499.59f, 221.75f)
        close()
        moveTo(416f, 256f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 256f)
        close()
      }
    }.build()

    return _FishSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FishSharp: ImageVector? = null
