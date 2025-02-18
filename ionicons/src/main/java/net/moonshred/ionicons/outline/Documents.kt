package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Documents: ImageVector
  get() {
    if (_DocumentsOutline != null) {
      return _DocumentsOutline!!
    }
    _DocumentsOutline = ImageVector.Builder(
      name = "Outline.DocumentsOutline",
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
        moveTo(336f, 264.13f)
        verticalLineTo(436f)
        curveToRelative(0f, 24.3f, -19.05f, 44f, -42.95f, 44f)
        horizontalLineTo(107f)
        curveTo(83.05f, 480f, 64f, 460.3f, 64f, 436f)
        verticalLineTo(172f)
        arcToRelative(44.26f, 44.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, -44f)
        horizontalLineToRelative(94.12f)
        arcToRelative(
          24.55f,
          24.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          17.49f,
          7.36f
        )
        lineToRelative(109.15f, 111f)
        arcTo(25.4f, 25.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 264.13f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(200f, 128f)
        verticalLineTo(236f)
        arcToRelative(28.34f, 28.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 28f)
        horizontalLineTo(336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 128f)
        verticalLineTo(76f)
        arcToRelative(44.26f, 44.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, -44f)
        horizontalLineToRelative(94f)
        arcToRelative(
          24.83f,
          24.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          17.61f,
          7.36f
        )
        lineToRelative(109.15f, 111f)
        arcTo(25.09f, 25.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 168f)
        verticalLineTo(340f)
        curveToRelative(0f, 24.3f, -19.05f, 44f, -42.95f, 44f)
        horizontalLineTo(344f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(312f, 32f)
        verticalLineTo(140f)
        arcToRelative(28.34f, 28.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 28f)
        horizontalLineTo(448f)
      }
    }.build()

    return _DocumentsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentsOutline: ImageVector? = null
