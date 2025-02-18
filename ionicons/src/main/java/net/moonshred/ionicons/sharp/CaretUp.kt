package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CaretUp: ImageVector
  get() {
    if (_CaretUpSharp != null) {
      return _CaretUpSharp!!
    }
    _CaretUpSharp = ImageVector.Builder(
      name = "Sharp.CaretUpSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 368f)
        lineToRelative(-192f, -224f)
        lineToRelative(-192f, 224f)
        lineToRelative(384f, 0f)
        close()
      }
    }.build()

    return _CaretUpSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretUpSharp: ImageVector? = null
