package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.HelpCircle: ImageVector
  get() {
    if (_HelpCircleOutline != null) {
      return _HelpCircleOutline!!
    }
    _HelpCircleOutline = ImageVector.Builder(
      name = "Outline.HelpCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 80f)
        arcTo(176f, 176f, 0f, isMoreThanHalf = true, isPositiveArc = false, 432f, 256f)
        arcTo(176f, 176f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 28f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(200f, 202.29f)
        reflectiveCurveToRelative(0.84f, -17.5f, 19.57f, -32.57f)
        curveTo(230.68f, 160.77f, 244f, 158.18f, 256f, 158f)
        curveToRelative(10.93f, -0.14f, 20.69f, 1.67f, 26.53f, 4.45f)
        curveToRelative(10f, 4.76f, 29.47f, 16.38f, 29.47f, 41.09f)
        curveToRelative(0f, 26f, -17f, 37.81f, -36.37f, 50.8f)
        reflectiveCurveTo(251f, 281.43f, 251f, 296f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(250f, 348f)
        moveToRelative(-20f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
      }
    }.build()

    return _HelpCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HelpCircleOutline: ImageVector? = null
