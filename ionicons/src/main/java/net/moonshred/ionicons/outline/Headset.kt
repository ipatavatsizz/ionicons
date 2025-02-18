package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Headset: ImageVector
  get() {
    if (_HeadsetOutline != null) {
      return _HeadsetOutline!!
    }
    _HeadsetOutline = ImageVector.Builder(
      name = "Outline.HeadsetOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(83f, 384f)
        curveToRelative(-13f, -33f, -35f, -93.37f, -35f, -128f)
        curveTo(48f, 141.12f, 149.33f, 48f, 256f, 48f)
        reflectiveCurveToRelative(208f, 93.12f, 208f, 208f)
        curveToRelative(0f, 34.63f, -23f, 97f, -35f, 128f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(108.39f, 270.13f)
        lineToRelative(-13.69f, 8f)
        horizontalLineToRelative(0f)
        curveTo(64.47f, 295.83f, 63f, 350.54f, 91.32f, 400.33f)
        reflectiveCurveToRelative(75.87f, 75.81f, 106.1f, 58.12f)
        horizontalLineToRelative(0f)
        lineToRelative(13.69f, -8f)
        arcToRelative(
          16.16f,
          16.16f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          5.78f,
          -21.87f
        )
        lineTo(130f, 276f)
        arcTo(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108.39f, 270.13f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(403.61f, 270.13f)
        lineToRelative(13.69f, 8f)
        horizontalLineToRelative(0f)
        curveToRelative(30.23f, 17.69f, 31.74f, 72.4f, 3.38f, 122.19f)
        reflectiveCurveToRelative(-75.87f, 75.81f, -106.1f, 58.12f)
        horizontalLineToRelative(0f)
        lineToRelative(-13.69f, -8f)
        arcToRelative(
          16.16f,
          16.16f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -5.78f,
          -21.87f
        )
        lineTo(382f, 276f)
        arcTo(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 403.61f, 270.13f)
        close()
      }
    }.build()

    return _HeadsetOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HeadsetOutline: ImageVector? = null
