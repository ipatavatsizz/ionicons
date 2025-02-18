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

val Ionicons.Outline.FileTrayFull: ImageVector
  get() {
    if (_FileTrayFullOutline != null) {
      return _FileTrayFullOutline!!
    }
    _FileTrayFullOutline = ImageVector.Builder(
      name = "Outline.FileTrayFullOutline",
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
        moveTo(384f, 80f)
        horizontalLineTo(128f)
        curveToRelative(-26f, 0f, -43f, 14f, -48f, 40f)
        lineTo(48f, 272f)
        verticalLineTo(384f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineTo(416f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
        verticalLineTo(272f)
        lineTo(432f, 120f)
        curveTo(427f, 93f, 409f, 80f, 384f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 272f)
        lineTo(192f, 272f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 272f)
        lineTo(464f, 272f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 272f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 144f)
        lineTo(368f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 208f)
        lineTo(384f, 208f)
      }
    }.build()

    return _FileTrayFullOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FileTrayFullOutline: ImageVector? = null
