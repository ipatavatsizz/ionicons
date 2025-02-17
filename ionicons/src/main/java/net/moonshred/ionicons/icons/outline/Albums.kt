package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Albums: ImageVector
  get() {
    if (_AlbumsOutline != null) {
      return _AlbumsOutline!!
    }
    _AlbumsOutline = ImageVector.Builder(
      name = "Outline.AlbumsOutline",
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
        moveTo(92.87f, 176f)
        lineTo(419.13f, 176f)
        arcTo(28.87f, 28.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 204.87f)
        lineTo(448f, 403.13f)
        arcTo(28.87f, 28.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 419.13f, 432f)
        lineTo(92.87f, 432f)
        arcTo(28.87f, 28.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 403.13f)
        lineTo(64f, 204.87f)
        arcTo(28.87f, 28.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92.87f, 176f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(144f, 80f)
        lineTo(368f, 80f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(112f, 128f)
        lineTo(400f, 128f)
      }
    }.build()

    return _AlbumsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AlbumsOutline: ImageVector? = null
