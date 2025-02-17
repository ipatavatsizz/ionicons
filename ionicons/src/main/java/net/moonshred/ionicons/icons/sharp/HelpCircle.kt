package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HelpCircle: ImageVector
  get() {
    if (_HelpCircleSharp != null) {
      return _HelpCircleSharp!!
    }
    _HelpCircleSharp = ImageVector.Builder(
      name = "Sharp.HelpCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 64f)
        curveTo(150f, 64f, 64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        close()
        moveTo(266.44f, 366f)
        lineTo(236.23f, 366f)
        arcToRelative(
          2.57f,
          2.57f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.56f,
          -2.57f
        )
        verticalLineToRelative(-30.2f)
        arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.56f, -2.57f)
        horizontalLineToRelative(30.21f)
        arcToRelative(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.56f, 2.57f)
        verticalLineToRelative(30.2f)
        arcTo(2.57f, 2.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 266.44f, 366f)
        close()
        moveTo(283.44f, 267f)
        curveTo(267.23f, 277.88f, 265f, 287.85f, 265f, 297f)
        verticalLineToRelative(11f)
        arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
        lineTo(240f, 311f)
        arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
        lineTo(237f, 297f)
        curveToRelative(0f, -21.91f, 10.08f, -39.33f, 30.82f, -53.26f)
        curveTo(287.1f, 230.8f, 298f, 222.6f, 298f, 204.57f)
        curveToRelative(0f, -12.26f, -7f, -21.57f, -21.49f, -28.46f)
        curveToRelative(-3.41f, -1.62f, -11f, -3.2f, -20.34f, -3.09f)
        curveToRelative(-11.72f, 0.15f, -20.82f, 2.95f, -27.83f, 8.59f)
        curveTo(215.12f, 192.25f, 214f, 203.84f, 214f, 204f)
        arcToRelative(
          65.7f,
          65.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.84f,
          10.28f
        )
        arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
        lineTo(188.91f, 217.28f)
        arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -2.69f)
        arcToRelative(61.69f, 61.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -12f)
        curveToRelative(0.22f, -2.43f, 1.8f, -24.32f, 24.77f, -42.8f)
        curveToRelative(11.91f, -9.58f, 27.06f, -14.56f, 45f, -14.78f)
        curveToRelative(12.7f, -0.15f, 24.63f, 2f, 32.72f, 5.82f)
        curveTo(312.7f, 162.34f, 326f, 181.43f, 326f, 204.57f)
        curveTo(326f, 238.4f, 303.39f, 253.59f, 283.44f, 267f)
        close()
      }
    }.build()

    return _HelpCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HelpCircleSharp: ImageVector? = null
