package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Image: ImageVector
  get() {
    if (_ImageSharp != null) {
      return _ImageSharp!!
    }
    _ImageSharp = ImageVector.Builder(
      name = "Sharp.ImageSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 64f)
        lineTo(56f, 64f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 88f)
        lineTo(32f, 424f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        lineTo(456f, 448f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        lineTo(480f, 88f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 64f)
        close()
        moveTo(331.62f, 128.2f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -43.42f, 43.42f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 331.62f, 128.2f)
        close()
        moveTo(76f, 416f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
        lineTo(64f, 316.37f)
        lineTo(192.64f, 202f)
        lineToRelative(96.95f, 96.75f)
        lineTo(172.37f, 416f)
        close()
        moveTo(448f, 404f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
        lineTo(217.63f, 416f)
        lineTo(367.16f, 266.47f)
        lineTo(448f, 333.84f)
        close()
      }
    }.build()

    return _ImageSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ImageSharp: ImageVector? = null
