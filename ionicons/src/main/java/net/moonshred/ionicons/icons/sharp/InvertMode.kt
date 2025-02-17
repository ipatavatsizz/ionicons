package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.InvertMode: ImageVector
  get() {
    if (_InvertModeSharp != null) {
      return _InvertModeSharp!!
    }
    _InvertModeSharp = ImageVector.Builder(
      name = "Sharp.InvertModeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(414.39f, 97.61f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 97.61f, 414.39f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 414.39f, 97.61f)
        close()
        moveTo(256f, 432f)
        verticalLineTo(336f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -160f)
        verticalLineTo(80f)
        curveTo(353.05f, 80f, 432f, 159f, 432f, 256f)
        reflectiveCurveTo(353.05f, 432f, 256f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 256f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, -80f)
        verticalLineTo(336f)
        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 336f, 256f)
        close()
      }
    }.build()

    return _InvertModeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _InvertModeSharp: ImageVector? = null
