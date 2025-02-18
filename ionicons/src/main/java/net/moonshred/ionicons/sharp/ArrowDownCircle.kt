package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ArrowDownCircle: ImageVector
  get() {
    if (_ArrowDownCircleSharp != null) {
      return _ArrowDownCircleSharp!!
    }
    _ArrowDownCircleSharp = ImageVector.Builder(
      name = "Sharp.ArrowDownCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        curveToRelative(114.87f, 0f, 208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        reflectiveCurveTo(141.13f, 464f, 256f, 464f)
        close()
        moveTo(175.91f, 240f)
        lineTo(240f, 303.58f)
        verticalLineTo(154f)
        horizontalLineToRelative(32f)
        verticalLineTo(303.58f)
        lineTo(336.09f, 240f)
        lineToRelative(22.54f, 22.71f)
        lineTo(256f, 364.54f)
        lineTo(153.37f, 262.7f)
        close()
      }
    }.build()

    return _ArrowDownCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownCircleSharp: ImageVector? = null
