package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ArrowDownLeftBox: ImageVector
  get() {
    if (_ArrowDownLeftBoxOutline != null) {
      return _ArrowDownLeftBoxOutline!!
    }
    _ArrowDownLeftBoxOutline = ImageVector.Builder(
      name = "Outline.ArrowDownLeftBoxOutline",
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
        moveTo(123.64f, 269.24f)
        lineTo(123.64f, 90.55f)
        curveTo(123.64f, 79.26f, 128.12f, 68.44f, 136.1f, 60.46f)
        curveTo(144.08f, 52.48f, 154.9f, 48f, 166.18f, 48f)
        lineTo(421.45f, 48f)
        curveTo(432.74f, 48f, 443.56f, 52.48f, 451.54f, 60.46f)
        curveTo(459.52f, 68.44f, 464f, 79.26f, 464f, 90.55f)
        lineTo(464f, 345.82f)
        curveTo(464f, 357.1f, 459.52f, 367.92f, 451.54f, 375.9f)
        curveTo(443.56f, 383.88f, 432.74f, 388.36f, 421.45f, 388.36f)
        lineTo(242.76f, 388.36f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 331.64f)
        lineTo(48f, 464f)
        lineTo(180.36f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(296f, 216f)
        lineTo(48f, 464f)
      }
    }.build()

    return _ArrowDownLeftBoxOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeftBoxOutline: ImageVector? = null
