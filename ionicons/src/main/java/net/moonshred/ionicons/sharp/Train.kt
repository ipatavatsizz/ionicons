package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Train: ImageVector
  get() {
    if (_TrainSharp != null) {
      return _TrainSharp!!
    }
    _TrainSharp = ImageVector.Builder(
      name = "Sharp.TrainSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 32f)
        horizontalLineTo(320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(208f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        horizontalLineTo(128f)
        curveToRelative(-16f, 0f, -32f, 16f, -32f, 32f)
        verticalLineTo(352f)
        curveToRelative(0f, 23.92f, 160f, 80f, 160f, 80f)
        reflectiveCurveToRelative(160f, -56.74f, 160f, -80f)
        verticalLineTo(64f)
        curveTo(416f, 48f, 400f, 32f, 384f, 32f)
        close()
        moveTo(256f, 352f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, -48f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 352f)
        close()
        moveTo(368f, 200f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        horizontalLineTo(152f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(120f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
        horizontalLineTo(360f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(314f, 432f)
        lineToRelative(15.32f, 16f)
        lineToRelative(-146.74f, 0f)
        lineToRelative(15.42f, -16f)
        lineToRelative(-32f, -13f)
        lineToRelative(-76.62f, 77f)
        lineToRelative(45.2f, 0f)
        lineToRelative(16f, -16f)
        lineToRelative(210.74f, 0f)
        lineToRelative(16f, 16f)
        lineToRelative(45.3f, 0f)
        lineToRelative(-76.36f, -77.75f)
        lineToRelative(-32.26f, 13.75f)
        close()
      }
    }.build()

    return _TrainSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TrainSharp: ImageVector? = null
