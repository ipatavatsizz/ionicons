package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.LogOut: ImageVector
  get() {
    if (_LogOut != null) {
      return _LogOut!!
    }
    _LogOut = ImageVector.Builder(
      name = "Logo.LogOut",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 256f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineTo(320f)
        verticalLineTo(136f)
        curveToRelative(0f, -32f, -33.79f, -56f, -64f, -56f)
        horizontalLineTo(104f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineTo(376f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineTo(264f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(272f)
        horizontalLineTo(176f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(459.31f, 244.69f)
        lineToRelative(-80f, -80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 22.62f)
        lineTo(409.37f, 240f)
        horizontalLineTo(320f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(89.37f)
        lineToRelative(-52.68f, 52.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22.62f, 22.62f)
        lineToRelative(80f, -80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.62f)
        close()
      }
    }.build()

    return _LogOut!!
  }

@Suppress("ObjectPropertyName")
private var _LogOut: ImageVector? = null
