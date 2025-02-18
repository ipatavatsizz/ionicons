package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoDropbox: ImageVector
  get() {
    if (_LogoDropbox != null) {
      return _LogoDropbox!!
    }
    _LogoDropbox = ImageVector.Builder(
      name = "Filled.LogoDropbox",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256.32f, 126.24f)
        lineTo(136.16f, 204.49f)
        lineToRelative(120.16f, 78.24f)
        lineTo(136.16f, 361f)
        lineTo(16f, 282.08f)
        lineToRelative(120.16f, -78.24f)
        lineTo(16f, 126.24f)
        lineTo(136.16f, 48f)
        close()
        moveTo(135.52f, 385.76f)
        lineToRelative(120.16f, -78.25f)
        lineToRelative(120.16f, 78.25f)
        lineTo(255.68f, 464f)
        close()
        moveTo(256.32f, 282.08f)
        lineTo(376.48f, 203.84f)
        lineTo(256.32f, 126.24f)
        lineTo(375.84f, 48f)
        lineTo(496f, 126.24f)
        lineTo(375.84f, 204.49f)
        lineTo(496f, 282.73f)
        lineTo(375.84f, 361f)
        close()
      }
    }.build()

    return _LogoDropbox!!
  }

@Suppress("ObjectPropertyName")
private var _LogoDropbox: ImageVector? = null
