package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoChrome: ImageVector
  get() {
    if (_LogoChrome != null) {
      return _LogoChrome!!
    }
    _LogoChrome = ImageVector.Builder(
      name = "Filled.LogoChrome",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(188.8f, 255.93f)
        arcTo(67.2f, 67.2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 256f, 188.75f)
        arcTo(67.38f, 67.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188.8f, 255.93f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(476.75f, 217.79f)
        reflectiveCurveToRelative(0f, 0f, 0f, 0.05f)
        arcToRelative(
          206.63f,
          206.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -7f,
          -28.84f
        )
        horizontalLineToRelative(-0.11f)
        arcToRelative(
          202.16f,
          202.16f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          7.07f,
          29f
        )
        horizontalLineToRelative(0f)
        arcToRelative(
          203.5f,
          203.5f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -7.07f,
          -29f
        )
        horizontalLineTo(314.24f)
        curveToRelative(19.05f, 17f, 31.36f, 40.17f, 31.36f, 67.05f)
        arcToRelative(
          86.55f,
          86.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -12.31f,
          44.73f
        )
        lineTo(231f, 478.45f)
        arcToRelative(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.27f)
        verticalLineTo(479f)
        horizontalLineToRelative(0f)
        verticalLineToRelative(-0.26f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 480f)
        curveToRelative(6.84f, 0f, 13.61f, -0.39f, 20.3f, -1f)
        arcToRelative(
          222.91f,
          222.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          29.78f,
          -4.74f
        )
        curveTo(405.68f, 451.52f, 480f, 362.4f, 480f, 255.94f)
        arcTo(225.25f, 225.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 476.75f, 217.79f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 345.5f)
        curveToRelative(-33.6f, 0f, -61.6f, -17.91f, -77.29f, -44.79f)
        lineTo(76f, 123.05f)
        lineToRelative(-0.14f, -0.24f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = false, 207.4f, 474.55f)
        lineToRelative(0f, -0.05f)
        lineToRelative(77.69f, -134.6f)
        arcTo(84.13f, 84.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 345.5f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(91.29f, 104.57f)
        lineToRelative(77.35f, 133.25f)
        arcTo(89.19f, 89.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 166f)
        horizontalLineTo(461.17f)
        arcToRelative(
          246.51f,
          246.51f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -25.78f,
          -43.94f
        )
        lineToRelative(0.12f, 0.08f)
        arcTo(245.26f, 245.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 461.17f, 166f)
        horizontalLineToRelative(0.17f)
        arcToRelative(
          245.91f,
          245.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -25.66f,
          -44f
        )
        arcToRelative(
          2.63f,
          2.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -0.35f,
          -0.26f
        )
        arcTo(223.93f, 223.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.14f, 104.34f)
        lineToRelative(0.14f, 0.24f)
        close()
      }
    }.build()

    return _LogoChrome!!
  }

@Suppress("ObjectPropertyName")
private var _LogoChrome: ImageVector? = null
