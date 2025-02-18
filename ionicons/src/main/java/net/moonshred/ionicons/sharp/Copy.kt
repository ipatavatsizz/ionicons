package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Copy: ImageVector
  get() {
    if (_CopySharp != null) {
      return _CopySharp!!
    }
    _CopySharp = ImageVector.Builder(
      name = "Sharp.CopySharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 480f)
        horizontalLineTo(136f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(456f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 456f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 80f)
        horizontalLineTo(400f)
        verticalLineTo(56f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
        horizontalLineTo(60f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 60f)
        verticalLineTo(376f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(80f)
        verticalLineTo(112f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 80f)
        close()
      }
    }.build()

    return _CopySharp!!
  }

@Suppress("ObjectPropertyName")
private var _CopySharp: ImageVector? = null
