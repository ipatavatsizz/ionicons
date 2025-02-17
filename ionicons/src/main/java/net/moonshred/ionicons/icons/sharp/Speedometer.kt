package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Speedometer: ImageVector
  get() {
    if (_SpeedometerSharp != null) {
      return _SpeedometerSharp!!
    }
    _SpeedometerSharp = ImageVector.Builder(
      name = "Sharp.SpeedometerSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(123.46f, 48f, 16f, 156.55f, 16f, 290.56f)
        arcTo(243.3f, 243.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76.32f, 451.43f)
        curveToRelative(1.18f, 1.3f, 2.25f, 2.6f, 3.43f, 3.79f)
        curveTo(89.2f, 464f, 92.07f, 464f, 99.57f, 464f)
        reflectiveCurveToRelative(12.43f, 0f, 19.93f, -8.88f)
        curveTo(152f, 416.64f, 202f, 400f, 256f, 400f)
        reflectiveCurveToRelative(104.07f, 16.71f, 136.5f, 55.12f)
        curveTo(400f, 464f, 404.82f, 464f, 412.43f, 464f)
        reflectiveCurveToRelative(11.3f, 0f, 19.82f, -8.78f)
        curveToRelative(1.22f, -1.25f, 2.25f, -2.49f, 3.43f, -3.79f)
        arcTo(243.3f, 243.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 496f, 290.56f)
        curveTo(496f, 156.55f, 388.54f, 48f, 256f, 48f)
        close()
        moveTo(240f, 112f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        lineTo(240f, 176f)
        close()
        moveTo(144f, 304f)
        lineTo(80f, 304f)
        lineTo(80f, 272f)
        horizontalLineToRelative(64f)
        close()
        moveTo(165.49f, 220.12f)
        lineTo(120.24f, 174.86f)
        lineTo(142.86f, 152.24f)
        lineTo(188.12f, 197.49f)
        close()
        moveTo(278.6f, 307.4f)
        arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
        arcToRelative(30.11f, 30.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35f, -49f)
        lineTo(320f, 224f)
        close()
        moveTo(323.88f, 197.49f)
        lineTo(369.14f, 152.24f)
        lineTo(391.76f, 174.86f)
        lineTo(346.51f, 220.12f)
        close()
        moveTo(432f, 304f)
        lineTo(368f, 304f)
        lineTo(368f, 272f)
        horizontalLineToRelative(64f)
        close()
      }
    }.build()

    return _SpeedometerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SpeedometerSharp: ImageVector? = null
