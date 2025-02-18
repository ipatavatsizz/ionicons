package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Timer: ImageVector
  get() {
    if (_TimerOutline != null) {
      return _TimerOutline!!
    }
    _TimerOutline = ImageVector.Builder(
      name = "Outline.TimerOutline",
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
        moveTo(112.91f, 128f)
        arcTo(191.85f, 191.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 254f)
        curveToRelative(-1.18f, 106.35f, 85.65f, 193.8f, 192f, 194f)
        curveToRelative(106.2f, 0.2f, 192f, -85.83f, 192f, -192f)
        curveToRelative(0f, -104.54f, -83.55f, -189.61f, -187.5f, -192f)
        arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 68.37f)
        verticalLineTo(152f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(233.38f, 278.63f)
        lineToRelative(-79f, -113f)
        arcToRelative(
          8.13f,
          8.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          11.32f,
          -11.32f
        )
        lineToRelative(113f, 79f)
        arcToRelative(
          32.5f,
          32.5f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -37.25f,
          53.26f
        )
        arcTo(33.21f, 33.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 233.38f, 278.63f)
        close()
      }
    }.build()

    return _TimerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TimerOutline: ImageVector? = null
