package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.CloseCircle: ImageVector
  get() {
    if (_CloseCircle != null) {
      return _CloseCircle!!
    }
    _CloseCircle = ImageVector.Builder(
      name = "Filled.CloseCircle",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
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
        moveTo(331.31f, 308.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -22.62f, 22.62f)
        lineTo(256f, 278.63f)
        lineToRelative(-52.69f, 52.68f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, -22.62f)
        lineTo(233.37f, 256f)
        lineToRelative(-52.68f, -52.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, -22.62f)
        lineTo(256f, 233.37f)
        lineToRelative(52.69f, -52.68f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 22.62f)
        lineTo(278.63f, 256f)
        close()
      }
    }.build()

    return _CloseCircle!!
  }

@Suppress("ObjectPropertyName")
private var _CloseCircle: ImageVector? = null
