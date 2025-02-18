package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bookmarks: ImageVector
  get() {
    if (_BookmarksOutline != null) {
      return _BookmarksOutline!!
    }
    _BookmarksOutline = ImageVector.Builder(
      name = "Outline.BookmarksOutline",
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
        moveTo(128f, 80f)
        verticalLineTo(64f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
        horizontalLineTo(400f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineTo(432f)
        lineToRelative(-80f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 96f)
        horizontalLineTo(112f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
        verticalLineTo(496f)
        lineTo(216f, 368f)
        lineTo(368f, 496f)
        verticalLineTo(144f)
        arcTo(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 96f)
        close()
      }
    }.build()

    return _BookmarksOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BookmarksOutline: ImageVector? = null
