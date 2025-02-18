package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PhoneLandscape: ImageVector
  get() {
    if (_PhoneLandscapeSharp != null) {
      return _PhoneLandscapeSharp!!
    }
    _PhoneLandscapeSharp = ImageVector.Builder(
      name = "Sharp.PhoneLandscapeSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(0f, 130f)
        verticalLineTo(382f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
        horizontalLineTo(494f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, -18f)
        verticalLineTo(130f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18f, -18f)
        horizontalLineTo(18f)
        arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 130f)
        close()
        moveTo(448f, 364f)
        horizontalLineTo(64f)
        verticalLineTo(148f)
        horizontalLineTo(448f)
        close()
      }
    }.build()

    return _PhoneLandscapeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PhoneLandscapeSharp: ImageVector? = null
