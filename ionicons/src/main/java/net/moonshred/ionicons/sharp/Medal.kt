package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Medal: ImageVector
  get() {
    if (_MedalSharp != null) {
      return _MedalSharp!!
    }
    _MedalSharp = ImageVector.Builder(
      name = "Sharp.MedalSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 32f)
        lineToRelative(-64f, 128f)
        lineToRelative(289.11f, 0f)
        lineToRelative(80.22f, -128f)
        lineToRelative(-305.33f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 144f)
        lineTo(424f, 32f)
        lineTo(298f, 231.08f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = false, -84f, 0f)
        lineTo(189.53f, 192f)
        horizontalLineTo(43.82f)
        lineToRelative(86.66f, 134.89f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = false, 251f, 0f)
        close()
        moveTo(256f, 422f)
        arcToRelative(70f, 70f, 0f, isMoreThanHalf = true, isPositiveArc = true, 70f, -70f)
        arcTo(70.08f, 70.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 422f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 352f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _MedalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MedalSharp: ImageVector? = null
