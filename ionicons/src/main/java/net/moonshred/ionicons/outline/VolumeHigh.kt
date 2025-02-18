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

val Ionicons.Outline.VolumeHigh: ImageVector
  get() {
    if (_VolumeHighOutline != null) {
      return _VolumeHighOutline!!
    }
    _VolumeHighOutline = ImageVector.Builder(
      name = "Outline.VolumeHighOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(126f, 192f)
        horizontalLineTo(56f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineTo(312f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(69.65f)
        arcToRelative(
          15.93f,
          15.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          10.14f,
          3.54f
        )
        lineToRelative(91.47f, 74.89f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 392f)
        verticalLineTo(120f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.74f, -6.43f)
        lineToRelative(-91.47f, 74.89f)
        arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 126f, 192f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 320f)
        curveToRelative(9.74f, -19.38f, 16f, -40.84f, 16f, -64f)
        curveToRelative(0f, -23.48f, -6f, -44.42f, -16f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(368f, 368f)
        curveToRelative(19.48f, -33.92f, 32f, -64.06f, 32f, -112f)
        reflectiveCurveToRelative(-12f, -77.74f, -32f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 416f)
        curveToRelative(30f, -46f, 48f, -91.43f, 48f, -160f)
        reflectiveCurveTo(446f, 143f, 416f, 96f)
      }
    }.build()

    return _VolumeHighOutline!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeHighOutline: ImageVector? = null
