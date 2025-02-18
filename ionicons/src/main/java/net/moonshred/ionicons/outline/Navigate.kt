package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Navigate: ImageVector
  get() {
    if (_NavigateOutline != null) {
      return _NavigateOutline!!
    }
    _NavigateOutline = ImageVector.Builder(
      name = "Outline.NavigateOutline",
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
        moveTo(448f, 64f)
        lineTo(64f, 240.14f)
        horizontalLineTo(264f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        verticalLineTo(448f)
        close()
      }
    }.build()

    return _NavigateOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NavigateOutline: ImageVector? = null
