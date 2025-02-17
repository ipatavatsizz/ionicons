package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.GameController: ImageVector
  get() {
    if (_GameControllerSharp != null) {
      return _GameControllerSharp!!
    }
    _GameControllerSharp = ImageVector.Builder(
      name = "Sharp.GameControllerSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(478.07f, 356.88f)
        lineTo(439f, 151f)
        curveToRelative(-8.86f, -40.35f, -23f, -71f, -88f, -71f)
        lineTo(145f, 80f)
        curveToRelative(-66f, 0f, -79.14f, 30.65f, -88f, 71f)
        lineTo(18f, 356.88f)
        curveTo(11f, 391f, 22.43f, 418.13f, 51.37f, 428.69f)
        reflectiveCurveTo(103f, 423f, 119.18f, 391.3f)
        lineToRelative(15.42f, -30.52f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148.88f, 352f)
        lineTo(347.16f, 352f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.28f, 8.78f)
        lineToRelative(15.42f, 30.52f)
        curveToRelative(16.14f, 31.7f, 38.88f, 48f, 67.81f, 37.39f)
        reflectiveCurveTo(485f, 391f, 478.07f, 356.88f)
        close()
        moveTo(224f, 240f)
        lineTo(176f, 240f)
        verticalLineToRelative(48f)
        lineTo(144f, 288f)
        lineTo(144f, 240f)
        lineTo(96f, 240f)
        lineTo(96f, 208f)
        horizontalLineToRelative(48f)
        lineTo(144f, 160f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(48f)
        close()
        moveTo(292f, 244f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 292f, 244f)
        close()
        moveTo(336f, 288f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 288f)
        close()
        moveTo(336f, 200f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 200f)
        close()
        moveTo(380f, 244f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 380f, 244f)
        close()
      }
    }.build()

    return _GameControllerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GameControllerSharp: ImageVector? = null
