package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Prism: ImageVector
  get() {
    if (_PrismOutline != null) {
      return _PrismOutline!!
    }
    _PrismOutline = ImageVector.Builder(
      name = "Outline.PrismOutline",
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
        moveTo(229.73f, 45.88f)
        lineTo(37.53f, 327.79f)
        arcToRelative(
          31.79f,
          31.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          11.31f,
          46f
        )
        lineTo(241f, 476.26f)
        arcToRelative(31.77f, 31.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.92f, 0f)
        lineToRelative(192.2f, -102.51f)
        arcToRelative(
          31.79f,
          31.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          11.31f,
          -46f
        )
        lineTo(282.27f, 45.88f)
        arcTo(31.8f, 31.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.73f, 45.88f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 32f)
        lineTo(256f, 480f)
      }
    }.build()

    return _PrismOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PrismOutline: ImageVector? = null
