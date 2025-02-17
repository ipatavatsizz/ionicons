package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PersonRemove: ImageVector
  get() {
    if (_PersonRemoveSharp != null) {
      return _PersonRemoveSharp!!
    }
    _PersonRemoveSharp = ImageVector.Builder(
      name = "Sharp.PersonRemoveSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 214f)
        horizontalLineToRelative(144f)
        verticalLineToRelative(36f)
        horizontalLineToRelative(-144f)
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

    return _PersonRemoveSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PersonRemoveSharp: ImageVector? = null
