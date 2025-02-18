package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Magnet: ImageVector
  get() {
    if (_MagnetSharp != null) {
      return _MagnetSharp!!
    }
    _MagnetSharp = ImageVector.Builder(
      name = "Sharp.MagnetSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(191.98f, 463.58f)
        lineTo(191.98f, 415.58f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(90.16f, 421.4f)
        lineTo(124.1f, 387.46f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(47.98f, 319.58f)
        lineTo(95.98f, 319.58f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(422.2f, 89.82f)
        arcToRelative(
          144f,
          144f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -203.71f,
          -0.07f
        )
        lineToRelative(-67.88f, 67.88f)
        lineToRelative(67.88f, 67.89f)
        lineToRelative(67.88f, -67.89f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.46f, 0.59f)
        curveToRelative(18.3f, 18.92f, 17.48f, 49.24f, -1.14f, 67.86f)
        lineTo(286.37f, 293.4f)
        lineToRelative(67.88f, 67.88f)
        lineToRelative(66.91f, -66.91f)
        curveTo(477.53f, 238f, 478.53f, 146.22f, 422.2f, 89.82f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(82.72f, 225.52f)
        lineToRelative(45.25f, -45.25f)
        lineToRelative(67.88f, 67.88f)
        lineToRelative(-45.25f, 45.25f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(218.49f, 361.27f)
        lineToRelative(45.25f, -45.25f)
        lineToRelative(67.88f, 67.88f)
        lineToRelative(-45.25f, 45.25f)
        close()
      }
    }.build()

    return _MagnetSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MagnetSharp: ImageVector? = null
