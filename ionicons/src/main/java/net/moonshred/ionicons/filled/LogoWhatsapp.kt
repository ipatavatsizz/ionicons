package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoWhatsapp: ImageVector
  get() {
    if (_LogoWhatsapp != null) {
      return _LogoWhatsapp!!
    }
    _LogoWhatsapp = ImageVector.Builder(
      name = "Filled.LogoWhatsapp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(414.73f, 97.1f)
        arcTo(222.14f, 222.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256.94f, 32f)
        curveTo(134f, 32f, 33.92f, 131.58f, 33.87f, 254f)
        arcTo(220.61f, 220.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.65f, 365f)
        lineTo(32f, 480f)
        lineToRelative(118.25f, -30.87f)
        arcToRelative(
          223.63f,
          223.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          106.6f,
          27f
        )
        horizontalLineToRelative(0.09f)
        curveToRelative(122.93f, 0f, 223f, -99.59f, 223.06f, -222f)
        arcTo(220.18f, 220.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 414.73f, 97.1f)
        close()
        moveTo(256.94f, 438.66f)
        horizontalLineToRelative(-0.08f)
        arcToRelative(
          185.75f,
          185.75f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -94.36f,
          -25.72f
        )
        lineToRelative(-6.77f, -4f)
        lineTo(85.56f, 427.26f)
        lineToRelative(18.73f, -68.09f)
        lineToRelative(-4.41f, -7f)
        arcTo(183.46f, 183.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.53f, 254f)
        curveToRelative(0f, -101.73f, 83.21f, -184.5f, 185.48f, -184.5f)
        arcTo(185f, 185f, 0f, isMoreThanHalf = false, isPositiveArc = true, 442.34f, 254.14f)
        curveTo(442.3f, 355.88f, 359.13f, 438.66f, 256.94f, 438.66f)
        close()
        moveTo(358.63f, 300.47f)
        curveToRelative(-5.57f, -2.78f, -33f, -16.2f, -38.08f, -18.05f)
        reflectiveCurveToRelative(-8.83f, -2.78f, -12.54f, 2.78f)
        reflectiveCurveToRelative(-14.4f, 18f, -17.65f, 21.75f)
        reflectiveCurveToRelative(-6.5f, 4.16f, -12.07f, 1.38f)
        reflectiveCurveToRelative(-23.54f, -8.63f, -44.83f, -27.53f)
        curveToRelative(-16.57f, -14.71f, -27.75f, -32.87f, -31f, -38.42f)
        reflectiveCurveToRelative(-0.35f, -8.56f, 2.44f, -11.32f)
        curveToRelative(2.51f, -2.49f, 5.57f, -6.48f, 8.36f, -9.72f)
        reflectiveCurveToRelative(3.72f, -5.56f, 5.57f, -9.26f)
        reflectiveCurveToRelative(0.93f, -6.94f, -0.46f, -9.71f)
        reflectiveCurveToRelative(-12.54f, -30.08f, -17.18f, -41.19f)
        curveToRelative(-4.53f, -10.82f, -9.12f, -9.35f, -12.54f, -9.52f)
        curveToRelative(-3.25f, -0.16f, -7f, -0.2f, -10.69f, -0.2f)
        arcToRelative(
          20.53f,
          20.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -14.86f,
          6.94f
        )
        curveToRelative(-5.11f, 5.56f, -19.51f, 19f, -19.51f, 46.28f)
        reflectiveCurveToRelative(20f, 53.68f, 22.76f, 57.38f)
        reflectiveCurveToRelative(39.3f, 59.73f, 95.21f, 83.76f)
        arcToRelative(
          323.11f,
          323.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          31.78f,
          11.68f
        )
        curveToRelative(13.35f, 4.22f, 25.5f, 3.63f, 35.1f, 2.2f)
        curveToRelative(10.71f, -1.59f, 33f, -13.42f, 37.63f, -26.38f)
        reflectiveCurveToRelative(4.64f, -24.06f, 3.25f, -26.37f)
        reflectiveCurveTo(364.21f, 303.24f, 358.63f, 300.47f)
        close()
      }
    }.build()

    return _LogoWhatsapp!!
  }

@Suppress("ObjectPropertyName")
private var _LogoWhatsapp: ImageVector? = null
