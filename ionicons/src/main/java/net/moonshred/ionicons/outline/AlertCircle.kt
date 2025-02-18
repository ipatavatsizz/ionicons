package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.AlertCircle: ImageVector
  get() {
    if (_AlertCircleOutline != null) {
      return _AlertCircleOutline!!
    }
    _AlertCircleOutline = ImageVector.Builder(
      name = "Outline.AlertCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
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
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(250.26f, 166.05f)
        lineTo(256f, 288f)
        lineToRelative(5.73f, -121.95f)
        arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.79f, -6f)
        horizontalLineToRelative(0f)
        arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 250.26f, 166.05f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 367.91f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 367.91f)
        close()
      }
    }.build()

    return _AlertCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AlertCircleOutline: ImageVector? = null
