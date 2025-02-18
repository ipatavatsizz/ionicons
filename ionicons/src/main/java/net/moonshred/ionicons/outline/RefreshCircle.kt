package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.RefreshCircle: ImageVector
  get() {
    if (_RefreshCircleOutline != null) {
      return _RefreshCircleOutline!!
    }
    _RefreshCircleOutline = ImageVector.Builder(
      name = "Outline.RefreshCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 28f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(288f, 193f)
        reflectiveCurveToRelative(12.18f, -6f, -32f, -6f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 28f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 149f)
        lineToRelative(40f, 40f)
        lineToRelative(-40f, 40f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 64f)
        curveTo(150f, 64f, 64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        close()
      }
    }.build()

    return _RefreshCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RefreshCircleOutline: ImageVector? = null
