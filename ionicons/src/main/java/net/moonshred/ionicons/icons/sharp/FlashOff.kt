package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.FlashOff: ImageVector
  get() {
    if (_FlashOffSharp != null) {
      return _FlashOffSharp!!
    }
    _FlashOffSharp = ImageVector.Builder(
      name = "Sharp.FlashOffSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 86f)
        lineToRelative(22f, -22f)
        lineToRelative(362f, 362f)
        lineToRelative(-22f, 22f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 304f)
        lineToRelative(144f, 0f)
        lineToRelative(-32f, 192f)
        lineToRelative(108.18f, -129.82f)
        lineToRelative(-148.36f, -148.36f)
        lineToRelative(-71.82f, 86.18f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 208f)
        lineToRelative(-144f, 0f)
        lineToRelative(32f, -192f)
        lineToRelative(-108.18f, 129.82f)
        lineToRelative(148.36f, 148.36f)
        lineToRelative(71.82f, -86.18f)
        close()
      }
    }.build()

    return _FlashOffSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlashOffSharp: ImageVector? = null
