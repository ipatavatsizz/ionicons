package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Brush: ImageVector
  get() {
    if (_BrushOutline != null) {
      return _BrushOutline!!
    }
    _BrushOutline = ImageVector.Builder(
      name = "Outline.BrushOutline",
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
        moveTo(452.37f, 59.63f)
        horizontalLineToRelative(0f)
        arcToRelative(
          40.49f,
          40.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -57.26f,
          0f
        )
        lineTo(184f, 294.74f)
        curveToRelative(23.08f, 4.7f, 46.12f, 27.29f, 49.26f, 49.26f)
        lineTo(452.37f, 116.89f)
        arcTo(40.49f, 40.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 452.37f, 59.63f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(138f, 336f)
        curveToRelative(-29.88f, 0f, -54f, 24.5f, -54f, 54.86f)
        curveToRelative(0f, 23.95f, -20.88f, 36.57f, -36f, 36.57f)
        curveTo(64.56f, 449.74f, 92.82f, 464f, 120f, 464f)
        curveToRelative(39.78f, 0f, 72f, -32.73f, 72f, -73.14f)
        curveTo(192f, 360.5f, 167.88f, 336f, 138f, 336f)
        close()
      }
    }.build()

    return _BrushOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BrushOutline: ImageVector? = null
