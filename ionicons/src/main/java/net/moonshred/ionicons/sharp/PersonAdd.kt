package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PersonAdd: ImageVector
  get() {
    if (_PersonAddSharp != null) {
      return _PersonAddSharp!!
    }
    _PersonAddSharp = ImageVector.Builder(
      name = "Sharp.PersonAddSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(106f, 304f)
        lineToRelative(0f, -54f)
        lineToRelative(54f, 0f)
        lineToRelative(0f, -36f)
        lineToRelative(-54f, 0f)
        lineToRelative(0f, -54f)
        lineToRelative(-36f, 0f)
        lineToRelative(0f, 54f)
        lineToRelative(-54f, 0f)
        lineToRelative(0f, 36f)
        lineToRelative(54f, 0f)
        lineToRelative(0f, 54f)
        lineToRelative(36f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(288f, 144f)
        moveToRelative(-112f, 0f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = true, isPositiveArc = true, 224f, 0f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = true, isPositiveArc = true, -224f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(288f, 288f)
        curveToRelative(-69.42f, 0f, -208f, 42.88f, -208f, 128f)
        verticalLineToRelative(64f)
        horizontalLineTo(496f)
        verticalLineTo(416f)
        curveTo(496f, 330.88f, 357.42f, 288f, 288f, 288f)
        close()
      }
    }.build()

    return _PersonAddSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PersonAddSharp: ImageVector? = null
