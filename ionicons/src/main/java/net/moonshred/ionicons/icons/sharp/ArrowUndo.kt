package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowUndo: ImageVector
  get() {
    if (_ArrowUndoSharp != null) {
      return _ArrowUndoSharp!!
    }
    _ArrowUndoSharp = ImageVector.Builder(
      name = "Sharp.ArrowUndoSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 440f)
        lineToRelative(-28.12f, -32.11f)
        curveToRelative(-22.48f, -25.65f, -43.33f, -45.45f, -72.08f, -58.7f)
        curveToRelative(-26.61f, -12.26f, -60f, -18.65f, -104.27f, -19.84f)
        verticalLineTo(432f)
        lineTo(48f, 252f)
        lineTo(259.53f, 72f)
        verticalLineTo(175.21f)
        curveToRelative(72.88f, 3f, 127.18f, 27.08f, 161.56f, 71.75f)
        curveTo(449.56f, 284f, 464f, 335.19f, 464f, 399.26f)
        close()
      }
    }.build()

    return _ArrowUndoSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUndoSharp: ImageVector? = null
