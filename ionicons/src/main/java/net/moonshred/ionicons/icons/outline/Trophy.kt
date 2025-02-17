package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Trophy: ImageVector
  get() {
    if (_TrophyOutline != null) {
      return _TrophyOutline!!
    }
    _TrophyOutline = ImageVector.Builder(
      name = "Outline.TrophyOutline",
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
        moveTo(176f, 464f)
        lineTo(336f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 464f)
        lineTo(256f, 336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 224f)
        curveToRelative(0f, -50.64f, -0.08f, -134.63f, -0.12f, -160f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        lineToRelative(-223.79f, 0.26f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 15.95f)
        curveToRelative(0f, 30.58f, -0.13f, 129.17f, -0.13f, 159.79f)
        curveToRelative(0f, 64.28f, 83f, 112f, 128f, 112f)
        reflectiveCurveTo(384f, 288.28f, 384f, 224f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 96f)
        horizontalLineTo(48f)
        verticalLineToRelative(16f)
        curveToRelative(0f, 55.22f, 33.55f, 112f, 80f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 96f)
        horizontalLineToRelative(80f)
        verticalLineToRelative(16f)
        curveToRelative(0f, 55.22f, -33.55f, 112f, -80f, 112f)
      }
    }.build()

    return _TrophyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TrophyOutline: ImageVector? = null
