package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.CaretBack: ImageVector
  get() {
    if (_CaretBackSharp != null) {
      return _CaretBackSharp!!
    }
    _CaretBackSharp = ImageVector.Builder(
      name = "Sharp.CaretBackSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 64f)
        lineToRelative(-224f, 192f)
        lineToRelative(224f, 192f)
        lineToRelative(0f, -384f)
        close()
      }
    }.build()

    return _CaretBackSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretBackSharp: ImageVector? = null
