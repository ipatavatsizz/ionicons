package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.FolderOpen: ImageVector
  get() {
    if (_FolderOpenOutline != null) {
      return _FolderOpenOutline!!
    }
    _FolderOpenOutline = ImageVector.Builder(
      name = "Outline.FolderOpenOutline",
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
        moveTo(64f, 192f)
        verticalLineTo(120f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
        horizontalLineToRelative(75.89f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.19f, 6.72f)
        lineToRelative(27.84f, 18.56f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 252.11f, 112f)
        horizontalLineTo(408f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
        verticalLineToRelative(40f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(479.9f, 226.55f)
        lineTo(463.68f, 392f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -39.93f, 40f)
        horizontalLineTo(88.25f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -39.93f, -40f)
        lineTo(32.1f, 226.55f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 192f)
        horizontalLineToRelative(384.1f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 479.9f, 226.55f)
        close()
      }
    }.build()

    return _FolderOpenOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FolderOpenOutline: ImageVector? = null
