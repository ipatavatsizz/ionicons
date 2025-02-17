package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ArrowDownRightBox: ImageVector
  get() {
    if (_ArrowDownRightBoxOutline != null) {
      return _ArrowDownRightBoxOutline!!
    }
    _ArrowDownRightBoxOutline = ImageVector.Builder(
      name = "Outline.ArrowDownRightBoxOutline",
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
        moveTo(269.24f, 388.36f)
        lineTo(90.55f, 388.36f)
        curveTo(79.26f, 388.36f, 68.44f, 383.88f, 60.46f, 375.9f)
        curveTo(52.48f, 367.92f, 48f, 357.1f, 48f, 345.82f)
        lineTo(48f, 90.55f)
        curveTo(48f, 79.26f, 52.48f, 68.44f, 60.46f, 60.46f)
        curveTo(68.44f, 52.48f, 79.26f, 48f, 90.55f, 48f)
        lineTo(345.82f, 48f)
        curveTo(357.1f, 48f, 367.92f, 52.48f, 375.9f, 60.46f)
        curveTo(383.88f, 68.44f, 388.36f, 79.26f, 388.36f, 90.55f)
        lineTo(388.36f, 269.24f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(331.64f, 464f)
        lineTo(464f, 464f)
        lineTo(464f, 331.64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(216f, 216f)
        lineTo(464f, 464f)
      }
    }.build()

    return _ArrowDownRightBoxOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightBoxOutline: ImageVector? = null
