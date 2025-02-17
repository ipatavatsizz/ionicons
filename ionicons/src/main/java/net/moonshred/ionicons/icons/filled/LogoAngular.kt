package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoAngular: ImageVector
  get() {
    if (_LogoAngular != null) {
      return _LogoAngular!!
    }
    _LogoAngular = ImageVector.Builder(
      name = "Filled.LogoAngular",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(213.57f, 256f)
        lineToRelative(84.85f, 0f)
        lineToRelative(-42.43f, -89.36f)
        lineToRelative(-42.42f, 89.36f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        lineTo(32f, 112f)
        lineTo(78.12f, 384f)
        lineTo(256f, 480f)
        lineToRelative(177.75f, -96f)
        lineTo(480f, 112f)
        close()
        moveTo(344f, 352f)
        lineTo(317.41f, 296f)
        lineTo(194.58f, 296f)
        lineTo(168f, 352f)
        lineTo(128f, 352f)
        lineTo(256f, 72f)
        lineTo(384f, 352f)
        close()
      }
    }.build()

    return _LogoAngular!!
  }

@Suppress("ObjectPropertyName")
private var _LogoAngular: ImageVector? = null
