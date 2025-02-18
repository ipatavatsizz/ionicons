package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Newspaper: ImageVector
  get() {
    if (_NewspaperSharp != null) {
      return _NewspaperSharp!!
    }
    _NewspaperSharp = ImageVector.Builder(
      name = "Sharp.NewspaperSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(468f, 112f)
        horizontalLineTo(416f)
        verticalLineTo(416f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineToRelative(0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        verticalLineTo(124f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 468f, 112f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(431.15f, 477.75f)
        arcTo(64.11f, 64.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 416f)
        lineTo(384f, 44f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        lineTo(44f, 32f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 44f)
        lineTo(32f, 424f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        lineTo(430.85f, 480f)
        arcToRelative(1.14f, 1.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, -2.25f)
        close()
        moveTo(96f, 208f)
        lineTo(96f, 112f)
        horizontalLineToRelative(96f)
        verticalLineToRelative(96f)
        close()
        moveTo(320f, 400f)
        lineTo(96f, 400f)
        lineTo(96f, 368f)
        lineTo(320f, 368f)
        close()
        moveTo(320f, 336f)
        lineTo(96f, 336f)
        lineTo(96f, 304f)
        lineTo(320f, 304f)
        close()
        moveTo(320f, 272f)
        lineTo(96f, 272f)
        lineTo(96f, 240f)
        lineTo(320f, 240f)
        close()
        moveTo(320f, 208f)
        lineTo(224f, 208f)
        lineTo(224f, 176f)
        horizontalLineToRelative(96f)
        close()
        moveTo(320f, 144f)
        lineTo(224f, 144f)
        lineTo(224f, 112f)
        horizontalLineToRelative(96f)
        close()
      }
    }.build()

    return _NewspaperSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NewspaperSharp: ImageVector? = null
