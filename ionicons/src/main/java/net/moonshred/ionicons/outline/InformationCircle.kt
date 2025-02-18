package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.InformationCircle: ImageVector
  get() {
    if (_InformationCircleOutline != null) {
      return _InformationCircleOutline!!
    }
    _InformationCircleOutline = ImageVector.Builder(
      name = "Outline.InformationCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(248f, 64f)
        curveTo(146.39f, 64f, 64f, 146.39f, 64f, 248f)
        reflectiveCurveToRelative(82.39f, 184f, 184f, 184f)
        reflectiveCurveToRelative(184f, -82.39f, 184f, -184f)
        reflectiveCurveTo(349.61f, 64f, 248f, 64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(220f, 220f)
        lineToRelative(32f, 0f)
        lineToRelative(0f, 116f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(208f, 340f)
        lineTo(296f, 340f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(248f, 130f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = false, 26f, 26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 130f)
        close()
      }
    }.build()

    return _InformationCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _InformationCircleOutline: ImageVector? = null
