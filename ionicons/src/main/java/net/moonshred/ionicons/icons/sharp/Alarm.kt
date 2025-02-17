package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Alarm: ImageVector
  get() {
    if (_AlarmSharp != null) {
      return _AlarmSharp!!
    }
    _AlarmSharp = ImageVector.Builder(
      name = "Sharp.AlarmSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(403.79f, 64.11f)
        lineToRelative(-3.27f, -0.1f)
        horizontalLineTo(400f)
        curveToRelative(-14.73f, 0f, -28.55f, 5.91f, -40.52f, 15f)
        reflectiveCurveTo(344f, 96f, 344f, 96f)
        lineToRelative(88f, 86f)
        reflectiveCurveToRelative(11.25f, -5.71f, 17.61f, -13.85f)
        reflectiveCurveToRelative(14.28f, -18.08f, 14.32f, -37.11f)
        curveTo(464f, 95.55f, 437.6f, 66.15f, 403.79f, 64.11f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(108.21f, 64.11f)
        lineToRelative(3.27f, -0.1f)
        horizontalLineTo(112f)
        curveToRelative(14.73f, 0f, 28.55f, 5.91f, 40.52f, 15f)
        reflectiveCurveTo(168f, 96f, 168f, 96f)
        lineTo(80f, 182f)
        reflectiveCurveToRelative(-11.25f, -5.71f, -17.61f, -13.85f)
        reflectiveCurveTo(48.11f, 150.07f, 48.07f, 131f)
        curveTo(48f, 95.55f, 74.4f, 66.15f, 108.21f, 64.11f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(391.3f, 384.6f)
        arcToRelative(0.06f, 0.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.08f)
        curveTo(425f, 344f, 441f, 288.24f, 427f, 229.23f)
        curveToRelative(-13.64f, -57.52f, -72.67f, -115.69f, -130.34f, -128.66f)
        curveTo(182f, 74.79f, 80.07f, 161.71f, 80.07f, 272f)
        arcToRelative(
          175.15f,
          175.15f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          40.78f,
          112.52f
        )
        arcToRelative(0.06f, 0.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.08f)
        lineTo(73f, 432f)
        arcToRelative(0.06f, 0.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.08f)
        lineTo(96f, 454.59f)
        arcToRelative(0.06f, 0.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 0f)
        lineToRelative(47.43f, -47.37f)
        arcToRelative(0.06f, 0.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 0f)
        arcToRelative(
          175.64f,
          175.64f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          225.05f,
          0f
        )
        arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 0f)
        lineTo(416f, 454.59f)
        arcToRelative(0.06f, 0.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 0f)
        lineTo(440f, 432f)
        close()
        moveTo(272.07f, 288f)
        horizontalLineToRelative(-112f)
        arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 288f)
        verticalLineToRelative(-31.9f)
        arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, -0.05f)
        horizontalLineToRelative(80f)
        arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.05f)
        verticalLineTo(144f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _AlarmSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AlarmSharp: ImageVector? = null
