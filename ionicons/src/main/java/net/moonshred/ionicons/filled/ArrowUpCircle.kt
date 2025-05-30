package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ArrowUpCircle: ImageVector
  get() {
    if (_ArrowUpCircle != null) {
      return _ArrowUpCircle!!
    }
    _ArrowUpCircle = ImageVector.Builder(
      name = "Filled.ArrowUpCircle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
        moveTo(347.36f, 260.65f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.63f, 0.09f)
        lineTo(272f, 208.42f)
        lineTo(272f, 342f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(240f, 208.42f)
        lineToRelative(-52.73f, 52.32f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 164.73f, 238f)
        lineToRelative(80f, -79.39f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.54f, 0f)
        lineToRelative(80f, 79.39f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 347.36f, 260.65f)
        close()
      }
    }.build()

    return _ArrowUpCircle!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpCircle: ImageVector? = null
