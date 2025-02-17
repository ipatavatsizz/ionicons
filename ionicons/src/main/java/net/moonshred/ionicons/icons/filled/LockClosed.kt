package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LockClosed: ImageVector
  get() {
    if (_LockClosed != null) {
      return _LockClosed!!
    }
    _LockClosed = ImageVector.Builder(
      name = "Filled.LockClosed",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 192f)
        lineTo(352f, 192f)
        lineTo(352f, 112f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -192f, 0f)
        verticalLineToRelative(80f)
        lineTo(144f, 192f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        lineTo(80f, 432f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        lineTo(368f, 496f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        lineTo(432f, 256f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 192f)
        close()
        moveTo(320f, 192f)
        lineTo(192f, 192f)
        lineTo(192f, 112f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        close()
      }
    }.build()

    return _LockClosed!!
  }

@Suppress("ObjectPropertyName")
private var _LockClosed: ImageVector? = null
