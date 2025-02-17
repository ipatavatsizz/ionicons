package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Terminal: ImageVector
  get() {
    if (_Terminal != null) {
      return _Terminal!!
    }
    _Terminal = ImageVector.Builder(
      name = "Filled.Terminal",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 32f)
        lineTo(80f, 32f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
        lineTo(16f, 416f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        lineTo(432f, 480f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        lineTo(496f, 96f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 32f)
        close()
        moveTo(96f, 256f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10f, -28.49f)
        lineTo(150.39f, 176f)
        lineTo(86f, 124.49f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -25f)
        lineToRelative(80f, 64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 25f)
        lineToRelative(-80f, 64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 256f)
        close()
        moveTo(256f, 256f)
        lineTo(192f, 256f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
        horizontalLineToRelative(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        close()
      }
    }.build()

    return _Terminal!!
  }

@Suppress("ObjectPropertyName")
private var _Terminal: ImageVector? = null
