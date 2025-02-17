package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Videocam: ImageVector
  get() {
    if (_VideocamOutline != null) {
      return _VideocamOutline!!
    }
    _VideocamOutline = ImageVector.Builder(
      name = "Outline.VideocamOutline",
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
        moveTo(374.79f, 308.78f)
        lineTo(457.5f, 367f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 352.38f)
        verticalLineTo(159.62f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 457.5f, 145f)
        lineToRelative(-82.71f, 58.22f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 216.3f)
        verticalLineToRelative(79.4f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 374.79f, 308.78f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(268f, 384f)
        horizontalLineTo(84f)
        arcToRelative(52.15f, 52.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52f, -52f)
        verticalLineTo(180f)
        arcToRelative(52.15f, 52.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, -52f)
        horizontalLineTo(268.48f)
        arcTo(51.68f, 51.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 320f, 179.52f)
        verticalLineTo(332f)
        arcTo(52.15f, 52.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 268f, 384f)
        close()
      }
    }.build()

    return _VideocamOutline!!
  }

@Suppress("ObjectPropertyName")
private var _VideocamOutline: ImageVector? = null
