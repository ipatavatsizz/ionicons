package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Stop: ImageVector
  get() {
    if (_Stop != null) {
      return _Stop!!
    }
    _Stop = ImageVector.Builder(
      name = "Filled.Stop",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(392f, 432f)
        horizontalLineTo(120f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
        verticalLineTo(120f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
        horizontalLineTo(392f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
        verticalLineTo(392f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 392f, 432f)
        close()
      }
    }.build()

    return _Stop!!
  }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
