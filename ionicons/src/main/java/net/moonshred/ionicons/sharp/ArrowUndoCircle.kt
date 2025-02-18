package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ArrowUndoCircle: ImageVector
  get() {
    if (_ArrowUndoCircleSharp != null) {
      return _ArrowUndoCircleSharp!!
    }
    _ArrowUndoCircleSharp = ImageVector.Builder(
      name = "Sharp.ArrowUndoCircleSharp",
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
        moveTo(246.83f, 289.14f)
        lineTo(246.83f, 344f)
        lineTo(146f, 248f)
        lineToRelative(100.83f, -96f)
        verticalLineToRelative(54.86f)
        curveToRelative(96.5f, 0f, 119.17f, 69f, 119.17f, 137.14f)
        curveTo(338.15f, 308.43f, 313.52f, 289.14f, 246.83f, 289.14f)
        close()
      }
    }.build()

    return _ArrowUndoCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUndoCircleSharp: ImageVector? = null
