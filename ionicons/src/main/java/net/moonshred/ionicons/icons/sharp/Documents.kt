package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Documents: ImageVector
  get() {
    if (_DocumentsSharp != null) {
      return _DocumentsSharp!!
    }
    _DocumentsSharp = ImageVector.Builder(
      name = "Sharp.DocumentsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(307.94f, 248f)
        lineTo(216f, 154.52f)
        verticalLineTo(242f)
        arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(184f, 268f)
        verticalLineTo(144f)
        horizontalLineTo(60f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(308f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(280f)
        horizontalLineTo(196f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 268f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(366f, 120f)
        horizontalLineToRelative(85.94f)
        lineTo(360f, 26.52f)
        verticalLineTo(114f)
        arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 366f, 120f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340f, 152f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
        verticalLineTo(16f)
        horizontalLineTo(172f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineToRelative(84f)
        horizontalLineToRelative(42.12f)
        arcTo(40.81f, 40.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 231f, 124.14f)
        lineToRelative(109.16f, 111f)
        arcToRelative(41.11f, 41.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.83f, 29f)
        verticalLineTo(400f)
        horizontalLineTo(452f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(152f)
        close()
      }
    }.build()

    return _DocumentsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentsSharp: ImageVector? = null
