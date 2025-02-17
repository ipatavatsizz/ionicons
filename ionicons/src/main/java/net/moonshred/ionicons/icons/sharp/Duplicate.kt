package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Duplicate: ImageVector
  get() {
    if (_DuplicateSharp != null) {
      return _DuplicateSharp!!
    }
    _DuplicateSharp = ImageVector.Builder(
      name = "Sharp.DuplicateSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 80f)
        horizontalLineTo(400f)
        verticalLineTo(56f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
        horizontalLineTo(66f)
        arcTo(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 66f)
        verticalLineTo(376f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(80f)
        verticalLineTo(112f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 112f)
        horizontalLineTo(136f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
        verticalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(136f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 112f)
        close()
        moveTo(392f, 312f)
        horizontalLineTo(312f)
        verticalLineToRelative(80f)
        horizontalLineTo(280f)
        verticalLineTo(312f)
        horizontalLineTo(200f)
        verticalLineTo(280f)
        horizontalLineToRelative(80f)
        verticalLineTo(200f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(80f)
        close()
      }
    }.build()

    return _DuplicateSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DuplicateSharp: ImageVector? = null
