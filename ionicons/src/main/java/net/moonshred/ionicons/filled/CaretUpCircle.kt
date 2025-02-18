package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.CaretUpCircle: ImageVector
  get() {
    if (_CaretUpCircle != null) {
      return _CaretUpCircle!!
    }
    _CaretUpCircle = ImageVector.Builder(
      name = "Filled.CaretUpCircle",
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
        moveTo(330.14f, 300f)
        lineTo(181.86f, 300f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.29f, -26.23f)
        lineToRelative(74.13f, -89.09f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.6f, 0f)
        lineToRelative(74.13f, 89.09f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 330.14f, 300f)
        close()
      }
    }.build()

    return _CaretUpCircle!!
  }

@Suppress("ObjectPropertyName")
private var _CaretUpCircle: ImageVector? = null
