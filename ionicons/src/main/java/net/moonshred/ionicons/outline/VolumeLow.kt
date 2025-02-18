package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.VolumeLow: ImageVector
  get() {
    if (_VolumeLowOutline != null) {
      return _VolumeLowOutline!!
    }
    _VolumeLowOutline = ImageVector.Builder(
      name = "Outline.VolumeLowOutline",
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
        moveTo(189.65f, 192f)
        horizontalLineTo(120f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineTo(312f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(69.65f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.14f, 3.63f)
        lineToRelative(91.47f, 75f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 392.17f)
        verticalLineTo(119.83f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.74f, -6.44f)
        lineToRelative(-91.47f, 75f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 189.65f, 192f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 320f)
        curveToRelative(9.74f, -19.41f, 16f, -40.81f, 16f, -64f)
        curveToRelative(0f, -23.51f, -6f, -44.4f, -16f, -64f)
      }
    }.build()

    return _VolumeLowOutline!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeLowOutline: ImageVector? = null
