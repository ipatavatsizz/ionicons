package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Nuclear: ImageVector
  get() {
    if (_NuclearOutline != null) {
      return _NuclearOutline!!
    }
    _NuclearOutline = ImageVector.Builder(
      name = "Outline.NuclearOutline",
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
        moveTo(256f, 256f)
        moveToRelative(-192f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, 384f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, -384f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-64f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(224f, 192f)
        lineTo(171f, 85f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(288f, 192f)
        lineTo(341f, 85f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(327.55f, 255.81f)
        lineTo(446.96f, 255.94f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(299.09f, 313.13f)
        lineTo(371.34f, 408.19f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(184.45f, 255.81f)
        lineTo(65.04f, 255.94f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(212.91f, 313.13f)
        lineTo(140.66f, 408.19f)
      }
    }.build()

    return _NuclearOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NuclearOutline: ImageVector? = null
