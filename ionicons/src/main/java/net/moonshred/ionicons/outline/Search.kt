package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Search: ImageVector
  get() {
    if (_SearchOutline != null) {
      return _SearchOutline!!
    }
    _SearchOutline = ImageVector.Builder(
      name = "Outline.SearchOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(221.09f, 64f)
        arcTo(157.09f, 157.09f, 0f, isMoreThanHalf = true, isPositiveArc = false, 378.18f, 221.09f)
        arcTo(157.1f, 157.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 221.09f, 64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(338.29f, 338.29f)
        lineTo(448f, 448f)
      }
    }.build()

    return _SearchOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SearchOutline: ImageVector? = null
