package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Square: ImageVector
  get() {
    if (_Square != null) {
      return _Square!!
    }
    _Square = ImageVector.Builder(
      name = "Filled.Square",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 464f)
        horizontalLineTo(96f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(96f)
        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
        horizontalLineTo(416f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineTo(416f)
        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 464f)
        close()
      }
    }.build()

    return _Square!!
  }

@Suppress("ObjectPropertyName")
private var _Square: ImageVector? = null
