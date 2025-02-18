package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bulb: ImageVector
  get() {
    if (_BulbOutline != null) {
      return _BulbOutline!!
    }
    _BulbOutline = ImageVector.Builder(
      name = "Outline.BulbOutline",
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
        moveTo(304f, 384f)
        verticalLineTo(360f)
        curveToRelative(0f, -29f, 31.54f, -56.43f, 52f, -76f)
        curveToRelative(28.84f, -27.57f, 44f, -64.61f, 44f, -108f)
        curveToRelative(0f, -80f, -63.73f, -144f, -144f, -144f)
        arcTo(143.6f, 143.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 176f)
        curveToRelative(0f, 41.84f, 15.81f, 81.39f, 44f, 108f)
        curveToRelative(20.35f, 19.21f, 52f, 46.7f, 52f, 76f)
        verticalLineToRelative(24f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(224f, 480f)
        lineTo(288f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 432f)
        lineTo(304f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 384f)
        lineTo(256f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(294f, 240f)
        reflectiveCurveToRelative(-21.51f, 16f, -38f, 16f)
        reflectiveCurveToRelative(-38f, -16f, -38f, -16f)
      }
    }.build()

    return _BulbOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BulbOutline: ImageVector? = null
