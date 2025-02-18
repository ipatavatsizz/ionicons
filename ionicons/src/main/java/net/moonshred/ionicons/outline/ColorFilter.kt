package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ColorFilter: ImageVector
  get() {
    if (_ColorFilterOutline != null) {
      return _ColorFilterOutline!!
    }
    _ColorFilterOutline = ImageVector.Builder(
      name = "Outline.ColorFilterOutline",
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
        moveTo(256f, 184f)
        moveToRelative(-120f, 0f)
        arcToRelative(120f, 120f, 0f, isMoreThanHalf = true, isPositiveArc = true, 240f, 0f)
        arcToRelative(120f, 120f, 0f, isMoreThanHalf = true, isPositiveArc = true, -240f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(344f, 328f)
        moveToRelative(-120f, 0f)
        arcToRelative(120f, 120f, 0f, isMoreThanHalf = true, isPositiveArc = true, 240f, 0f)
        arcToRelative(120f, 120f, 0f, isMoreThanHalf = true, isPositiveArc = true, -240f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(168f, 328f)
        moveToRelative(-120f, 0f)
        arcToRelative(120f, 120f, 0f, isMoreThanHalf = true, isPositiveArc = true, 240f, 0f)
        arcToRelative(120f, 120f, 0f, isMoreThanHalf = true, isPositiveArc = true, -240f, 0f)
      }
    }.build()

    return _ColorFilterOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ColorFilterOutline: ImageVector? = null
