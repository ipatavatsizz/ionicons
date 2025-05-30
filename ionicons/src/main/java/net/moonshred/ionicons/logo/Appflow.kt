package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Appflow: ImageVector
  get() {
    if (_Appflow != null) {
      return _Appflow!!
    }
    _Appflow = ImageVector.Builder(
      name = "Logo.Appflow",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(198.63f, 28.42f)
        lineTo(8f, 484.42f)
        horizontalLineTo(122.38f)
        lineTo(256f, 164.78f)
        lineTo(389.62f, 484.42f)
        horizontalLineTo(504f)
        lineTo(313.37f, 28.42f)
        horizontalLineTo(198.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(312f, 346.04f)
        curveTo(312f, 376.97f, 286.93f, 402.04f, 256f, 402.04f)
        curveTo(225.07f, 402.04f, 200f, 376.97f, 200f, 346.04f)
        curveTo(200f, 315.11f, 225.07f, 290.04f, 256f, 290.04f)
        curveTo(286.93f, 290.04f, 312f, 315.11f, 312f, 346.04f)
        close()
      }
    }.build()

    return _Appflow!!
  }

@Suppress("ObjectPropertyName")
private var _Appflow: ImageVector? = null
