package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.NavigateCircle: ImageVector
  get() {
    if (_NavigateCircleSharp != null) {
      return _NavigateCircleSharp!!
    }
    _NavigateCircleSharp = ImageVector.Builder(
      name = "Sharp.NavigateCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        horizontalLineToRelative(0f)
        arcTo(208.23f, 208.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 256f)
        curveToRelative(0f, 114.68f, 93.31f, 208f, 208f, 208f)
        horizontalLineToRelative(0f)
        arcTo(208.23f, 208.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 256f)
        curveTo(464f, 141.31f, 370.69f, 48f, 256f, 48f)
        close()
        moveTo(248f, 409f)
        lineTo(248f, 264f)
        lineTo(104f, 264f)
        lineToRelative(-1f, 0f)
        lineToRelative(259f, -114.11f)
        close()
      }
    }.build()

    return _NavigateCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NavigateCircleSharp: ImageVector? = null
