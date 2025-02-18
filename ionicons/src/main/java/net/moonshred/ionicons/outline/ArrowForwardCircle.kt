package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ArrowForwardCircle: ImageVector
  get() {
    if (_ArrowForwardCircleOutline != null) {
      return _ArrowForwardCircleOutline!!
    }
    _ArrowForwardCircleOutline = ImageVector.Builder(
      name = "Outline.ArrowForwardCircleOutline",
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
        moveTo(262.62f, 336f)
        lineToRelative(79.38f, -80f)
        lineToRelative(-79.38f, -80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(330.97f, 256f)
        lineTo(170f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 448f)
        curveToRelative(106f, 0f, 192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveTo(150f, 448f, 256f, 448f)
        close()
      }
    }.build()

    return _ArrowForwardCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowForwardCircleOutline: ImageVector? = null
