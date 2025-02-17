package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Archive: ImageVector
  get() {
    if (_ArchiveOutline != null) {
      return _ArchiveOutline!!
    }
    _ArchiveOutline = ImageVector.Builder(
      name = "Outline.ArchiveOutline",
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
        moveTo(80f, 152f)
        verticalLineTo(408f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
        horizontalLineTo(392f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
        verticalLineTo(152f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(76f, 64f)
        lineTo(436f, 64f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 92f)
        lineTo(464f, 116f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 436f, 144f)
        lineTo(76f, 144f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 116f)
        lineTo(48f, 92f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 304f)
        lineToRelative(-64f, 64f)
        lineToRelative(-64f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 345.89f)
        lineTo(256f, 224f)
      }
    }.build()

    return _ArchiveOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArchiveOutline: ImageVector? = null
