package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoDribbble: ImageVector
  get() {
    if (_LogoDribbble != null) {
      return _LogoDribbble!!
    }
    _LogoDribbble = ImageVector.Builder(
      name = "Filled.LogoDribbble",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(132.33f, 32f, 32f, 132.33f, 32f, 256f)
        reflectiveCurveTo(132.33f, 480f, 256f, 480f)
        reflectiveCurveTo(480f, 379.78f, 480f, 256f)
        reflectiveCurveTo(379.67f, 32f, 256f, 32f)
        close()
        moveTo(398.22f, 135.25f)
        arcToRelative(
          186.36f,
          186.36f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          44f,
          108.38f
        )
        curveToRelative(-40.37f, -2.1f, -88.67f, -2.1f, -127.4f, 1.52f)
        curveToRelative(-4.9f, -12.37f, -9.92f, -24.5f, -15.4f, -36.17f)
        curveTo(344.08f, 189.62f, 378.5f, 164.18f, 398.22f, 135.25f)
        close()
        moveTo(256f, 69.33f)
        arcToRelative(
          185.81f,
          185.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          119.12f,
          42.94f
        )
        curveToRelative(-20.3f, 25.66f, -52.15f, 48f, -91.82f, 64.86f)
        curveTo(261.6f, 137f, 236.63f, 102.47f, 210f, 75.28f)
        arcTo(187.51f, 187.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 69.33f)
        close()
        moveTo(171.53f, 89.75f)
        curveToRelative(26.95f, 26.83f, 52.27f, 61f, 74.44f, 101f)
        curveTo(203.85f, 203.62f, 155.55f, 211f, 104f, 211f)
        curveToRelative(-9.8f, 0f, -19.36f, -0.35f, -28.81f, -0.94f)
        arcTo(186.78f, 186.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.53f, 89.75f)
        close()
        moveTo(69.68f, 247.13f)
        curveToRelative(10.62f, 0.47f, 21.35f, 0.7f, 32.2f, 0.59f)
        curveToRelative(58.8f, -0.7f, 113.52f, -9.92f, 160.54f, -25f)
        quadToRelative(6.65f, 13.83f, 12.6f, 28.35f)
        arcToRelative(
          115.43f,
          115.43f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -16.69f,
          5f
        )
        curveTo(194.05f, 283.07f, 143.42f, 326.58f, 116f, 379.2f)
        arcTo(186f, 186f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69.33f, 256f)
        curveTo(69.33f, 253f, 69.45f, 250.05f, 69.68f, 247.13f)
        close()
        moveTo(256f, 442.67f)
        arcToRelative(
          185.57f,
          185.57f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -114.45f,
          -39.32f
        )
        curveToRelative(24.85f, -49.23f, 69.18f, -90f, 125.07f, -115.27f)
        curveToRelative(5.25f, -2.45f, 12.25f, -4.43f, 20.3f, -6.18f)
        quadToRelative(10f, 27.64f, 17.85f, 57.4f)
        arcTo(678f, 678f, 0f, isMoreThanHalf = false, isPositiveArc = true, 322f, 430.42f)
        arcTo(185.06f, 185.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 442.67f)
        close()
        moveTo(356.92f, 412.92f)
        arcToRelative(
          672.61f,
          672.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -17.39f,
          -92.05f
        )
        curveToRelative(-4f, -15.17f, -8.51f, -29.87f, -13.41f, -44.22f)
        curveToRelative(36.63f, -3f, 80.5f, -2.57f, 115.38f, 0f)
        arcTo(186.5f, 186.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 356.92f, 412.92f)
        close()
      }
    }.build()

    return _LogoDribbble!!
  }

@Suppress("ObjectPropertyName")
private var _LogoDribbble: ImageVector? = null
