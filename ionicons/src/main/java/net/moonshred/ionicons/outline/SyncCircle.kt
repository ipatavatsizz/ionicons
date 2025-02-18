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

val Ionicons.Outline.SyncCircle: ImageVector
  get() {
    if (_SyncCircleOutline != null) {
      return _SyncCircleOutline!!
    }
    _SyncCircleOutline = ImageVector.Builder(
      name = "Outline.SyncCircleOutline",
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
        moveTo(351.82f, 271.87f)
        verticalLineToRelative(-16f)
        arcTo(96.15f, 96.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184.09f, 192f)
        moveToRelative(-24.2f, 48.17f)
        verticalLineToRelative(16f)
        arcTo(96.22f, 96.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 327.81f, 320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(135.87f, 256f)
        lineToRelative(23.59f, -23.6f)
        lineToRelative(24.67f, 23.6f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(376.13f, 256f)
        lineToRelative(-23.59f, 23.6f)
        lineToRelative(-24.67f, -23.6f)
      }
    }.build()

    return _SyncCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SyncCircleOutline: ImageVector? = null
