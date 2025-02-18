package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoSlack: ImageVector
  get() {
    if (_LogoSlack != null) {
      return _LogoSlack!!
    }
    _LogoSlack = ImageVector.Builder(
      name = "Filled.LogoSlack",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(126.12f, 315.1f)
        arcTo(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 79.06f, 268f)
        horizontalLineToRelative(47.06f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(149.84f, 315.1f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.12f, 0f)
        verticalLineTo(432.94f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, -94.12f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(196.9f, 126.12f)
        arcTo(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 244f, 79.06f)
        verticalLineToRelative(47.06f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(196.9f, 149.84f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 94.12f)
        horizontalLineTo(79.06f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -94.12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(385.88f, 196.9f)
        arcTo(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 432.94f, 244f)
        horizontalLineTo(385.88f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(362.16f, 196.9f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -94.12f, 0f)
        verticalLineTo(79.06f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 94.12f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(315.1f, 385.88f)
        arcTo(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 268f, 432.94f)
        verticalLineTo(385.88f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(315.1f, 362.16f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -94.12f)
        horizontalLineTo(432.94f)
        arcToRelative(47.06f, 47.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 94.12f)
        close()
      }
    }.build()

    return _LogoSlack!!
  }

@Suppress("ObjectPropertyName")
private var _LogoSlack: ImageVector? = null
