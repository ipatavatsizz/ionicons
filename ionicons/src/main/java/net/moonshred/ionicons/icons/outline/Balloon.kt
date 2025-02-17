package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Balloon: ImageVector
  get() {
    if (_BalloonOutline != null) {
      return _BalloonOutline!!
    }
    _BalloonOutline = ImageVector.Builder(
      name = "Outline.BalloonOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(414.11f, 153.82f)
        curveTo(429.66f, 264.4f, 345.85f, 357.09f, 282.54f, 366f)
        reflectiveCurveToRelative(-169.48f, -57.5f, -185f, -167.68f)
        arcToRelative(
          159.82f,
          159.82f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          316.53f,
          -44.49f
        )
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(236.06f, 308.05f)
        curveToRelative(-32.83f, -13f, -67.08f, -43.1f, -82.27f, -85.46f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(367.7f, 495.78f)
        curveToRelative(-32.83f, -13f, -63.31f, -40.06f, -78.5f, -82.41f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(266.71f, 368.21f)
        lineToRelative(-9.17f, 49.61f)
        lineToRelative(63.31f, -8.9f)
        lineToRelative(-22.49f, -45.16f)
        lineToRelative(-31.65f, 4.45f)
        close()
      }
    }.build()

    return _BalloonOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BalloonOutline: ImageVector? = null
