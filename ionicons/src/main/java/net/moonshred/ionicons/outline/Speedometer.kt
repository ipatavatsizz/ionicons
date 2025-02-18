package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Speedometer: ImageVector
  get() {
    if (_SpeedometerOutline != null) {
      return _SpeedometerOutline!!
    }
    _SpeedometerOutline = ImageVector.Builder(
      name = "Outline.SpeedometerOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(326.1f, 231.9f)
        lineToRelative(-47.5f, 75.5f)
        arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
        arcToRelative(30.11f, 30.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35f, -49f)
        lineToRelative(75.5f, -47.5f)
        arcToRelative(10.23f, 10.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.7f, 0f)
        arcTo(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 326.1f, 231.9f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 64f)
        curveTo(132.3f, 64f, 32f, 164.2f, 32f, 287.9f)
        arcTo(223.18f, 223.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88.3f, 436.4f)
        curveToRelative(1.1f, 1.2f, 2.1f, 2.4f, 3.2f, 3.5f)
        arcToRelative(
          25.19f,
          25.19f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          37.1f,
          -0.1f
        )
        arcToRelative(
          173.13f,
          173.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          254.8f,
          0f
        )
        arcToRelative(
          25.19f,
          25.19f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          37.1f,
          0.1f
        )
        lineToRelative(3.2f, -3.5f)
        arcTo(223.18f, 223.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 287.9f)
        curveTo(480f, 164.2f, 379.7f, 64f, 256f, 64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 128f)
        lineTo(256f, 160f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(416f, 288f)
        lineTo(384f, 288f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(128f, 288f)
        lineTo(96f, 288f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(165.49f, 197.49f)
        lineTo(142.86f, 174.86f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(346.51f, 197.49f)
        lineTo(369.14f, 174.86f)
      }
    }.build()

    return _SpeedometerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SpeedometerOutline: ImageVector? = null
