package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Contrast: ImageVector
  get() {
    if (_ContrastSharp != null) {
      return _ContrastSharp!!
    }
    _ContrastSharp = ImageVector.Builder(
      name = "Sharp.ContrastSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(132.29f, 32f, 32f, 132.29f, 32f, 256f)
        reflectiveCurveTo(132.29f, 480f, 256f, 480f)
        reflectiveCurveTo(480f, 379.71f, 480f, 256f)
        reflectiveCurveTo(379.71f, 32f, 256f, 32f)
        close()
        moveTo(128.72f, 383.28f)
        arcTo(180f, 180f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 76f)
        verticalLineTo(436f)
        arcTo(178.82f, 178.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128.72f, 383.28f)
        close()
      }
    }.build()

    return _ContrastSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ContrastSharp: ImageVector? = null
