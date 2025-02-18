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

val Ionicons.Outline.PieChart: ImageVector
  get() {
    if (_PieChartOutline != null) {
      return _PieChartOutline!!
    }
    _PieChartOutline = ImageVector.Builder(
      name = "Outline.PieChartOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256.05f, 80.65f)
        quadTo(263.94f, 80f, 272f, 80f)
        curveToRelative(106f, 0f, 192f, 86f, 192f, 192f)
        reflectiveCurveTo(378f, 464f, 272f, 464f)
        arcTo(192.09f, 192.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.12f, 330.65f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 48f)
        curveTo(141.12f, 48f, 48f, 141.12f, 48f, 256f)
        arcToRelative(
          207.29f,
          207.29f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          18.09f,
          85f
        )
        lineTo(256f, 256f)
        close()
      }
    }.build()

    return _PieChartOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PieChartOutline: ImageVector? = null
