package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Leaf: ImageVector
  get() {
    if (_LeafOutline != null) {
      return _LeafOutline!!
    }
    _LeafOutline = ImageVector.Builder(
      name = "Outline.LeafOutline",
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
        moveTo(321.89f, 171.42f)
        curveTo(233f, 114f, 141f, 155.22f, 56f, 65.22f)
        curveToRelative(-19.8f, -21f, -8.3f, 235.5f, 98.1f, 332.7f)
        curveTo(231.89f, 468.92f, 352f, 461f, 392.5f, 392f)
        reflectiveCurveTo(410.78f, 228.83f, 321.89f, 171.42f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(173f, 253f)
        curveToRelative(86f, 81f, 175f, 129f, 292f, 147f)
      }
    }.build()

    return _LeafOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LeafOutline: ImageVector? = null
