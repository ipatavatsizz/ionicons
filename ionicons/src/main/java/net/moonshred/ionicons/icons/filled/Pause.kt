package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Pause: ImageVector
  get() {
    if (_Pause != null) {
      return _Pause!!
    }
    _Pause = ImageVector.Builder(
      name = "Filled.Pause",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(208f, 432f)
        horizontalLineTo(160f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineTo(96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineTo(416f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 432f)
        horizontalLineTo(304f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineTo(96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineTo(416f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 432f)
        close()
      }
    }.build()

    return _Pause!!
  }

@Suppress("ObjectPropertyName")
private var _Pause: ImageVector? = null
