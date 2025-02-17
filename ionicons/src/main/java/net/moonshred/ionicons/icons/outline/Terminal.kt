package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Terminal: ImageVector
  get() {
    if (_TerminalOutline != null) {
      return _TerminalOutline!!
    }
    _TerminalOutline = ImageVector.Builder(
      name = "Outline.TerminalOutline",
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
        moveTo(80f, 48f)
        lineTo(432f, 48f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 96f)
        lineTo(480f, 416f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 464f)
        lineTo(80f, 464f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 416f)
        lineTo(32f, 96f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96f, 112f)
        lineToRelative(80f, 64f)
        lineToRelative(-80f, 64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 240f)
        lineTo(256f, 240f)
      }
    }.build()

    return _TerminalOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TerminalOutline: ImageVector? = null
