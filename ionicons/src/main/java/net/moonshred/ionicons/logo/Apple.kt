package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Apple: ImageVector
  get() {
    if (_Apple != null) {
      return _Apple!!
    }
    _Apple = ImageVector.Builder(
      name = "Logo.Apple",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(349.13f, 136.86f)
        curveToRelative(-40.32f, 0f, -57.36f, 19.24f, -85.44f, 19.24f)
        curveTo(234.9f, 156.1f, 212.94f, 137f, 178f, 137f)
        curveToRelative(-34.2f, 0f, -70.67f, 20.88f, -93.83f, 56.45f)
        curveToRelative(-32.52f, 50.16f, -27f, 144.63f, 25.67f, 225.11f)
        curveToRelative(18.84f, 28.81f, 44f, 61.12f, 77f, 61.47f)
        horizontalLineToRelative(0.6f)
        curveToRelative(28.68f, 0f, 37.2f, -18.78f, 76.67f, -19f)
        horizontalLineToRelative(0.6f)
        curveToRelative(38.88f, 0f, 46.68f, 18.89f, 75.24f, 18.89f)
        horizontalLineToRelative(0.6f)
        curveToRelative(33f, -0.35f, 59.51f, -36.15f, 78.35f, -64.85f)
        curveToRelative(13.56f, -20.64f, 18.6f, -31f, 29f, -54.35f)
        curveToRelative(-76.19f, -28.92f, -88.43f, -136.93f, -13.08f, -178.34f)
        curveToRelative(-23f, -28.8f, -55.32f, -45.48f, -85.79f, -45.48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340.25f, 32f)
        curveToRelative(-24f, 1.63f, -52f, 16.91f, -68.4f, 36.86f)
        curveToRelative(-14.88f, 18.08f, -27.12f, 44.9f, -22.32f, 70.91f)
        horizontalLineToRelative(1.92f)
        curveToRelative(25.56f, 0f, 51.72f, -15.39f, 67f, -35.11f)
        curveTo(333.17f, 85.89f, 344.33f, 59.29f, 340.25f, 32f)
        close()
      }
    }.build()

    return _Apple!!
  }

@Suppress("ObjectPropertyName")
private var _Apple: ImageVector? = null
