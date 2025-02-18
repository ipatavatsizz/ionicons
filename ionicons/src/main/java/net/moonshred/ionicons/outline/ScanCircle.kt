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

val Ionicons.Outline.ScanCircle: ImageVector
  get() {
    if (_ScanCircleOutline != null) {
      return _ScanCircleOutline!!
    }
    _ScanCircleOutline = ImageVector.Builder(
      name = "Outline.ScanCircleOutline",
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
        moveTo(296f, 352f)
        horizontalLineToRelative(28f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, -28f)
        verticalLineTo(296f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 216f)
        verticalLineTo(188f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28f, -28f)
        horizontalLineTo(296f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(216f, 352f)
        horizontalLineTo(188f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
        verticalLineTo(296f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 216f)
        verticalLineTo(188f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, -28f)
        horizontalLineToRelative(28f)
      }
    }.build()

    return _ScanCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ScanCircleOutline: ImageVector? = null
