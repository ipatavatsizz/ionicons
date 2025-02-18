package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.PauseCircle: ImageVector
  get() {
    if (_PauseCircle != null) {
      return _PauseCircle!!
    }
    _PauseCircle = ImageVector.Builder(
      name = "Filled.PauseCircle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(224f, 320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(192f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
        moveTo(320f, 320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(288f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
      }
    }.build()

    return _PauseCircle!!
  }

@Suppress("ObjectPropertyName")
private var _PauseCircle: ImageVector? = null
