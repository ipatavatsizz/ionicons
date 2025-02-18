package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.VideocamOff: ImageVector
  get() {
    if (_VideocamOffOutline != null) {
      return _VideocamOffOutline!!
    }
    _VideocamOffOutline = ImageVector.Builder(
      name = "Outline.VideocamOffOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(50.19f, 140.57f)
        arcTo(51.94f, 51.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 180f)
        verticalLineTo(332f)
        arcToRelative(52.15f, 52.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52f, 52f)
        horizontalLineTo(268f)
        arcToRelative(51.6f, 51.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, -4.9f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(208f, 128f)
        horizontalLineToRelative(60.48f)
        arcTo(51.68f, 51.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 320f, 179.52f)
        verticalLineTo(248f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(416f, 416f)
        lineTo(80f, 80f)
      }
    }.build()

    return _VideocamOffOutline!!
  }

@Suppress("ObjectPropertyName")
private var _VideocamOffOutline: ImageVector? = null
