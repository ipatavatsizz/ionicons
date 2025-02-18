package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Compass: ImageVector
  get() {
    if (_Compass != null) {
      return _Compass!!
    }
    _Compass = ImageVector.Builder(
      name = "Filled.Compass",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(361.07f, 161.33f)
        lineToRelative(-46.88f, 117.2f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35.66f, 35.66f)
        lineToRelative(-117.2f, 46.88f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.4f, -10.4f)
        lineToRelative(46.88f, -117.2f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.66f, -35.66f)
        lineToRelative(117.2f, -46.88f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 361.07f, 161.33f)
        close()
      }
    }.build()

    return _Compass!!
  }

@Suppress("ObjectPropertyName")
private var _Compass: ImageVector? = null
