package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Laptop: ImageVector
  get() {
    if (_LaptopSharp != null) {
      return _LaptopSharp!!
    }
    _LaptopSharp = ImageVector.Builder(
      name = "Sharp.LaptopSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(477.29f, 400f)
        arcTo(27.75f, 27.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 388f)
        verticalLineTo(108f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28f, -28f)
        horizontalLineTo(60f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28f, 28f)
        verticalLineTo(388f)
        arcToRelative(27.75f, 27.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 12f)
        horizontalLineTo(0f)
        verticalLineToRelative(32f)
        horizontalLineTo(512f)
        verticalLineTo(400f)
        close()
      }
    }.build()

    return _LaptopSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LaptopSharp: ImageVector? = null
