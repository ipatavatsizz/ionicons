package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Megaphone: ImageVector
  get() {
    if (_MegaphoneSharp != null) {
      return _MegaphoneSharp!!
    }
    _MegaphoneSharp = ImageVector.Builder(
      name = "Sharp.MegaphoneSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 144f)
        verticalLineTo(476f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
        horizontalLineTo(232.07f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.82f, -9.7f)
        lineTo(208.71f, 352f)
        horizontalLineTo(232f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        verticalLineTo(144f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(452.18f, 186.55f)
        lineTo(448f, 185.5f)
        verticalLineTo(36f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
        horizontalLineTo(401.5f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.63f, 1f)
        lineTo(272f, 144f)
        verticalLineTo(304f)
        lineTo(398.87f, 415f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.63f, 1f)
        horizontalLineTo(444f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
        verticalLineTo(262.5f)
        lineToRelative(4.18f, -1.05f)
        curveTo(461.8f, 258.84f, 480f, 247.67f, 480f, 224f)
        reflectiveCurveTo(461.8f, 189.16f, 452.18f, 186.55f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 144f)
        horizontalLineTo(52f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
        verticalLineToRelative(35.59f)
        arcToRelative(43f, 43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 4.35f)
        curveTo(38.4f, 194.32f, 32f, 205.74f, 32f, 224f)
        curveToRelative(0f, 20.19f, 7.89f, 33.13f, 16f, 40.42f)
        verticalLineTo(300f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
        horizontalLineTo(96f)
        close()
      }
    }.build()

    return _MegaphoneSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MegaphoneSharp: ImageVector? = null
