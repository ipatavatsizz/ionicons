package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowRedo: ImageVector
  get() {
    if (_ArrowRedoSharp != null) {
      return _ArrowRedoSharp!!
    }
    _ArrowRedoSharp = ImageVector.Builder(
      name = "Sharp.ArrowRedoSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 399.26f)
        curveTo(48f, 335.19f, 62.44f, 284f, 90.91f, 247f)
        curveToRelative(34.38f, -44.67f, 88.68f, -68.77f, 161.56f, -71.75f)
        verticalLineTo(72f)
        lineTo(464f, 252f)
        lineTo(252.47f, 432f)
        verticalLineTo(329.35f)
        curveToRelative(-44.25f, 1.19f, -77.66f, 7.58f, -104.27f, 19.84f)
        curveToRelative(-28.75f, 13.25f, -49.6f, 33.05f, -72.08f, 58.7f)
        lineTo(48f, 440f)
        close()
      }
    }.build()

    return _ArrowRedoSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowRedoSharp: ImageVector? = null
