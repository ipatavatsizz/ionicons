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

val Ionicons.Outline.Glasses: ImageVector
  get() {
    if (_GlassesOutline != null) {
      return _GlassesOutline!!
    }
    _GlassesOutline = ImageVector.Builder(
      name = "Outline.GlassesOutline",
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
        moveTo(224f, 232f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 200f)
        lineTo(464f, 200f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 200f)
        lineTo(48f, 200f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 200f)
        curveToRelative(0f, 96f, 16f, 128f, 80f, 128f)
        reflectiveCurveToRelative(80f, -32f, 80f, -128f)
        curveToRelative(0f, 0f, -16f, -16f, -80f, -16f)
        reflectiveCurveTo(64f, 200f, 64f, 200f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 200f)
        curveToRelative(0f, 96f, -16f, 128f, -80f, 128f)
        reflectiveCurveToRelative(-80f, -32f, -80f, -128f)
        curveToRelative(0f, 0f, 16f, -16f, 80f, -16f)
        reflectiveCurveTo(448f, 200f, 448f, 200f)
        close()
      }
    }.build()

    return _GlassesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _GlassesOutline: ImageVector? = null
