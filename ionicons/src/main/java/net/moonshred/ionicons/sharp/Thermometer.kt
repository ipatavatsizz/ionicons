package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Thermometer: ImageVector
  get() {
    if (_ThermometerSharp != null) {
      return _ThermometerSharp!!
    }
    _ThermometerSharp = ImageVector.Builder(
      name = "Sharp.ThermometerSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 291.24f)
        verticalLineTo(80f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
        verticalLineTo(291.24f)
        arcTo(113.39f, 113.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 384f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 0f)
        arcTo(113.39f, 113.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 291.24f)
        close()
        moveTo(256f, 432f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -93.26f)
        verticalLineTo(96f)
        horizontalLineToRelative(32f)
        verticalLineTo(338.74f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 432f)
        close()
      }
    }.build()

    return _ThermometerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ThermometerSharp: ImageVector? = null
