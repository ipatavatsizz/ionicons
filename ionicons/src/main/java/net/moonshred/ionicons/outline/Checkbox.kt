package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Checkbox: ImageVector
  get() {
    if (_CheckboxOutline != null) {
      return _CheckboxOutline!!
    }
    _CheckboxOutline = ImageVector.Builder(
      name = "Outline.CheckboxOutline",
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
        moveTo(352f, 176f)
        lineToRelative(-134.4f, 160f)
        lineToRelative(-57.6f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 64f)
        lineTo(400f, 64f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 112f)
        lineTo(448f, 400f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 448f)
        lineTo(112f, 448f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 400f)
        lineTo(64f, 112f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 64f)
        close()
      }
    }.build()

    return _CheckboxOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CheckboxOutline: ImageVector? = null
