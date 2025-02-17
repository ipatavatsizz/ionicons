package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Water: ImageVector
  get() {
    if (_WaterOutline != null) {
      return _WaterOutline!!
    }
    _WaterOutline = ImageVector.Builder(
      name = "Outline.WaterOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(400f, 320f)
        curveToRelative(0f, 88.37f, -55.63f, 144f, -144f, 144f)
        reflectiveCurveTo(112f, 408.37f, 112f, 320f)
        curveToRelative(0f, -94.83f, 103.23f, -222.85f, 134.89f, -259.88f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.23f, 0f)
        curveTo(296.77f, 97.15f, 400f, 225.17f, 400f, 320f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(344f, 328f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, 72f)
      }
    }.build()

    return _WaterOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WaterOutline: ImageVector? = null
