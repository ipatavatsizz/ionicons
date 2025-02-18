package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Card: ImageVector
  get() {
    if (_CardSharp != null) {
      return _CardSharp!!
    }
    _CardSharp = ImageVector.Builder(
      name = "Sharp.CardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(222f)
        horizontalLineTo(32f)
        close()
        moveTo(98f, 278f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
        horizontalLineToRelative(92f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        verticalLineToRelative(64f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        horizontalLineTo(106f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 80f)
        horizontalLineTo(48f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
        verticalLineToRelative(66f)
        horizontalLineTo(480f)
        verticalLineTo(96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 80f)
        close()
      }
    }.build()

    return _CardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CardSharp: ImageVector? = null
