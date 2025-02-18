package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.DocumentAttach: ImageVector
  get() {
    if (_DocumentAttachSharp != null) {
      return _DocumentAttachSharp!!
    }
    _DocumentAttachSharp = ImageVector.Builder(
      name = "Sharp.DocumentAttachSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(280f, 240f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(48f)
        horizontalLineTo(214.75f)
        arcToRelative(
          65.42f,
          65.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -6.5f,
          -9.81f
        )
        curveTo(196.72f, 23.88f, 179.59f, 16f, 160f, 16f)
        curveToRelative(-37.68f, 0f, -64f, 29.61f, -64f, 72f)
        verticalLineTo(232f)
        curveToRelative(0f, 25f, 20.34f, 40f, 40f, 40f)
        arcToRelative(39.57f, 39.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
        verticalLineTo(80f)
        horizontalLineTo(144f)
        verticalLineTo(232f)
        arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        curveToRelative(-2.23f, 0f, -8f, -1.44f, -8f, -8f)
        verticalLineTo(88f)
        curveToRelative(0f, -19.34f, 8.41f, -40f, 32f, -40f)
        curveToRelative(29.69f, 0f, 32f, 30.15f, 32f, 39.38f)
        verticalLineTo(226.13f)
        curveToRelative(0f, 17.45f, -5.47f, 33.23f, -15.41f, 44.46f)
        curveTo(166.5f, 282f, 152.47f, 288f, 136f, 288f)
        reflectiveCurveToRelative(-30.5f, -6f, -40.59f, -17.41f)
        curveTo(85.47f, 259.36f, 80f, 243.58f, 80f, 226.13f)
        verticalLineTo(144f)
        horizontalLineTo(48f)
        verticalLineToRelative(82.13f)
        curveToRelative(0f, 51.51f, 33.19f, 89.63f, 80f, 93.53f)
        verticalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(452f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(240f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(308f, 208f)
        horizontalLineTo(454.31f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -3.41f)
        lineTo(307.41f, 56.27f)
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 57.69f)
        verticalLineTo(204f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 308f, 208f)
        close()
      }
    }.build()

    return _DocumentAttachSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentAttachSharp: ImageVector? = null
