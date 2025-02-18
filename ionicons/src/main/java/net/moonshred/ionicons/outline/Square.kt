package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Square: ImageVector
  get() {
    if (_SquareOutline != null) {
      return _SquareOutline!!
    }
    _SquareOutline = ImageVector.Builder(
      name = "Outline.SquareOutline",
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
        moveTo(416f, 448f)
        horizontalLineTo(96f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
        verticalLineTo(96f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
        horizontalLineTo(416f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        verticalLineTo(416f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 448f)
        close()
      }
    }.build()

    return _SquareOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SquareOutline: ImageVector? = null
