package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Journal: ImageVector
  get() {
    if (_JournalOutline != null) {
      return _JournalOutline!!
    }
    _JournalOutline = ImageVector.Builder(
      name = "Outline.JournalOutline",
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
        moveTo(144f, 48f)
        lineTo(368f, 48f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 96f)
        lineTo(416f, 416f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 464f)
        lineTo(144f, 464f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 416f)
        lineTo(96f, 96f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 60f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 48f)
        lineTo(320f, 464f)
      }
    }.build()

    return _JournalOutline!!
  }

@Suppress("ObjectPropertyName")
private var _JournalOutline: ImageVector? = null
