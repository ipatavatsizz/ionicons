package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Folder: ImageVector
  get() {
    if (_FolderOutline != null) {
      return _FolderOutline!!
    }
    _FolderOutline = ImageVector.Builder(
      name = "Outline.FolderOutline",
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
        moveTo(440f, 432f)
        horizontalLineTo(72f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
        verticalLineTo(120f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 80f)
        horizontalLineToRelative(75.89f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.19f, 6.72f)
        lineToRelative(27.84f, 18.56f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 220.11f, 112f)
        horizontalLineTo(440f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
        verticalLineTo(392f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 440f, 432f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(32f, 192f)
        lineTo(480f, 192f)
      }
    }.build()

    return _FolderOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FolderOutline: ImageVector? = null
