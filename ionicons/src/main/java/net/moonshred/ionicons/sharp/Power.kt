package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Power: ImageVector
  get() {
    if (_PowerSharp != null) {
      return _PowerSharp!!
    }
    _PowerSharp = ImageVector.Builder(
      name = "Sharp.PowerSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        curveTo(141.31f, 464f, 48f, 370.77f, 48f, 256.18f)
        arcTo(207.44f, 207.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122.76f, 96.05f)
        lineToRelative(16.9f, -14f)
        lineToRelative(28.17f, 33.72f)
        lineToRelative(-16.9f, 14f)
        arcTo(163.72f, 163.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 256.18f)
        curveToRelative(0f, 90.39f, 73.57f, 163.93f, 164f, 163.93f)
        reflectiveCurveToRelative(164f, -73.54f, 164f, -163.93f)
        arcToRelative(
          163.38f,
          163.38f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -59.83f,
          -126.36f
        )
        lineToRelative(-17f, -14f)
        lineToRelative(28f, -33.82f)
        lineToRelative(17f, 14f)
        arcTo(207.13f, 207.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 256.18f)
        curveTo(464f, 370.77f, 370.69f, 464f, 256f, 464f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(234f, 48f)
        horizontalLineToRelative(44f)
        verticalLineToRelative(224f)
        horizontalLineToRelative(-44f)
        close()
      }
    }.build()

    return _PowerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PowerSharp: ImageVector? = null
