package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Options: ImageVector
  get() {
    if (_OptionsSharp != null) {
      return _OptionsSharp!!
    }
    _OptionsSharp = ImageVector.Builder(
      name = "Sharp.OptionsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(381.25f, 112f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -90.5f, 0f)
        horizontalLineTo(48f)
        verticalLineToRelative(32f)
        horizontalLineTo(290.75f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.5f, 0f)
        horizontalLineTo(464f)
        verticalLineTo(112f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176f, 208f)
        arcToRelative(
          48.09f,
          48.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -45.25f,
          32f
        )
        horizontalLineTo(48f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(82.75f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.5f, 0f)
        horizontalLineTo(464f)
        verticalLineTo(240f)
        horizontalLineTo(221.25f)
        arcTo(48.09f, 48.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 208f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 336f)
        arcToRelative(
          48.09f,
          48.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -45.25f,
          32f
        )
        horizontalLineTo(48f)
        verticalLineToRelative(32f)
        horizontalLineTo(290.75f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.5f, 0f)
        horizontalLineTo(464f)
        verticalLineTo(368f)
        horizontalLineTo(381.25f)
        arcTo(48.09f, 48.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 336f, 336f)
        close()
      }
    }.build()

    return _OptionsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _OptionsSharp: ImageVector? = null
