package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoVercel: ImageVector
  get() {
    if (_LogoVercel != null) {
      return _LogoVercel!!
    }
    _LogoVercel = ImageVector.Builder(
      name = "Filled.LogoVercel",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(256f, 48f)
        lineTo(496f, 464f)
        horizontalLineTo(16f)
        close()
      }
    }.build()

    return _LogoVercel!!
  }

@Suppress("ObjectPropertyName")
private var _LogoVercel: ImageVector? = null
