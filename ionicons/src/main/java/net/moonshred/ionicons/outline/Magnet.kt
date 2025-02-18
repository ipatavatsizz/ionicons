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

val Ionicons.Outline.Magnet: ImageVector
  get() {
    if (_MagnetOutline != null) {
      return _MagnetOutline!!
    }
    _MagnetOutline = ImageVector.Builder(
      name = "Outline.MagnetOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(421.83f, 293.82f)
        arcTo(144f, 144f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218.18f, 90.17f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(353.94f, 225.94f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -67.88f, -67.88f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(192f, 464f)
        lineTo(192f, 416f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(90.18f, 421.82f)
        lineTo(124.12f, 387.88f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(48f, 320f)
        lineTo(96f, 320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(286.06f, 158.06f)
        lineTo(172.92f, 271.19f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.25f, 0f)
        lineTo(105f, 248.57f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -45.26f)
        lineTo(218.18f, 90.17f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(421.83f, 293.82f)
        lineTo(308.69f, 407f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.26f, 0f)
        lineToRelative(-22.62f, -22.63f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -45.26f)
        lineTo(353.94f, 225.94f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(139.6f, 169.98f)
        lineTo(207.48f, 237.87f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(275.36f, 305.75f)
        lineTo(343.25f, 373.63f)
      }
    }.build()

    return _MagnetOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MagnetOutline: ImageVector? = null
