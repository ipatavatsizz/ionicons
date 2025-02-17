package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ArrowUpLeftBox: ImageVector
  get() {
    if (_ArrowUpLeftBoxOutline != null) {
      return _ArrowUpLeftBoxOutline!!
    }
    _ArrowUpLeftBoxOutline = ImageVector.Builder(
      name = "Outline.ArrowUpLeftBoxOutline",
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
        moveTo(242.76f, 123.64f)
        lineTo(421.45f, 123.64f)
        curveTo(432.74f, 123.64f, 443.56f, 128.12f, 451.54f, 136.1f)
        curveTo(459.52f, 144.08f, 464f, 154.9f, 464f, 166.18f)
        lineTo(464f, 421.45f)
        curveTo(464f, 432.74f, 459.52f, 443.56f, 451.54f, 451.54f)
        curveTo(443.56f, 459.52f, 432.74f, 464f, 421.45f, 464f)
        lineTo(166.18f, 464f)
        curveTo(154.9f, 464f, 144.08f, 459.52f, 136.1f, 451.54f)
        curveTo(128.12f, 443.56f, 123.64f, 432.74f, 123.64f, 421.45f)
        lineTo(123.64f, 242.76f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(180.36f, 48f)
        lineTo(48f, 48f)
        lineTo(48f, 180.36f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(296f, 296f)
        lineTo(48f, 48f)
      }
    }.build()

    return _ArrowUpLeftBoxOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftBoxOutline: ImageVector? = null
