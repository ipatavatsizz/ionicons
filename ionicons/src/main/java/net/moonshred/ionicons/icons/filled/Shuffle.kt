package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Shuffle: ImageVector
  get() {
    if (_Shuffle != null) {
      return _Shuffle!!
    }
    _Shuffle = ImageVector.Builder(
      name = "Filled.Shuffle",
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
        moveTo(400f, 304f)
        lineToRelative(48f, 48f)
        lineToRelative(-48f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 112f)
        lineToRelative(48f, 48f)
        lineToRelative(-48f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 352f)
        horizontalLineToRelative(85.19f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66.56f, -35.62f)
        lineTo(256f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 160f)
        horizontalLineToRelative(85.19f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.56f, 35.62f)
        lineToRelative(80.5f, 120.76f)
        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 362.81f, 352f)
        horizontalLineTo(416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 160f)
        horizontalLineTo(362.81f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -66.56f, 35.62f)
        lineTo(288f, 208f)
      }
    }.build()

    return _Shuffle!!
  }

@Suppress("ObjectPropertyName")
private var _Shuffle: ImageVector? = null
