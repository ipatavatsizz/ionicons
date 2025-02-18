package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Laptop: ImageVector
  get() {
    if (_LaptopOutline != null) {
      return _LaptopOutline!!
    }
    _LaptopOutline = ImageVector.Builder(
      name = "Outline.LaptopOutline",
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
        moveTo(80.14f, 96f)
        lineTo(431.86f, 96f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 128.14f)
        lineTo(464f, 367.86f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 431.86f, 400f)
        lineTo(80.14f, 400f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 367.86f)
        lineTo(48f, 128.14f)
        arcTo(32.14f, 32.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.14f, 96f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(16f, 416f)
        lineTo(496f, 416f)
      }
    }.build()

    return _LaptopOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LaptopOutline: ImageVector? = null
