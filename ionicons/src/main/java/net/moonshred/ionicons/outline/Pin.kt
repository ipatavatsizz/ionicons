package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Pin: ImageVector
  get() {
    if (_PinOutline != null) {
      return _PinOutline!!
    }
    _PinOutline = ImageVector.Builder(
      name = "Outline.PinOutline",
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
        moveTo(256f, 96f)
        moveToRelative(-64f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 164f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
        horizontalLineTo(249f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
        verticalLineTo(457.56f)
        arcToRelative(
          32.09f,
          32.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.49f,
          12.38f
        )
        lineToRelative(10.07f, 24f)
        arcToRelative(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.88f, 0f)
        lineToRelative(10.07f, -24f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 272f, 457.56f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(280f, 72f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
    }.build()

    return _PinOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PinOutline: ImageVector? = null
