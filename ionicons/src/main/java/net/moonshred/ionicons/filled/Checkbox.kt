package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Checkbox: ImageVector
  get() {
    if (_Checkbox != null) {
      return _Checkbox!!
    }
    _Checkbox = ImageVector.Builder(
      name = "Filled.Checkbox",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 48f)
        horizontalLineTo(112f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        verticalLineTo(400f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        horizontalLineTo(400f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        verticalLineTo(112f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 400f, 48f)
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

    return _Checkbox!!
  }

@Suppress("ObjectPropertyName")
private var _Checkbox: ImageVector? = null
