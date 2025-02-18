package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.LogOut: ImageVector
  get() {
    if (_LogOutSharp != null) {
      return _LogOutSharp!!
    }
    _LogOutSharp = ImageVector.Builder(
      name = "Sharp.LogOutSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 240f)
        horizontalLineTo(320f)
        verticalLineTo(96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 96f)
        verticalLineTo(416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(304f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(272f)
        horizontalLineTo(160f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(459.31f, 244.69f)
        lineTo(368f, 153.37f)
        lineTo(345.37f, 176f)
        lineToRelative(64f, 64f)
        horizontalLineTo(320f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(89.37f)
        lineToRelative(-64f, 64f)
        lineTo(368f, 358.63f)
        lineToRelative(91.31f, -91.32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.62f)
        close()
      }
    }.build()

    return _LogOutSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LogOutSharp: ImageVector? = null
