package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Reader: ImageVector
  get() {
    if (_Reader != null) {
      return _Reader!!
    }
    _Reader = ImageVector.Builder(
      name = "Filled.Reader",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 32f)
        lineTo(144f, 32f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 96f)
        lineTo(80f, 416f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        lineTo(368f, 480f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        lineTo(432f, 96f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 32f)
        close()
        moveTo(256f, 304f)
        lineTo(176f, 304f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
        horizontalLineToRelative(80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        close()
        moveTo(336f, 224f)
        lineTo(176f, 224f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
        lineTo(336f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        close()
        moveTo(336f, 144f)
        lineTo(176f, 144f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
        lineTo(336f, 112f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        close()
      }
    }.build()

    return _Reader!!
  }

@Suppress("ObjectPropertyName")
private var _Reader: ImageVector? = null
