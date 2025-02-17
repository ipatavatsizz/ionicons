package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.VolumeHigh: ImageVector
  get() {
    if (_VolumeHighSharp != null) {
      return _VolumeHighSharp!!
    }
    _VolumeHighSharp = ImageVector.Builder(
      name = "Sharp.VolumeHighSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(320f, 320f)
        curveToRelative(9.74f, -19.38f, 16f, -40.84f, 16f, -64f)
        curveToRelative(0f, -23.48f, -6f, -44.42f, -16f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(368f, 368f)
        curveToRelative(19.48f, -33.92f, 32f, -64.06f, 32f, -112f)
        reflectiveCurveToRelative(-12f, -77.74f, -32f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(416f, 416f)
        curveToRelative(30f, -46f, 48f, -91.43f, 48f, -160f)
        reflectiveCurveTo(446f, 143f, 416f, 96f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(125.65f, 176.1f)
        lineToRelative(-93.65f, 0f)
        lineToRelative(0f, 159.8f)
        lineToRelative(93.65f, 0f)
        lineToRelative(130.35f, 104.1f)
        lineToRelative(0f, -368f)
        lineToRelative(-130.35f, 104.1f)
        close()
      }
    }.build()

    return _VolumeHighSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeHighSharp: ImageVector? = null
