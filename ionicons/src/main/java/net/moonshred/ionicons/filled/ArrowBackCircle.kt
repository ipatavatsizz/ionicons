package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ArrowBackCircle: ImageVector
  get() {
    if (_ArrowBackCircle != null) {
      return _ArrowBackCircle!!
    }
    _ArrowBackCircle = ImageVector.Builder(
      name = "Filled.ArrowBackCircle",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 256f)
        curveToRelative(0f, 114.87f, 93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        close()
        moveTo(260.65f, 164.64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, 22.63f)
        lineTo(208.42f, 240f)
        lineTo(342f, 240f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        lineTo(208.42f, 272f)
        lineToRelative(52.32f, 52.73f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 238f, 347.27f)
        lineToRelative(-79.39f, -80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -22.54f)
        lineToRelative(79.39f, -80f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 260.65f, 164.64f)
        close()
      }
    }.build()

    return _ArrowBackCircle!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowBackCircle: ImageVector? = null
