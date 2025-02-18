package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Flag: ImageVector
  get() {
    if (_FlagSharp != null) {
      return _FlagSharp!!
    }
    _FlagSharp = ImageVector.Builder(
      name = "Sharp.FlagSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(102f, 480f)
        horizontalLineTo(64f)
        verticalLineTo(57.37f)
        lineToRelative(4.69f, -4.68f)
        curveTo(72.14f, 49.23f, 92.78f, 32f, 160f, 32f)
        curveToRelative(37.21f, 0f, 78.83f, 14.71f, 115.55f, 27.68f)
        curveTo(305.12f, 70.13f, 333.05f, 80f, 352f, 80f)
        curveToRelative(42.83f, 0f, 72.72f, -14.25f, 73f, -14.4f)
        lineToRelative(23f, -11.14f)
        verticalLineTo(313.89f)
        lineToRelative(-8.84f, 4.42f)
        curveTo(437.71f, 319f, 403.19f, 336f, 352f, 336f)
        curveToRelative(-24.14f, 0f, -54.38f, -7.14f, -86.39f, -14.71f)
        curveTo(229.63f, 312.79f, 192.43f, 304f, 160f, 304f)
        curveToRelative(-36.87f, 0f, -49.74f, 5.58f, -58f, 9.11f)
        close()
      }
    }.build()

    return _FlagSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlagSharp: ImageVector? = null
