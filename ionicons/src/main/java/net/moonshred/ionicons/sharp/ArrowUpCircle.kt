package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ArrowUpCircle: ImageVector
  get() {
    if (_ArrowUpCircleSharp != null) {
      return _ArrowUpCircleSharp!!
    }
    _ArrowUpCircleSharp = ImageVector.Builder(
      name = "Sharp.ArrowUpCircleSharp",
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
        moveTo(336.09f, 272f)
        lineTo(272f, 208.42f)
        lineTo(272f, 358f)
        lineTo(240f, 358f)
        lineTo(240f, 208.42f)
        lineTo(175.91f, 272f)
        lineTo(153.37f, 249.3f)
        lineTo(256f, 147.46f)
        lineTo(358.63f, 249.3f)
        close()
      }
    }.build()

    return _ArrowUpCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpCircleSharp: ImageVector? = null
