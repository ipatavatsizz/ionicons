package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.MicCircle: ImageVector
  get() {
    if (_MicCircleOutline != null) {
      return _MicCircleOutline!!
    }
    _MicCircleOutline = ImageVector.Builder(
      name = "Outline.MicCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(224f, 368f)
        lineTo(288f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 224.3f)
        verticalLineToRelative(23.92f)
        curveToRelative(0f, 39.42f, -40.58f, 71.48f, -80f, 71.48f)
        horizontalLineToRelative(0f)
        curveToRelative(-39.42f, 0f, -80f, -32.06f, -80f, -71.48f)
        verticalLineTo(224.3f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 320f)
        lineTo(256f, 368f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 128f)
        lineTo(256f, 128f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304f, 176f)
        lineTo(304f, 240f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 288f)
        lineTo(256f, 288f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 240f)
        lineTo(208f, 176f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 128f)
        close()
      }
    }.build()

    return _MicCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MicCircleOutline: ImageVector? = null
