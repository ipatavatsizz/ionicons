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

val Ionicons.Outline.Language: ImageVector
  get() {
    if (_LanguageOutline != null) {
      return _LanguageOutline!!
    }
    _LanguageOutline = ImageVector.Builder(
      name = "Outline.LanguageOutline",
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
        moveTo(48f, 112f)
        lineTo(336f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 64f)
        lineTo(192f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(272f, 448f)
        lineToRelative(96f, -224f)
        lineToRelative(96f, 224f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(301.5f, 384f)
        lineTo(434.5f, 384f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(281.3f, 112f)
        reflectiveCurveTo(257f, 206f, 199f, 277f)
        reflectiveCurveTo(80f, 384f, 80f, 384f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 336f)
        reflectiveCurveToRelative(-35f, -27f, -72f, -75f)
        reflectiveCurveToRelative(-56f, -85f, -56f, -85f)
      }
    }.build()

    return _LanguageOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LanguageOutline: ImageVector? = null
