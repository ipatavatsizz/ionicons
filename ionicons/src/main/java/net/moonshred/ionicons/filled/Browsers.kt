package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Browsers: ImageVector
  get() {
    if (_Browsers != null) {
      return _Browsers!!
    }
    _Browsers = ImageVector.Builder(
      name = "Filled.Browsers",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 48f)
        lineTo(96f, 48f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        lineTo(32f, 400f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        lineTo(416f, 464f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        lineTo(480f, 112f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 416f, 48f)
        close()
        moveTo(440f, 144f)
        lineTo(72f, 144f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        lineTo(64f, 112f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 80f)
        lineTo(416f, 80f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        verticalLineToRelative(24f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 440f, 144f)
        close()
      }
    }.build()

    return _Browsers!!
  }

@Suppress("ObjectPropertyName")
private var _Browsers: ImageVector? = null
