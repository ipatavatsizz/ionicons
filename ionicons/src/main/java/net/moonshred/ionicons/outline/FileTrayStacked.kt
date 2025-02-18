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

val Ionicons.Outline.FileTrayStacked: ImageVector
  get() {
    if (_FileTrayStackedOutline != null) {
      return _FileTrayStackedOutline!!
    }
    _FileTrayStackedOutline = ImageVector.Builder(
      name = "Outline.FileTrayStackedOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 336f)
        verticalLineToRelative(96f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineTo(416f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
        verticalLineTo(336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 336f)
        lineTo(192f, 336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 336f)
        lineTo(464f, 336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 336f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 32f)
        horizontalLineTo(128f)
        curveToRelative(-26f, 0f, -43f, 14f, -48f, 40f)
        lineTo(48f, 192f)
        verticalLineToRelative(96f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineTo(416f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
        verticalLineTo(192f)
        lineTo(432f, 72f)
        curveTo(427f, 45f, 409f, 32f, 384f, 32f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 192f)
        lineTo(192f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 192f)
        lineTo(464f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 192f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 0f)
      }
    }.build()

    return _FileTrayStackedOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FileTrayStackedOutline: ImageVector? = null
