package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Funnel: ImageVector
  get() {
    if (_FunnelSharp != null) {
      return _FunnelSharp!!
    }
    _FunnelSharp = ImageVector.Builder(
      name = "Sharp.FunnelSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(0f, 48f)
        lineToRelative(192f, 240f)
        lineToRelative(0f, 128f)
        lineToRelative(128f, 48f)
        lineToRelative(0f, -176f)
        lineToRelative(192f, -240f)
        lineToRelative(-512f, 0f)
        close()
      }
    }.build()

    return _FunnelSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FunnelSharp: ImageVector? = null
