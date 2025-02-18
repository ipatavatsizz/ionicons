package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.CloudCircle: ImageVector
  get() {
    if (_CloudCircleOutline != null) {
      return _CloudCircleOutline!!
    }
    _CloudCircleOutline = ImageVector.Builder(
      name = "Outline.CloudCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(333.88f, 240.59f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.66f, -6.66f)
        curveTo(320.68f, 192.78f, 290.82f, 168f, 256f, 168f)
        curveToRelative(-32.37f, 0f, -53.93f, 21.22f, -62.48f, 43.58f)
        arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.16f, 5f)
        curveToRelative(-27.67f, 4.35f, -50.82f, 22.56f, -51.35f, 54.3f)
        curveToRelative(-0.52f, 31.53f, 25.51f, 57.11f, 57f, 57.11f)
        horizontalLineTo(326f)
        curveToRelative(27.5f, 0f, 50f, -13.72f, 50f, -44f)
        curveTo(376f, 256.77f, 354f, 243.58f, 333.88f, 240.59f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
    }.build()

    return _CloudCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudCircleOutline: ImageVector? = null
