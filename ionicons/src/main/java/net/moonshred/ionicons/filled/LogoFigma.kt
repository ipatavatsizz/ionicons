package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoFigma: ImageVector
  get() {
    if (_LogoFigma != null) {
      return _LogoFigma!!
    }
    _LogoFigma = ImageVector.Builder(
      name = "Filled.LogoFigma",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 176f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
        horizontalLineTo(176f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 160f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 160f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 80f)
        verticalLineTo(176f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 256f)
        moveToRelative(-80f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -160f, 0f)
      }
    }.build()

    return _LogoFigma!!
  }

@Suppress("ObjectPropertyName")
private var _LogoFigma: ImageVector? = null
