package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.LockOpen: ImageVector
  get() {
    if (_LockOpenSharp != null) {
      return _LockOpenSharp!!
    }
    _LockOpenSharp = ImageVector.Builder(
      name = "Sharp.LockOpenSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(420f, 192f)
        horizontalLineTo(198f)
        verticalLineTo(111.25f)
        arcToRelative(
          58.08f,
          58.08f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          99.07f,
          -41.07f
        )
        arcTo(59.4f, 59.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 314f, 112f)
        horizontalLineToRelative(38f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -192f, 0f)
        verticalLineToRelative(80f)
        horizontalLineTo(92f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(204f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 420f, 192f)
        close()
      }
    }.build()

    return _LockOpenSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LockOpenSharp: ImageVector? = null
