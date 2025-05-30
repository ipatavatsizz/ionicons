package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.CaretForward: ImageVector
  get() {
    if (_CaretForward != null) {
      return _CaretForward!!
    }
    _CaretForward = ImageVector.Builder(
      name = "Filled.CaretForward",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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

    return _CaretForward!!
  }

@Suppress("ObjectPropertyName")
private var _CaretForward: ImageVector? = null
