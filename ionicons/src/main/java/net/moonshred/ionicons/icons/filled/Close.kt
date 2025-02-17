package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Close: ImageVector
  get() {
    if (_Close != null) {
      return _Close!!
    }
    _Close = ImageVector.Builder(
      name = "Filled.Close",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(289.94f, 256f)
        lineToRelative(95f, -95f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 351f, 127f)
        lineToRelative(-95f, 95f)
        lineToRelative(-95f, -95f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 127f, 161f)
        lineToRelative(95f, 95f)
        lineToRelative(-95f, 95f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 161f, 385f)
        lineToRelative(95f, -95f)
        lineToRelative(95f, 95f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 385f, 351f)
        close()
      }
    }.build()

    return _Close!!
  }

@Suppress("ObjectPropertyName")
private var _Close: ImageVector? = null
