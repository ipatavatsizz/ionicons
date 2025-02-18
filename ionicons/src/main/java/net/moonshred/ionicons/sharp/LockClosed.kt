package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.LockClosed: ImageVector
  get() {
    if (_LockClosedSharp != null) {
      return _LockClosedSharp!!
    }
    _LockClosedSharp = ImageVector.Builder(
      name = "Sharp.LockClosedSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(420f, 192f)
        lineTo(352f, 192f)
        lineTo(352f, 112f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -192f, 0f)
        verticalLineToRelative(80f)
        lineTo(92f, 192f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        lineTo(80f, 484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        lineTo(420f, 496f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        lineTo(432f, 204f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 420f, 192f)
        close()
        moveTo(314f, 192f)
        lineTo(198f, 192f)
        lineTo(198f, 111.25f)
        arcToRelative(58f, 58f, 0f, isMoreThanHalf = true, isPositiveArc = true, 116f, 0f)
        close()
      }
    }.build()

    return _LockClosedSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LockClosedSharp: ImageVector? = null
