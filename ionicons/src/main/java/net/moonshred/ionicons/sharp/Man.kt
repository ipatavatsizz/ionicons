package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Man: ImageVector
  get() {
    if (_ManSharp != null) {
      return _ManSharp!!
    }
    _ManSharp = ImageVector.Builder(
      name = "Sharp.ManSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 56f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 128f)
        horizontalLineTo(176f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        verticalLineTo(320f)
        horizontalLineToRelative(48f)
        verticalLineTo(192f)
        horizontalLineToRelative(8f)
        verticalLineTo(512f)
        horizontalLineToRelative(52f)
        verticalLineTo(328f)
        horizontalLineToRelative(8f)
        verticalLineTo(512f)
        horizontalLineToRelative(52f)
        verticalLineTo(192f)
        horizontalLineToRelative(8f)
        verticalLineTo(320f)
        horizontalLineToRelative(48f)
        verticalLineTo(160f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 336f, 128f)
        close()
      }
    }.build()

    return _ManSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ManSharp: ImageVector? = null
