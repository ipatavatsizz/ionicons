package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoPaypal: ImageVector
  get() {
    if (_LogoPaypal != null) {
      return _LogoPaypal!!
    }
    _LogoPaypal = ImageVector.Builder(
      name = "Filled.LogoPaypal",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(424.81f, 148.79f)
        curveToRelative(-0.43f, 2.76f, -0.93f, 5.58f, -1.49f, 8.48f)
        curveToRelative(-19.17f, 98f, -84.76f, 131.8f, -168.54f, 131.8f)
        horizontalLineTo(212.13f)
        arcToRelative(
          20.67f,
          20.67f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -20.47f,
          17.46f
        )
        lineTo(169.82f, 444.37f)
        lineToRelative(-6.18f, 39.07f)
        arcToRelative(
          10.86f,
          10.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          9.07f,
          12.42f
        )
        arcToRelative(
          10.72f,
          10.72f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.7f,
          0.13f
        )
        horizontalLineToRelative(75.65f)
        arcToRelative(
          18.18f,
          18.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          18f,
          -15.27f
        )
        lineToRelative(0.74f, -3.83f)
        lineToRelative(14.24f, -90f)
        lineToRelative(0.91f, -4.94f)
        arcToRelative(18.16f, 18.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, -15.3f)
        horizontalLineToRelative(11.31f)
        curveToRelative(73.3f, 0f, 130.67f, -29.62f, 147.44f, -115.32f)
        curveToRelative(7f, -35.8f, 3.38f, -65.69f, -15.16f, -86.72f)
        arcTo(72.27f, 72.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 424.81f, 148.79f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(385.52f, 51.09f)
        curveTo(363.84f, 26.52f, 324.71f, 16f, 274.63f, 16f)
        horizontalLineTo(129.25f)
        arcToRelative(
          20.75f,
          20.75f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -20.54f,
          17.48f
        )
        lineToRelative(-60.55f, 382f)
        arcToRelative(
          12.43f,
          12.43f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          10.39f,
          14.22f
        )
        arcToRelative(
          12.58f,
          12.58f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.94f,
          0.15f
        )
        horizontalLineToRelative(89.76f)
        lineToRelative(22.54f, -142.29f)
        lineToRelative(-0.7f, 4.46f)
        arcToRelative(
          20.67f,
          20.67f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          20.47f,
          -17.46f
        )
        horizontalLineToRelative(42.65f)
        curveToRelative(83.77f, 0f, 149.36f, -33.86f, 168.54f, -131.8f)
        curveToRelative(0.57f, -2.9f, 1.05f, -5.72f, 1.49f, -8.48f)
        horizontalLineToRelative(0f)
        curveTo(410.94f, 98.06f, 405.19f, 73.41f, 385.52f, 51.09f)
        close()
      }
    }.build()

    return _LogoPaypal!!
  }

@Suppress("ObjectPropertyName")
private var _LogoPaypal: ImageVector? = null
