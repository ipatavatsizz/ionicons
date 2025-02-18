package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Ribbon: ImageVector
  get() {
    if (_RibbonSharp != null) {
      return _RibbonSharp!!
    }
    _RibbonSharp = ImageVector.Builder(
      name = "Sharp.RibbonSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 336f)
        curveToRelative(-5.22f, 0f, -10.4f, -0.24f, -15.51f, -0.69f)
        arcTo(176.12f, 176.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.2f, 256.94f)
        lineTo(20f, 416f)
        horizontalLineTo(135f)
        lineToRelative(58f, 96f)
        lineToRelative(82.53f, -177.09f)
        arcTo(177.53f, 177.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 336f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(403f, 256.74f)
        arcToRelative(
          176.9f,
          176.9f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -88.18f,
          69.14f
        )
        lineTo(273.7f, 415.5f)
        lineTo(319f, 512f)
        lineToRelative(58f, -96f)
        horizontalLineTo(492f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256.02f, 160f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 16f)
        curveToRelative(-79.4f, 0f, -144f, 64.6f, -144f, 144f)
        reflectiveCurveToRelative(64.6f, 144f, 144f, 144f)
        reflectiveCurveToRelative(144f, -64.6f, 144f, -144f)
        reflectiveCurveTo(335.4f, 16f, 256f, 16f)
        close()
        moveTo(256f, 240f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, -80f)
        arcTo(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 240f)
        close()
      }
    }.build()

    return _RibbonSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RibbonSharp: ImageVector? = null
