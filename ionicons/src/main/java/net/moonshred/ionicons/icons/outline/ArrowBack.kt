package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ArrowBack: ImageVector
  get() {
    if (_ArrowBackOutline != null) {
      return _ArrowBackOutline!!
    }
    _ArrowBackOutline = ImageVector.Builder(
      name = "Outline.ArrowBackOutline",
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
        moveTo(244f, 400f)
        lineToRelative(-144f, -144f)
        lineToRelative(144f, -144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(120f, 256f)
        lineTo(412f, 256f)
      }
    }.build()

    return _ArrowBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowBackOutline: ImageVector? = null
