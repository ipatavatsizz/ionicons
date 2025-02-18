package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Mail: ImageVector
  get() {
    if (_Mail != null) {
      return _Mail!!
    }
    _Mail = ImageVector.Builder(
      name = "Filled.Mail",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(424f, 80f)
        lineTo(88f, 80f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        lineTo(32f, 376f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        lineTo(424f, 432f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        lineTo(480f, 136f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 424f, 80f)
        close()
        moveTo(409.82f, 172.63f)
        lineTo(265.82f, 284.63f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.64f, 0f)
        lineToRelative(-144f, -112f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.64f, -25.26f)
        lineTo(256f, 251.73f)
        lineTo(390.18f, 147.37f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.64f, 25.26f)
        close()
      }
    }.build()

    return _Mail!!
  }

@Suppress("ObjectPropertyName")
private var _Mail: ImageVector? = null
