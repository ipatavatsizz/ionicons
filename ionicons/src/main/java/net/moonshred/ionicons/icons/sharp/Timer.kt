package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Timer: ImageVector
  get() {
    if (_TimerSharp != null) {
      return _TimerSharp!!
    }
    _TimerSharp = ImageVector.Builder(
      name = "Sharp.TimerSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.12f, 48f, 48f, 141.12f, 48f, 256f)
        reflectiveCurveToRelative(93.12f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.12f, 208f, -208f)
        reflectiveCurveTo(370.88f, 48f, 256f, 48f)
        close()
        moveTo(256f, 432f)
        curveTo(159f, 432f, 80f, 353.05f, 80f, 256f)
        arcToRelative(
          174.55f,
          174.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          53.87f,
          -126.72f
        )
        lineTo(279f, 233f)
        lineToRelative(-19f, 30f)
        lineTo(135f, 172f)
        curveToRelative(-13f, 23f, -26.7f, 46f, -26.7f, 84f)
        curveToRelative(0f, 81.44f, 66.26f, 147.7f, 147.7f, 147.7f)
        reflectiveCurveTo(403.7f, 337.44f, 403.7f, 256f)
        curveToRelative(0f, -76.67f, -58.72f, -139.88f, -133.55f, -147f)
        lineTo(270.15f, 164f)
        horizontalLineToRelative(-28.3f)
        lineTo(241.85f, 79.89f)
        curveToRelative(4.24f, 0.07f, 8.94f, 0.11f, 14.15f, 0.11f)
        curveTo(353.05f, 80f, 432f, 159f, 432f, 256f)
        reflectiveCurveTo(353.05f, 432f, 256f, 432f)
        close()
      }
    }.build()

    return _TimerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TimerSharp: ImageVector? = null
