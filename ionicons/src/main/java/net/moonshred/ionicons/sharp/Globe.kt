package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Globe: ImageVector
  get() {
    if (_GlobeSharp != null) {
      return _GlobeSharp!!
    }
    _GlobeSharp = ImageVector.Builder(
      name = "Sharp.GlobeSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f
      ) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f
      ) {
        moveTo(256f, 48f)
        curveToRelative(-58.07f, 0f, -112.67f, 93.13f, -112.67f, 208f)
        reflectiveCurveTo(197.93f, 464f, 256f, 464f)
        reflectiveCurveToRelative(112.67f, -93.13f, 112.67f, -208f)
        reflectiveCurveTo(314.07f, 48f, 256f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(117.33f, 121.33f)
        curveToRelative(38.24f, 27.15f, 86.38f, 43.34f, 138.67f, 43.34f)
        reflectiveCurveToRelative(100.43f, -16.19f, 138.67f, -43.34f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(394.67f, 390.67f)
        curveToRelative(-38.24f, -27.15f, -86.38f, -43.34f, -138.67f, -43.34f)
        reflectiveCurveToRelative(-100.43f, 16.19f, -138.67f, 43.34f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f
      ) {
        moveTo(256f, 48f)
        lineTo(256f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f
      ) {
        moveTo(464f, 256f)
        lineTo(48f, 256f)
      }
    }.build()

    return _GlobeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GlobeSharp: ImageVector? = null
