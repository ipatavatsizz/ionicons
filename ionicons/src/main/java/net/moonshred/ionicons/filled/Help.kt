package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Help: ImageVector
  get() {
    if (_Help != null) {
      return _Help!!
    }
    _Help = ImageVector.Builder(
      name = "Filled.Help",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 40f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(160f, 164f)
        reflectiveCurveToRelative(1.44f, -33f, 33.54f, -59.46f)
        curveTo(212.6f, 88.83f, 235.49f, 84.28f, 256f, 84f)
        curveToRelative(18.73f, -0.23f, 35.47f, 2.94f, 45.48f, 7.82f)
        curveTo(318.59f, 100.2f, 352f, 120.6f, 352f, 164f)
        curveToRelative(0f, 45.67f, -29.18f, 66.37f, -62.35f, 89.18f)
        reflectiveCurveTo(248f, 298.36f, 248f, 324f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(248f, 399.99f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _Help!!
  }

@Suppress("ObjectPropertyName")
private var _Help: ImageVector? = null
