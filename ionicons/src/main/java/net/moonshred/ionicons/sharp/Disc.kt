package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Disc: ImageVector
  get() {
    if (_DiscSharp != null) {
      return _DiscSharp!!
    }
    _DiscSharp = ImageVector.Builder(
      name = "Sharp.DiscSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(414.39f, 97.61f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 97.61f, 414.39f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 414.39f, 97.61f)
        close()
        moveTo(256f, 336f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, -80f)
        arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 336f)
        close()
      }
    }.build()

    return _DiscSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DiscSharp: ImageVector? = null
