package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Flask: ImageVector
  get() {
    if (_FlaskSharp != null) {
      return _FlaskSharp!!
    }
    _FlaskSharp = ImageVector.Builder(
      name = "Sharp.FlaskSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(469.11f, 382.76f)
        lineTo(325f, 153.92f)
        verticalLineTo(74f)
        horizontalLineToRelative(32f)
        verticalLineTo(32f)
        horizontalLineTo(155f)
        verticalLineTo(74f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(79.92f)
        lineTo(42.89f, 382.76f)
        curveToRelative(-13f, 20.64f, -14.78f, 43.73f, -3f, 65.1f)
        reflectiveCurveTo(71.59f, 480f, 96f, 480f)
        horizontalLineTo(416f)
        curveToRelative(24.41f, 0f, 44.32f, -10.76f, 56.1f, -32.14f)
        reflectiveCurveTo(482.14f, 403.4f, 469.11f, 382.76f)
        close()
        moveTo(224.39f, 173.39f)
        arcToRelative(
          29.76f,
          29.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          4.62f,
          -16f
        )
        verticalLineTo(74f)
        horizontalLineToRelative(54f)
        verticalLineToRelative(84.59f)
        arcToRelative(25.85f, 25.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13.82f)
        lineTo(356.82f, 283f)
        horizontalLineTo(155.18f)
        close()
      }
    }.build()

    return _FlaskSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlaskSharp: ImageVector? = null
