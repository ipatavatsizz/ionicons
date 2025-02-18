package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Skull: ImageVector
  get() {
    if (_SkullSharp != null) {
      return _SkullSharp!!
    }
    _SkullSharp = ImageVector.Builder(
      name = "Sharp.SkullSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 16f)
        curveTo(141.31f, 16f, 48f, 109.31f, 48f, 224f)
        lineTo(48f, 378.83f)
        lineToRelative(82f, 32.81f)
        lineTo(146.88f, 496f)
        lineTo(192f, 496f)
        lineTo(192f, 432f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(16f)
        lineTo(240f, 432f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(16f)
        lineTo(288f, 432f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(45.12f)
        lineTo(382f, 411.64f)
        lineToRelative(82f, -32.81f)
        lineTo(464f, 224f)
        curveTo(464f, 109.31f, 370.69f, 16f, 256f, 16f)
        close()
        moveTo(168f, 336f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 336f)
        close()
        moveTo(219.51f, 400f)
        lineTo(244f, 320f)
        horizontalLineToRelative(24f)
        lineToRelative(24.49f, 80f)
        close()
        moveTo(344f, 336f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344f, 336f)
        close()
        moveTo(448f, 368f)
        horizontalLineToRelative(0f)
        close()
      }
    }.build()

    return _SkullSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SkullSharp: ImageVector? = null
