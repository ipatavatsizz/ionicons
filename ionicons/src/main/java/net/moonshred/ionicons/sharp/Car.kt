package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Car: ImageVector
  get() {
    if (_CarSharp != null) {
      return _CarSharp!!
    }
    _CarSharp = ImageVector.Builder(
      name = "Sharp.CarSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(447.68f, 220.78f)
        arcToRelative(16.44f, 16.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -3.1f)
        lineToRelative(-48f, -112f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 384f, 96f)
        lineTo(128f, 96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.71f, 9.7f)
        lineToRelative(-48f, 112f)
        arcToRelative(16.44f, 16.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 3.1f)
        arcTo(16.15f, 16.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 224f)
        lineTo(64f, 408f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(32f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        lineTo(112f, 384f)
        lineTo(400f, 384f)
        verticalLineToRelative(24f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(32f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        lineTo(448f, 224f)
        arcTo(16.15f, 16.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 447.68f, 220.78f)
        close()
        moveTo(144f, 320f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 320f)
        close()
        moveTo(368f, 320f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 320f)
        close()
        moveTo(104.26f, 208f)
        lineToRelative(34.29f, -80f)
        horizontalLineToRelative(234.9f)
        lineToRelative(34.29f, 80f)
        close()
      }
    }.build()

    return _CarSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CarSharp: ImageVector? = null
