package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Accessibility: ImageVector
  get() {
    if (_AccessibilityOutline != null) {
      return _AccessibilityOutline!!
    }
    _AccessibilityOutline = ImageVector.Builder(
      name = "Outline.AccessibilityOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 56f)
        moveToRelative(-40f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(204.23f, 274.44f)
        curveToRelative(2.9f, -18.06f, 4.2f, -35.52f, -0.5f, -47.59f)
        curveToRelative(-4f, -10.38f, -12.7f, -16.19f, -23.2f, -20.15f)
        lineTo(88f, 176.76f)
        curveToRelative(-12f, -4f, -23.21f, -10.7f, -24f, -23.94f)
        curveToRelative(-1f, -17f, 14f, -28f, 29f, -24f)
        curveToRelative(0f, 0f, 88f, 31.14f, 163f, 31.14f)
        reflectiveCurveToRelative(162f, -31f, 162f, -31f)
        curveToRelative(18f, -5f, 30f, 9f, 30f, 23.79f)
        curveToRelative(0f, 14.21f, -11f, 19.21f, -24f, 23.94f)
        lineToRelative(-88f, 31.91f)
        curveToRelative(-8f, 3f, -21f, 9f, -26f, 18.18f)
        curveToRelative(-6f, 10.75f, -5f, 29.53f, -2.1f, 47.59f)
        lineToRelative(5.9f, 29.63f)
        lineTo(351.21f, 467.9f)
        curveToRelative(2.8f, 13.15f, -6.3f, 25.44f, -19.4f, 27.74f)
        reflectiveCurveTo(308f, 489f, 304.12f, 476.28f)
        lineTo(266.56f, 360.35f)
        quadToRelative(-2.71f, -8.34f, -4.8f, -16.87f)
        lineTo(256f, 320f)
        lineToRelative(-5.3f, 21.65f)
        quadToRelative(-2.52f, 10.35f, -5.8f, 20.48f)
        lineTo(208f, 476.18f)
        curveToRelative(-4f, 12.85f, -14.5f, 21.75f, -27.6f, 19.46f)
        reflectiveCurveTo(158f, 480.05f, 160.94f, 467.9f)
        lineToRelative(37.39f, -163.83f)
        close()
      }
    }.build()

    return _AccessibilityOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AccessibilityOutline: ImageVector? = null
