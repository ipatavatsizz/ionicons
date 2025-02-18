package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Shirt: ImageVector
  get() {
    if (_ShirtOutline != null) {
      return _ShirtOutline!!
    }
    _ShirtOutline = ImageVector.Builder(
      name = "Outline.ShirtOutline",
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
        moveTo(314.56f, 48f)
        reflectiveCurveTo(291.78f, 56f, 256f, 56f)
        reflectiveCurveToRelative(-58.56f, -8f, -58.56f, -8f)
        arcToRelative(
          31.94f,
          31.94f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -10.57f,
          1.8f
        )
        lineTo(32f, 104f)
        lineToRelative(16.63f, 88f)
        lineToRelative(48.88f, 5.52f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 118.8f, 222.1f)
        lineTo(112f, 464f)
        horizontalLineTo(400f)
        lineToRelative(-6.8f, -241.9f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.29f, -24.58f)
        lineTo(463.37f, 192f)
        lineTo(480f, 104f)
        lineTo(325.13f, 49.8f)
        arcTo(31.94f, 31.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 314.56f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(333.31f, 52.66f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -154.62f, 0f)
      }
    }.build()

    return _ShirtOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ShirtOutline: ImageVector? = null
