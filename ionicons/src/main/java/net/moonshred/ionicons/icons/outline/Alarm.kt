package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Alarm: ImageVector
  get() {
    if (_AlarmOutline != null) {
      return _AlarmOutline!!
    }
    _AlarmOutline = ImageVector.Builder(
      name = "Outline.AlarmOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(416.07f, 272f)
        arcToRelative(160f, 160f, 0f, isMoreThanHalf = true, isPositiveArc = false, -160f, 160f)
        arcTo(160f, 160f, 0f, isMoreThanHalf = false, isPositiveArc = false, 416.07f, 272f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(142.12f, 91.21f)
        arcTo(46.67f, 46.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 80f)
        lineToRelative(-2.79f, 0.08f)
        curveTo(83.66f, 81.62f, 64f, 104f, 64.07f, 131f)
        curveToRelative(0f, 13.21f, 4.66f, 19.37f, 10.88f, 27.23f)
        arcTo(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.19f, 160f)
        horizontalLineToRelative(0.88f)
        arcToRelative(
          3.23f,
          3.23f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.54f,
          -1.31f
        )
        lineTo(142.38f, 99f)
        arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, -4f)
        arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 142.12f, 91.21f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(369.88f, 91.21f)
        arcTo(46.67f, 46.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 80f)
        lineToRelative(2.79f, 0.08f)
        curveTo(428.34f, 81.62f, 448f, 104f, 447.93f, 131f)
        curveToRelative(0f, 13.21f, -4.66f, 19.37f, -10.88f, 27.23f)
        arcToRelative(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.24f, 1.76f)
        horizontalLineToRelative(-0.88f)
        arcToRelative(
          3.23f,
          3.23f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.54f,
          -1.31f
        )
        lineTo(369.62f, 99f)
        arcToRelative(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, -4f)
        arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 369.88f, 91.21f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256.07f, 160f)
        lineToRelative(0f, 112f)
        lineToRelative(-80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416.07f, 432f)
        lineTo(376.07f, 392f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96.07f, 432f)
        lineTo(136.07f, 392f)
      }
    }.build()

    return _AlarmOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AlarmOutline: ImageVector? = null
