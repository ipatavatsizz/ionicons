package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CaretForward: ImageVector
  get() {
    if (_CaretForwardOutline != null) {
      return _CaretForwardOutline!!
    }
    _CaretForwardOutline = ImageVector.Builder(
      name = "Outline.CaretForwardOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(190.06f, 414f)
        lineTo(353.18f, 274.22f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -36.44f)
        lineTo(190.06f, 98f)
        curveToRelative(-15.57f, -13.34f, -39.62f, -2.28f, -39.62f, 18.22f)
        verticalLineTo(395.82f)
        curveTo(150.44f, 416.32f, 174.49f, 427.38f, 190.06f, 414f)
        close()
      }
    }.build()

    return _CaretForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CaretForwardOutline: ImageVector? = null
