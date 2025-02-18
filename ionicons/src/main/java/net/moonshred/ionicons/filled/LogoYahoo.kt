package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoYahoo: ImageVector
  get() {
    if (_LogoYahoo != null) {
      return _LogoYahoo!!
    }
    _LogoYahoo = ImageVector.Builder(
      name = "Filled.LogoYahoo",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(0f, 139.01f)
        horizontalLineTo(97.65f)
        lineTo(154.51f, 284.74f)
        lineTo(212.11f, 139.01f)
        horizontalLineTo(307.17f)
        lineTo(164.02f, 484f)
        horizontalLineTo(68.34f)
        lineTo(107.53f, 392.58f)
        lineTo(0f, 139.01f)
        horizontalLineTo(0f)
        close()
        moveTo(417.5f, 256f)
        horizontalLineTo(311f)
        lineTo(405.91f, 28f)
        lineTo(512f, 28f)
        lineTo(417.5f, 256f)
        close()
        moveTo(339.29f, 277.22f)
        curveTo(371.96f, 277.22f, 398.45f, 303.75f, 398.45f, 336.48f)
        curveTo(398.45f, 369.21f, 371.96f, 395.74f, 339.29f, 395.74f)
        curveTo(306.63f, 395.74f, 280.15f, 369.21f, 280.15f, 336.48f)
        curveTo(280.15f, 303.75f, 306.63f, 277.22f, 339.29f, 277.22f)
        close()
      }
    }.build()

    return _LogoYahoo!!
  }

@Suppress("ObjectPropertyName")
private var _LogoYahoo: ImageVector? = null
