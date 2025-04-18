package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Mic: ImageVector
  get() {
    if (_MicSharp != null) {
      return _MicSharp!!
    }
    _MicSharp = ImageVector.Builder(
      name = "Sharp.MicSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(192f, 448f)
        lineTo(320f, 448f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(384f, 208f)
        verticalLineToRelative(32f)
        curveToRelative(0f, 70.4f, -57.6f, 128f, -128f, 128f)
        horizontalLineToRelative(0f)
        curveToRelative(-70.4f, 0f, -128f, -57.6f, -128f, -128f)
        verticalLineTo(208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(256f, 368f)
        lineTo(256f, 448f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 320f)
        arcToRelative(
          78.83f,
          78.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -56.55f,
          -24.1f
        )
        arcTo(80.89f, 80.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 239f)
        verticalLineTo(128f)
        arcToRelative(79.69f, 79.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -80f)
        curveToRelative(44.86f, 0f, 80f, 35.14f, 80f, 80f)
        verticalLineTo(239f)
        curveTo(336f, 283.66f, 300.11f, 320f, 256f, 320f)
        close()
      }
    }.build()

    return _MicSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MicSharp: ImageVector? = null
