package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Wine: ImageVector
  get() {
    if (_WineOutline != null) {
      return _WineOutline!!
    }
    _WineOutline = ImageVector.Builder(
      name = "Outline.WineOutline",
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
        moveTo(398.57f, 80f)
        horizontalLineTo(113.43f)
        verticalLineTo(96f)
        reflectiveCurveTo(87.51f, 272f, 256f, 272f)
        reflectiveCurveTo(398.57f, 96f, 398.57f, 96f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 272f)
        lineTo(256f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 432f)
        lineTo(160f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 160f)
        lineTo(400f, 160f)
      }
    }.build()

    return _WineOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WineOutline: ImageVector? = null
