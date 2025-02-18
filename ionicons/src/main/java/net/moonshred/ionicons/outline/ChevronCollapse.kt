package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ChevronCollapse: ImageVector
  get() {
    if (_ChevronCollapseOutline != null) {
      return _ChevronCollapseOutline!!
    }
    _ChevronCollapseOutline = ImageVector.Builder(
      name = "Outline.ChevronCollapseOutline",
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
        moveTo(136f, 104f)
        lineTo(256f, 208f)
        lineTo(376f, 104f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(136f, 408f)
        lineTo(256f, 304f)
        lineTo(376f, 408f)
      }
    }.build()

    return _ChevronCollapseOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronCollapseOutline: ImageVector? = null
