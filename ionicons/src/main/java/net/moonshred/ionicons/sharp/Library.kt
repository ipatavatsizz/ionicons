package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Library: ImageVector
  get() {
    if (_LibrarySharp != null) {
      return _LibrarySharp!!
    }
    _LibrarySharp = ImageVector.Builder(
      name = "Sharp.LibrarySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(84f, 480f)
        horizontalLineTo(28f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
        verticalLineTo(92f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 80f)
        horizontalLineTo(84f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 92f)
        verticalLineTo(468f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 208f)
        verticalLineTo(156f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        horizontalLineTo(124f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineToRelative(52f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 416f)
        verticalLineToRelative(52f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(228f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(416f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 240f)
        horizontalLineToRelative(128f)
        verticalLineToRelative(144f)
        horizontalLineToRelative(-128f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340f, 480f)
        horizontalLineTo(268f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
        verticalLineTo(44f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, -12f)
        horizontalLineToRelative(72f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
        verticalLineTo(468f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 340f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(369f, 100.7f)
        lineToRelative(30f, 367.83f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.45f, 10.92f)
        lineToRelative(72.16f, -9f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.47f, -12.9f)
        lineTo(465f, 91.21f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.2f, -10.94f)
        lineToRelative(-72.13f, 7.51f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 369f, 100.7f)
        close()
      }
    }.build()

    return _LibrarySharp!!
  }

@Suppress("ObjectPropertyName")
private var _LibrarySharp: ImageVector? = null
