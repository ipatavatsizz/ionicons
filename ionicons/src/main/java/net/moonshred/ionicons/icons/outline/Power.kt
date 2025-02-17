package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Power: ImageVector
  get() {
    if (_PowerOutline != null) {
      return _PowerOutline!!
    }
    _PowerOutline = ImageVector.Builder(
      name = "Outline.PowerOutline",
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
        moveTo(378f, 108f)
        arcToRelative(191.41f, 191.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 70f, 148f)
        curveToRelative(0f, 106f, -86f, 192f, -192f, 192f)
        reflectiveCurveTo(64f, 362f, 64f, 256f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = false, isPositiveArc = true, 69f, -148f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 64f)
        lineTo(256f, 256f)
      }
    }.build()

    return _PowerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PowerOutline: ImageVector? = null
