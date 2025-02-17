package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Watch: ImageVector
  get() {
    if (_WatchOutline != null) {
      return _WatchOutline!!
    }
    _WatchOutline = ImageVector.Builder(
      name = "Outline.WatchOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 112f)
        lineTo(336f, 112f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 176f)
        lineTo(400f, 336f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 400f)
        lineTo(176f, 400f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 336f)
        lineTo(112f, 176f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 112f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 112f)
        verticalLineTo(40f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
        horizontalLineTo(328f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        verticalLineToRelative(72f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 400f)
        verticalLineToRelative(72f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        horizontalLineTo(184f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(400f)
      }
    }.build()

    return _WatchOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WatchOutline: ImageVector? = null
