package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Save: ImageVector
  get() {
    if (_Save != null) {
      return _Save!!
    }
    _Save = ImageVector.Builder(
      name = "Filled.Save",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(465.94f, 119.76f)
        lineToRelative(-73.7f, -73.7f)
        horizontalLineToRelative(0f)
        arcTo(47.68f, 47.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 358.3f, 32f)
        horizontalLineTo(96f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
        verticalLineTo(416f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        horizontalLineTo(416f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        verticalLineTo(153.7f)
        arcTo(47.68f, 47.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 465.94f, 119.76f)
        close()
        moveTo(120f, 112f)
        horizontalLineTo(296f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        verticalLineToRelative(48f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        horizontalLineTo(120f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(120f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 112f)
        close()
        moveTo(259.75f, 431.91f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 76.16f, -76.16f)
        arcTo(80.06f, 80.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 259.75f, 431.91f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 352f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
    }.build()

    return _Save!!
  }

@Suppress("ObjectPropertyName")
private var _Save: ImageVector? = null
