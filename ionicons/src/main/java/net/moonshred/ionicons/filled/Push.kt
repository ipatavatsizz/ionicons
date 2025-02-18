package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Push: ImageVector
  get() {
    if (_Push != null) {
      return _Push!!
    }
    _Push = ImageVector.Builder(
      name = "Filled.Push",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376f, 352f)
        horizontalLineTo(272f)
        verticalLineTo(198.63f)
        lineToRelative(52.69f, 52.68f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, -22.62f)
        lineToRelative(-80f, -80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
        lineToRelative(-80f, 80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 22.62f)
        lineTo(240f, 198.63f)
        verticalLineTo(352f)
        horizontalLineTo(136f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
        verticalLineTo(88f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
        horizontalLineTo(376f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
        verticalLineTo(296f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 376f, 352f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        verticalLineTo(352f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _Push!!
  }

@Suppress("ObjectPropertyName")
private var _Push: ImageVector? = null
