package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PhonePortrait: ImageVector
  get() {
    if (_PhonePortraitSharp != null) {
      return _PhonePortraitSharp!!
    }
    _PhonePortraitSharp = ImageVector.Builder(
      name = "Sharp.PhonePortraitSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(382f, 0f)
        horizontalLineTo(130f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18f, 18f)
        verticalLineTo(494f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
        horizontalLineTo(382f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, -18f)
        verticalLineTo(18f)
        arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 382f, 0f)
        close()
        moveTo(148f, 448f)
        verticalLineTo(64f)
        horizontalLineTo(364f)
        verticalLineTo(448f)
        close()
      }
    }.build()

    return _PhonePortraitSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PhonePortraitSharp: ImageVector? = null
