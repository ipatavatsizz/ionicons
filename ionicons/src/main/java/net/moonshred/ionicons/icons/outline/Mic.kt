package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Mic: ImageVector
  get() {
    if (_MicOutline != null) {
      return _MicOutline!!
    }
    _MicOutline = ImageVector.Builder(
      name = "Outline.MicOutline",
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
        moveTo(192f, 448f)
        lineTo(320f, 448f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 208f)
        verticalLineToRelative(32f)
        curveToRelative(0f, 70.4f, -57.6f, 128f, -128f, 128f)
        horizontalLineToRelative(0f)
        curveToRelative(-70.4f, 0f, -128f, -57.6f, -128f, -128f)
        verticalLineTo(208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 368f)
        lineTo(256f, 448f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 64f)
        arcToRelative(63.68f, 63.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        verticalLineTo(239f)
        curveToRelative(0f, 35.2f, 29f, 65f, 64f, 65f)
        reflectiveCurveToRelative(64f, -29f, 64f, -65f)
        verticalLineTo(128f)
        curveTo(320f, 92f, 292f, 64f, 256f, 64f)
        close()
      }
    }.build()

    return _MicOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MicOutline: ImageVector? = null
