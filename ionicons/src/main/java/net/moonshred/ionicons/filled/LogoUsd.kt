package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoUsd: ImageVector
  get() {
    if (_LogoUsd != null) {
      return _LogoUsd!!
    }
    _LogoUsd = ImageVector.Builder(
      name = "Filled.LogoUsd",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 480f)
        lineTo(240f, 443.58f)
        curveTo(160.53f, 439f, 112.25f, 398.06f, 112f, 336f)
        horizontalLineToRelative(72f)
        curveToRelative(1.77f, 26.34f, 23.86f, 46.45f, 56f, 50f)
        lineTo(240f, 288f)
        lineTo(213.23f, 281f)
        curveToRelative(-61f, -14.18f, -93.64f, -49.39f, -93.64f, -102.08f)
        curveTo(119.59f, 116.81f, 164.08f, 76.08f, 240f, 70f)
        lineTo(240f, 32f)
        horizontalLineToRelative(32f)
        lineTo(272f, 70f)
        curveToRelative(77.39f, 6.3f, 119f, 47.74f, 120f, 106f)
        lineTo(320f, 176f)
        curveToRelative(-0.76f, -24.06f, -15.83f, -43.39f, -48f, -46f)
        verticalLineToRelative(92f)
        lineToRelative(30.82f, 7.28f)
        curveTo(367.61f, 243.46f, 400f, 277f, 400f, 332f)
        curveToRelative(0f, 64.34f, -43.74f, 105.88f, -128f, 111.32f)
        lineTo(272f, 480f)
        close()
        moveTo(240f, 216f)
        lineTo(240f, 130f)
        curveToRelative(-27.59f, 1.52f, -47.27f, 18.47f, -47.27f, 42.53f)
        curveTo(192.73f, 194.83f, 209.12f, 209.41f, 240f, 216f)
        close()
        moveTo(272f, 294f)
        verticalLineToRelative(92f)
        curveToRelative(38.15f, -1.54f, 56.38f, -18.92f, 56.38f, -45.77f)
        curveTo(328.38f, 315.65f, 310.15f, 299.1f, 272f, 294f)
        close()
      }
    }.build()

    return _LogoUsd!!
  }

@Suppress("ObjectPropertyName")
private var _LogoUsd: ImageVector? = null
