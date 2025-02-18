package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Beaker: ImageVector
  get() {
    if (_BeakerSharp != null) {
      return _BeakerSharp!!
    }
    _BeakerSharp = ImageVector.Builder(
      name = "Sharp.BeakerSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(453.55f, 54.7f)
        lineTo(464f, 32f)
        lineToRelative(-335.6f, 0f)
        curveToRelative(-27.74f, 0f, -49f, 6.57f, -63.31f, 19.51f)
        curveTo(54.39f, 61.27f, 48f, 74.89f, 48f, 88f)
        verticalLineToRelative(24f)
        horizontalLineTo(64f)
        curveToRelative(31f, 0f, 32f, 16.79f, 32f, 35f)
        verticalLineTo(460f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
        horizontalLineTo(428f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, -20f)
        verticalLineTo(96f)
        curveTo(448f, 78.84f, 450.28f, 61.86f, 453.55f, 54.7f)
        close()
        moveTo(416f, 96f)
        verticalLineToRelative(64f)
        horizontalLineTo(128f)
        verticalLineTo(138f)
        curveToRelative(0f, -36.15f, -21f, -51f, -41.77f, -53.46f)
        curveTo(89f, 70f, 105.7f, 64.05f, 128.4f, 64.05f)
        horizontalLineTo(418.32f)
        arcTo(221.83f, 221.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 416f, 96f)
        close()
      }
    }.build()

    return _BeakerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BeakerSharp: ImageVector? = null
