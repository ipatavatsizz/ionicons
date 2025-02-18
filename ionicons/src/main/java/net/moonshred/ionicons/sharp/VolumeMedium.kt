package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.VolumeMedium: ImageVector
  get() {
    if (_VolumeMediumSharp != null) {
      return _VolumeMediumSharp!!
    }
    _VolumeMediumSharp = ImageVector.Builder(
      name = "Sharp.VolumeMediumSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(157.65f, 176.1f)
        lineToRelative(-93.65f, 0f)
        lineToRelative(0f, 159.8f)
        lineToRelative(93.65f, 0f)
        lineToRelative(130.35f, 104.1f)
        lineToRelative(0f, -368f)
        lineToRelative(-130.35f, 104.1f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 320f)
        curveToRelative(9.74f, -19.41f, 16f, -40.81f, 16f, -64f)
        curveToRelative(0f, -23.51f, -6f, -44.4f, -16f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 368f)
        curveToRelative(19.48f, -34f, 32f, -64f, 32f, -112f)
        reflectiveCurveToRelative(-12f, -77.7f, -32f, -112f)
      }
    }.build()

    return _VolumeMediumSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeMediumSharp: ImageVector? = null
