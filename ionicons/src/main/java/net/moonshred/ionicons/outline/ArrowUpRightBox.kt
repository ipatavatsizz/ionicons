package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ArrowUpRightBox: ImageVector
  get() {
    if (_ArrowUpRightBoxOutline != null) {
      return _ArrowUpRightBoxOutline!!
    }
    _ArrowUpRightBoxOutline = ImageVector.Builder(
      name = "Outline.ArrowUpRightBoxOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(388.36f, 242.76f)
        verticalLineTo(421.45f)
        curveTo(388.36f, 432.74f, 383.88f, 443.56f, 375.9f, 451.54f)
        curveTo(367.92f, 459.52f, 357.1f, 464f, 345.82f, 464f)
        horizontalLineTo(90.55f)
        curveTo(79.26f, 464f, 68.44f, 459.52f, 60.46f, 451.54f)
        curveTo(52.48f, 443.56f, 48f, 432.74f, 48f, 421.45f)
        verticalLineTo(166.18f)
        curveTo(48f, 154.9f, 52.48f, 144.08f, 60.46f, 136.1f)
        curveTo(68.44f, 128.12f, 79.26f, 123.64f, 90.55f, 123.64f)
        horizontalLineTo(269.24f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(464f, 180.36f)
        lineTo(464f, 48f)
        lineTo(331.64f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(216f, 296f)
        lineTo(464f, 48f)
      }
    }.build()

    return _ArrowUpRightBoxOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightBoxOutline: ImageVector? = null
