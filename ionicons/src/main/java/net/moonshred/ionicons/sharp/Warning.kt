package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Warning: ImageVector
  get() {
    if (_WarningSharp != null) {
      return _WarningSharp!!
    }
    _WarningSharp = ImageVector.Builder(
      name = "Sharp.WarningSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(479f, 447.77f)
        lineTo(268.43f, 56.64f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.09f, 0f)
        lineTo(43.73f, 447.77f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.05f, 11.79f)
        lineTo(472f, 459.56f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 479f, 447.77f)
        close()
        moveTo(281.38f, 411.48f)
        horizontalLineToRelative(-40f)
        verticalLineToRelative(-40f)
        horizontalLineToRelative(40f)
        close()
        moveTo(277.38f, 347.56f)
        horizontalLineToRelative(-32f)
        lineToRelative(-6f, -160f)
        horizontalLineToRelative(44f)
        close()
      }
    }.build()

    return _WarningSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WarningSharp: ImageVector? = null
