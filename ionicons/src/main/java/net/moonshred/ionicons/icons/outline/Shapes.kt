package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Shapes: ImageVector
  get() {
    if (_ShapesOutline != null) {
      return _ShapesOutline!!
    }
    _ShapesOutline = ImageVector.Builder(
      name = "Outline.ShapesOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 320f)
        lineToRelative(-304f, 0f)
        lineToRelative(152f, -272f)
        lineToRelative(152f, 272f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(265.32f, 194.51f)
        arcTo(144f, 144f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 320f)
      }
    }.build()

    return _ShapesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ShapesOutline: ImageVector? = null
