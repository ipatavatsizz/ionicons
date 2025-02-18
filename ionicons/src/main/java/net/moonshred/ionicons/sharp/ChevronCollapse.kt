package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ChevronCollapse: ImageVector
  get() {
    if (_ChevronCollapseSharp != null) {
      return _ChevronCollapseSharp!!
    }
    _ChevronCollapseSharp = ImageVector.Builder(
      name = "Sharp.ChevronCollapseSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(102.14f, 108.51f)
        lineTo(256f, 241.85f)
        lineToRelative(153.85f, -133.34f)
        lineToRelative(-31.44f, -36.27f)
        lineTo(256f, 178.34f)
        lineTo(133.58f, 72.24f)
        lineToRelative(-31.44f, 36.27f)
        close()
        moveTo(102.14f, 403.49f)
        lineTo(256f, 270.14f)
        lineToRelative(153.85f, 133.34f)
        lineToRelative(-31.44f, 36.27f)
        lineTo(256f, 333.66f)
        lineTo(133.58f, 439.76f)
        lineToRelative(-31.44f, -36.27f)
        close()
      }
    }.build()

    return _ChevronCollapseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronCollapseSharp: ImageVector? = null
