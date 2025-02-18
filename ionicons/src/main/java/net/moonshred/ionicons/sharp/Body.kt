package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Body: ImageVector
  get() {
    if (_BodySharp != null) {
      return _BodySharp!!
    }
    _BodySharp = ImageVector.Builder(
      name = "Sharp.BodySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 56f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 128f)
        lineToRelative(-416f, 0f)
        lineToRelative(0f, 52f)
        lineToRelative(144f, 0f)
        lineToRelative(-32f, 325.13f)
        lineToRelative(51f, 6.87f)
        lineToRelative(21.65f, -192f)
        lineToRelative(47.02f, 0f)
        lineToRelative(21.33f, 192f)
        lineToRelative(51f, -6.98f)
        lineToRelative(-32f, -325.02f)
        lineToRelative(144f, 0f)
        lineToRelative(0f, -52f)
        close()
      }
    }.build()

    return _BodySharp!!
  }

@Suppress("ObjectPropertyName")
private var _BodySharp: ImageVector? = null
