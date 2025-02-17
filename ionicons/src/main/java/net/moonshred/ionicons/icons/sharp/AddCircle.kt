package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.AddCircle: ImageVector
  get() {
    if (_AddCircleSharp != null) {
      return _AddCircleSharp!!
    }
    _AddCircleSharp = ImageVector.Builder(
      name = "Sharp.AddCircleSharp",
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
        moveTo(352f, 272f)
        lineTo(272f, 272f)
        verticalLineToRelative(80f)
        lineTo(240f, 352f)
        lineTo(240f, 272f)
        lineTo(160f, 272f)
        lineTo(160f, 240f)
        horizontalLineToRelative(80f)
        lineTo(240f, 160f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(80f)
        close()
      }
    }.build()

    return _AddCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AddCircleSharp: ImageVector? = null
