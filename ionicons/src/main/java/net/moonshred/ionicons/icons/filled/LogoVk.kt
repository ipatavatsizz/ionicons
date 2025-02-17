package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoVk: ImageVector
  get() {
    if (_LogoVk != null) {
      return _LogoVk!!
    }
    _LogoVk = ImageVector.Builder(
      name = "Filled.LogoVk",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(484.7f, 132f)
        curveToRelative(3.56f, -11.28f, 0f, -19.48f, -15.75f, -19.48f)
        horizontalLineTo(416.58f)
        curveToRelative(-13.21f, 0f, -19.31f, 7.18f, -22.87f, 14.86f)
        curveToRelative(0f, 0f, -26.94f, 65.6f, -64.56f, 108.13f)
        curveToRelative(-12.2f, 12.3f, -17.79f, 16.4f, -24.4f, 16.4f)
        curveToRelative(-3.56f, 0f, -8.14f, -4.1f, -8.14f, -15.37f)
        verticalLineTo(131.47f)
        curveToRelative(0f, -13.32f, -4.06f, -19.47f, -15.25f, -19.47f)
        horizontalLineTo(199f)
        curveToRelative(-8.14f, 0f, -13.22f, 6.15f, -13.22f, 12.3f)
        curveToRelative(0f, 12.81f, 18.81f, 15.89f, 20.84f, 51.76f)
        verticalLineTo(254f)
        curveToRelative(0f, 16.91f, -3f, 20f, -9.66f, 20f)
        curveToRelative(-17.79f, 0f, -61f, -66.11f, -86.92f, -141.44f)
        curveTo(105f, 117.64f, 99.88f, 112f, 86.66f, 112f)
        horizontalLineTo(33.79f)
        curveTo(18.54f, 112f, 16f, 119.17f, 16f, 126.86f)
        curveToRelative(0f, 13.84f, 17.79f, 83.53f, 82.86f, 175.77f)
        curveToRelative(43.21f, 63f, 104.72f, 96.86f, 160.13f, 96.86f)
        curveToRelative(33.56f, 0f, 37.62f, -7.69f, 37.62f, -20.5f)
        verticalLineTo(331.33f)
        curveToRelative(0f, -15.37f, 3.05f, -17.93f, 13.73f, -17.93f)
        curveToRelative(7.62f, 0f, 21.35f, 4.09f, 52.36f, 34.33f)
        curveTo(398.28f, 383.6f, 404.38f, 400f, 424.21f, 400f)
        horizontalLineToRelative(52.36f)
        curveToRelative(15.25f, 0f, 22.37f, -7.69f, 18.3f, -22.55f)
        curveToRelative(-4.57f, -14.86f, -21.86f, -36.38f, -44.23f, -62f)
        curveToRelative(-12.2f, -14.34f, -30.5f, -30.23f, -36.09f, -37.92f)
        curveToRelative(-7.62f, -10.25f, -5.59f, -14.35f, 0f, -23.57f)
        curveToRelative(-0.51f, 0f, 63.55f, -91.22f, 70.15f, -122f)
      }
    }.build()

    return _LogoVk!!
  }

@Suppress("ObjectPropertyName")
private var _LogoVk: ImageVector? = null
