package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Podium: ImageVector
  get() {
    if (_PodiumOutline != null) {
      return _PodiumOutline!!
    }
    _PodiumOutline = ImageVector.Builder(
      name = "Outline.PodiumOutline",
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
        moveTo(32f, 160f)
        verticalLineTo(456f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineTo(176f)
        verticalLineTo(160f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(48f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 160f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 48f)
        horizontalLineTo(192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(464f)
        horizontalLineTo(336f)
        verticalLineTo(64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(464f, 208f)
        horizontalLineTo(352f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(464f)
        horizontalLineTo(472f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        verticalLineTo(224f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 208f)
        close()
      }
    }.build()

    return _PodiumOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PodiumOutline: ImageVector? = null
