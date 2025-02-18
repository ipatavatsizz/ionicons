package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Journal: ImageVector
  get() {
    if (_JournalSharp != null) {
      return _JournalSharp!!
    }
    _JournalSharp = ImageVector.Builder(
      name = "Sharp.JournalSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(290f, 32f)
        horizontalLineTo(104f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 56f)
        verticalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(290f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 32f)
        horizontalLineTo(350f)
        verticalLineTo(480f)
        horizontalLineToRelative(58f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(56f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 408f, 32f)
        close()
      }
    }.build()

    return _JournalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _JournalSharp: ImageVector? = null
