package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoAppleAppstore: ImageVector
  get() {
    if (_LogoAppleAppstore != null) {
      return _LogoAppleAppstore!!
    }
    _LogoAppleAppstore = ImageVector.Builder(
      name = "Filled.LogoAppleAppstore",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(132.26f, 32f, 32f, 132.26f, 32f, 256f)
        reflectiveCurveTo(132.26f, 480f, 256f, 480f)
        reflectiveCurveTo(480f, 379.74f, 480f, 256f)
        reflectiveCurveTo(379.74f, 32f, 256f, 32f)
        close()
        moveTo(171f, 353.89f)
        arcToRelative(
          15.48f,
          15.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -13.46f,
          7.65f
        )
        arcToRelative(
          14.91f,
          14.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -7.86f,
          -2.16f
        )
        arcToRelative(
          15.48f,
          15.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -5.6f,
          -21.21f
        )
        lineToRelative(15.29f, -25.42f)
        arcToRelative(8.73f, 8.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.54f, -4.3f)
        horizontalLineToRelative(2.26f)
        curveToRelative(11.09f, 0f, 18.85f, 6.67f, 21.11f, 13.13f)
        close()
        moveTo(300.45f, 303.89f)
        lineTo(200.32f, 304f)
        lineTo(133.77f, 304f)
        arcToRelative(
          15.46f,
          15.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -15.51f,
          -16.15f
        )
        curveToRelative(0.32f, -8.4f, 7.65f, -14.76f, 16f, -14.76f)
        horizontalLineToRelative(48.24f)
        lineToRelative(57.19f, -97.35f)
        horizontalLineToRelative(0f)
        lineToRelative(-18.52f, -31.55f)
        curveTo(217f, 137f, 218.85f, 127.52f, 226f, 123f)
        arcToRelative(
          15.57f,
          15.57f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          21.87f,
          5.17f
        )
        lineToRelative(9.9f, 16.91f)
        horizontalLineToRelative(0.11f)
        lineToRelative(9.91f, -16.91f)
        arcTo(15.58f, 15.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 289.6f, 123f)
        curveToRelative(7.11f, 4.52f, 8.94f, 14f, 4.74f, 21.22f)
        lineToRelative(-18.52f, 31.55f)
        lineToRelative(-18f, 30.69f)
        lineToRelative(-39.09f, 66.66f)
        verticalLineToRelative(0.11f)
        horizontalLineToRelative(57.61f)
        curveToRelative(7.22f, 0f, 16.27f, 3.88f, 19.93f, 10.12f)
        lineToRelative(0.32f, 0.65f)
        curveToRelative(3.23f, 5.49f, 5.06f, 9.26f, 5.06f, 14.75f)
        arcTo(13.82f, 13.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 300.48f, 303.92f)
        close()
        moveTo(378.2f, 304f)
        lineTo(351.09f, 304f)
        verticalLineToRelative(0.11f)
        lineToRelative(19.82f, 33.71f)
        arcToRelative(
          15.8f,
          15.8f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -5.17f,
          21.53f
        )
        arcToRelative(
          15.53f,
          15.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -8.08f,
          2.27f
        )
        arcTo(15.71f, 15.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344.2f, 354f)
        lineToRelative(-29.29f, -49.86f)
        lineToRelative(-18.2f, -31f)
        lineTo(273.23f, 233f)
        arcToRelative(
          38.35f,
          38.35f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -0.65f,
          -38f
        )
        curveToRelative(4.64f, -8.19f, 8.19f, -10.34f, 8.19f, -10.34f)
        lineTo(333f, 273f)
        horizontalLineToRelative(44.91f)
        curveToRelative(8.4f, 0f, 15.61f, 6.46f, 16f, 14.75f)
        arcTo(15.65f, 15.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 378.23f, 304f)
        close()
      }
    }.build()

    return _LogoAppleAppstore!!
  }

@Suppress("ObjectPropertyName")
private var _LogoAppleAppstore: ImageVector? = null
