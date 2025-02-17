package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Remove: ImageVector
  get() {
    if (_RemoveOutline != null) {
      return _RemoveOutline!!
    }
    _RemoveOutline = ImageVector.Builder(
      name = "Outline.RemoveOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 256f)
        lineTo(112f, 256f)
      }
    }.build()

    return _RemoveOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RemoveOutline: ImageVector? = null
