package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Vercel: ImageVector
  get() {
    if (_Vercel != null) {
      return _Vercel!!
    }
    _Vercel = ImageVector.Builder(
      name = "Logo.Vercel",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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

    return _Vercel!!
  }

@Suppress("ObjectPropertyName")
private var _Vercel: ImageVector? = null
