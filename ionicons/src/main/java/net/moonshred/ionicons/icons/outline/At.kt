package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.At: ImageVector
  get() {
    if (_AtOutline != null) {
      return _AtOutline!!
    }
    _AtOutline = ImageVector.Builder(
      name = "Outline.AtOutline",
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
        moveTo(320f, 254.27f)
        curveToRelative(-4.5f, 51f, -40.12f, 80f, -80.55f, 80f)
        reflectiveCurveToRelative(-67.34f, -35.82f, -63.45f, -80f)
        reflectiveCurveToRelative(37.12f, -80f, 77.55f, -80f)
        reflectiveCurveTo(323.88f, 210.27f, 320f, 254.27f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(319.77f, 415.77f)
        curveToRelative(-28.56f, 12f, -47.28f, 14.5f, -79.28f, 14.5f)
        curveToRelative(-97.2f, 0f, -169f, -78.8f, -160.49f, -176f)
        reflectiveCurveToRelative(94.31f, -176f, 191.51f, -176f)
        curveTo(381f, 78.27f, 441.19f, 150f, 432.73f, 246f)
        curveToRelative(-6.31f, 71.67f, -52.11f, 92.32f, -76.09f, 88.07f)
        curveToRelative(-22.56f, -4f, -41.18f, -24.42f, -37.74f, -63.5f)
        lineToRelative(8.48f, -96.25f)
      }
    }.build()

    return _AtOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AtOutline: ImageVector? = null
