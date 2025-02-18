package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Chatbox: ImageVector
  get() {
    if (_ChatboxOutline != null) {
      return _ChatboxOutline!!
    }
    _ChatboxOutline = ImageVector.Builder(
      name = "Outline.ChatboxOutline",
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
        moveTo(408f, 64f)
        horizontalLineTo(104f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineTo(312f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineToRelative(40f)
        verticalLineToRelative(80f)
        lineToRelative(93.72f, -78.14f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.13f, -1.86f)
        horizontalLineTo(408f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(120f)
        arcTo(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 408f, 64f)
        close()
      }
    }.build()

    return _ChatboxOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChatboxOutline: ImageVector? = null
