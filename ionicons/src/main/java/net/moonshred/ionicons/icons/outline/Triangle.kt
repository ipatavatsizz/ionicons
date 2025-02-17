package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Triangle: ImageVector
  get() {
    if (_TriangleOutline != null) {
      return _TriangleOutline!!
    }
    _TriangleOutline = ImageVector.Builder(
      name = "Outline.TriangleOutline",
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
        moveTo(48f, 448f)
        lineToRelative(208f, -384f)
        lineToRelative(208f, 384f)
        lineToRelative(-416f, 0f)
        close()
      }
    }.build()

    return _TriangleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TriangleOutline: ImageVector? = null
