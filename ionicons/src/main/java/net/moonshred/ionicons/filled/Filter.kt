package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Filter: ImageVector
  get() {
    if (_Filter != null) {
      return _Filter!!
    }
    _Filter = ImageVector.Builder(
      name = "Filled.Filter",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(472f, 168f)
        horizontalLineTo(40f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
        horizontalLineTo(472f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(392f, 280f)
        horizontalLineTo(120f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
        horizontalLineTo(392f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(296f, 392f)
        horizontalLineTo(216f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
        horizontalLineToRelative(80f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
        close()
      }
    }.build()

    return _Filter!!
  }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null
