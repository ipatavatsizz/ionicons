package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.EllipsisHorizontal: ImageVector
  get() {
    if (_EllipsisHorizontalSharp != null) {
      return _EllipsisHorizontalSharp!!
    }
    _EllipsisHorizontalSharp = ImageVector.Builder(
      name = "Sharp.EllipsisHorizontalSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 256f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 256f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
    }.build()

    return _EllipsisHorizontalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EllipsisHorizontalSharp: ImageVector? = null
