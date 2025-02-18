package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bookmark: ImageVector
  get() {
    if (_BookmarkOutline != null) {
      return _BookmarkOutline!!
    }
    _BookmarkOutline = ImageVector.Builder(
      name = "Outline.BookmarkOutline",
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
        moveTo(352f, 48f)
        horizontalLineTo(160f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
        verticalLineTo(464f)
        lineTo(256f, 336f)
        lineTo(400f, 464f)
        verticalLineTo(96f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 48f)
        close()
      }
    }.build()

    return _BookmarkOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BookmarkOutline: ImageVector? = null
