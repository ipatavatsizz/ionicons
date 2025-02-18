package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.CheckmarkCircle: ImageVector
  get() {
    if (_CheckmarkCircle != null) {
      return _CheckmarkCircle!!
    }
    _CheckmarkCircle = ImageVector.Builder(
      name = "Filled.CheckmarkCircle",
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
        moveTo(364.25f, 186.29f)
        lineToRelative(-134.4f, 160f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 5.71f)
        horizontalLineToRelative(-0.27f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.89f, -5.3f)
        lineToRelative(-57.6f, -64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 23.78f, -21.4f)
        lineToRelative(45.29f, 50.32f)
        lineTo(339.75f, 165.71f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.5f, 20.58f)
        close()
      }
    }.build()

    return _CheckmarkCircle!!
  }

@Suppress("ObjectPropertyName")
private var _CheckmarkCircle: ImageVector? = null
