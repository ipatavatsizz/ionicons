package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ChevronBack: ImageVector
  get() {
    if (_ChevronBackOutline != null) {
      return _ChevronBackOutline!!
    }
    _ChevronBackOutline = ImageVector.Builder(
      name = "Outline.ChevronBackOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(328f, 112f)
        lineToRelative(-144f, 144f)
        lineToRelative(144f, 144f)
      }
    }.build()

    return _ChevronBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronBackOutline: ImageVector? = null
