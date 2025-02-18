package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Reload: ImageVector
  get() {
    if (_ReloadSharp != null) {
      return _ReloadSharp!!
    }
    _ReloadSharp = ImageVector.Builder(
      name = "Sharp.ReloadSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(400f, 148f)
        lineToRelative(-21.12f, -24.57f)
        arcTo(191.43f, 191.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 64f)
        curveTo(134f, 64f, 48f, 150f, 48f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        arcTo(192.09f, 192.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 421.07f, 320f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 68.45f)
        verticalLineTo(220f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
        horizontalLineTo(308.45f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.83f, -6.83f)
        lineTo(457.17f, 65.62f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 68.45f)
        close()
      }
    }.build()

    return _ReloadSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReloadSharp: ImageVector? = null
