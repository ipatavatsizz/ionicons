package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Ellipse: ImageVector
  get() {
    if (_EllipseOutline != null) {
      return _EllipseOutline!!
    }
    _EllipseOutline = ImageVector.Builder(
      name = "Outline.EllipseOutline",
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
        moveTo(256f, 256f)
        moveToRelative(-192f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, 384f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, -384f, 0f)
      }
    }.build()

    return _EllipseOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EllipseOutline: ImageVector? = null
