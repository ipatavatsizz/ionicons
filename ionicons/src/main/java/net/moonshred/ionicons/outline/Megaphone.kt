package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Megaphone: ImageVector
  get() {
    if (_MegaphoneOutline != null) {
      return _MegaphoneOutline!!
    }
    _MegaphoneOutline = ImageVector.Builder(
      name = "Outline.MegaphoneOutline",
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
        moveTo(407.94f, 52.22f)
        reflectiveCurveTo(321.3f, 160f, 240f, 160f)
        horizontalLineTo(80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineToRelative(96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(240f)
        curveToRelative(81.3f, 0f, 167.94f, 108.23f, 167.94f, 108.23f)
        curveToRelative(6.06f, 8f, 24.06f, 2.52f, 24.06f, -9.83f)
        verticalLineTo(62f)
        curveTo(432f, 49.69f, 415f, 43.18f, 407.94f, 52.22f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 256f)
        reflectiveCurveToRelative(-16f, -6f, -16f, -32f)
        reflectiveCurveToRelative(16f, -32f, 16f, -32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 246f)
        reflectiveCurveToRelative(16f, -4.33f, 16f, -22f)
        reflectiveCurveToRelative(-16f, -22f, -16f, -22f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 160f)
        lineTo(256f, 288f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 160f)
        lineTo(112f, 288f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 288f)
        verticalLineTo(456f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(53f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.29f, -20.73f)
        curveTo(211.91f, 416.39f, 192f, 386.08f, 192f, 336f)
        horizontalLineToRelative(16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(304f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(192f)
      }
    }.build()

    return _MegaphoneOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MegaphoneOutline: ImageVector? = null
