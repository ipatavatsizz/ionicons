package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Person: ImageVector
  get() {
    if (_PersonSharp != null) {
      return _PersonSharp!!
    }
    _PersonSharp = ImageVector.Builder(
      name = "Sharp.PersonSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        arcTo(112f, 112f, 0f, isMoreThanHalf = true, isPositiveArc = false, 144f, 144f)
        arcTo(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 256f)
        close()
        moveTo(256f, 288f)
        curveToRelative(-69.42f, 0f, -208f, 42.88f, -208f, 128f)
        verticalLineToRelative(64f)
        lineTo(464f, 480f)
        lineTo(464f, 416f)
        curveTo(464f, 330.88f, 325.42f, 288f, 256f, 288f)
        close()
      }
    }.build()

    return _PersonSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PersonSharp: ImageVector? = null
