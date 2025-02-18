package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.AmericanFootball: ImageVector
  get() {
    if (_AmericanFootballOutline != null) {
      return _AmericanFootballOutline!!
    }
    _AmericanFootballOutline = ImageVector.Builder(
      name = "Outline.AmericanFootballOutline",
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
        moveTo(66.8f, 445.2f)
        arcToRelative(
          173.44f,
          267.57f,
          45f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          378.4f,
          -378.4f
        )
        arcToRelative(
          173.44f,
          267.57f,
          45f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -378.4f,
          378.4f
        )
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(334.04f, 177.96f)
        lineTo(177.96f, 334.04f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(278.3f, 278.3f)
        lineTo(233.7f, 233.7f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(322.89f, 233.7f)
        lineTo(278.3f, 189.11f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(456.68f, 211.4f)
        lineTo(300.6f, 55.32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(211.4f, 456.68f)
        lineTo(55.32f, 300.6f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(233.7f, 322.89f)
        lineTo(189.11f, 278.3f)
      }
    }.build()

    return _AmericanFootballOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AmericanFootballOutline: ImageVector? = null
