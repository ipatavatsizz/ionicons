package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.VolumeOff: ImageVector
  get() {
    if (_VolumeOffOutline != null) {
      return _VolumeOffOutline!!
    }
    _VolumeOffOutline = ImageVector.Builder(
      name = "Outline.VolumeOffOutline",
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
        moveTo(237.65f, 192f)
        horizontalLineTo(168f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineTo(312f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(69.65f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.14f, 3.63f)
        lineToRelative(91.47f, 75f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 392.17f)
        verticalLineTo(119.83f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.74f, -6.44f)
        lineToRelative(-91.47f, 75f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 237.65f, 192f)
        close()
      }
    }.build()

    return _VolumeOffOutline!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeOffOutline: ImageVector? = null
