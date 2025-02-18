package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.InformationCircle: ImageVector
  get() {
    if (_InformationCircleSharp != null) {
      return _InformationCircleSharp!!
    }
    _InformationCircleSharp = ImageVector.Builder(
      name = "Sharp.InformationCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 56f)
        curveTo(145.72f, 56f, 56f, 145.72f, 56f, 256f)
        reflectiveCurveToRelative(89.72f, 200f, 200f, 200f)
        reflectiveCurveToRelative(200f, -89.72f, 200f, -200f)
        reflectiveCurveTo(366.28f, 56f, 256f, 56f)
        close()
        moveTo(256f, 138f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -26f, 26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 138f)
        close()
        moveTo(320f, 364f)
        lineTo(200f, 364f)
        lineTo(200f, 332f)
        horizontalLineToRelative(44f)
        lineTo(244f, 244f)
        lineTo(212f, 244f)
        lineTo(212f, 212f)
        horizontalLineToRelative(64f)
        lineTo(276f, 332f)
        horizontalLineToRelative(44f)
        close()
      }
    }.build()

    return _InformationCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _InformationCircleSharp: ImageVector? = null
