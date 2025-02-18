package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoJavascript: ImageVector
  get() {
    if (_LogoJavascript != null) {
      return _LogoJavascript!!
    }
    _LogoJavascript = ImageVector.Builder(
      name = "Filled.LogoJavascript",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 32f)
        lineTo(32f, 480f)
        lineTo(480f, 480f)
        lineTo(480f, 32f)
        close()
        moveTo(272f, 380f)
        curveToRelative(0f, 43.61f, -25.76f, 64.87f, -63.05f, 64.87f)
        curveToRelative(-33.68f, 0f, -53.23f, -17.44f, -63.15f, -38.49f)
        horizontalLineToRelative(0f)
        lineToRelative(34.28f, -20.75f)
        curveToRelative(6.61f, 11.73f, 11.63f, 21.65f, 26.06f, 21.65f)
        curveToRelative(12f, 0f, 21.86f, -5.41f, 21.86f, -26.46f)
        lineTo(228f, 240f)
        horizontalLineToRelative(44f)
        close()
        moveTo(371.35f, 443.87f)
        curveToRelative(-39.09f, 0f, -64.35f, -17.64f, -76.68f, -42f)
        horizontalLineToRelative(0f)
        lineTo(329f, 382f)
        curveToRelative(9f, 14.74f, 20.75f, 24.56f, 41.5f, 24.56f)
        curveToRelative(17.44f, 0f, 27.57f, -7.72f, 27.57f, -19.75f)
        curveToRelative(0f, -14.43f, -10.43f, -19.54f, -29.68f, -28f)
        lineToRelative(-10.52f, -4.52f)
        curveToRelative(-30.38f, -12.92f, -50.52f, -29.16f, -50.52f, -63.45f)
        curveToRelative(0f, -31.57f, 24.05f, -54.63f, 61.64f, -54.63f)
        curveToRelative(26.77f, 0f, 46f, 8.32f, 59.85f, 32.68f)
        lineTo(396f, 290f)
        curveToRelative(-7.22f, -12.93f, -15f, -18f, -27.06f, -18f)
        curveToRelative(-12.33f, 0f, -20.15f, 7.82f, -20.15f, 18f)
        curveToRelative(0f, 12.63f, 7.82f, 17.74f, 25.86f, 25.56f)
        lineToRelative(10.52f, 4.51f)
        curveToRelative(35.79f, 15.34f, 55.94f, 31f, 55.94f, 66.16f)
        curveTo(441.12f, 424.13f, 411.35f, 443.87f, 371.35f, 443.87f)
        close()
      }
    }.build()

    return _LogoJavascript!!
  }

@Suppress("ObjectPropertyName")
private var _LogoJavascript: ImageVector? = null
