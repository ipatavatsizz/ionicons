package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Telescope: ImageVector
  get() {
    if (_TelescopeOutline != null) {
      return _TelescopeOutline!!
    }
    _TelescopeOutline = ImageVector.Builder(
      name = "Outline.TelescopeOutline",
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
        moveTo(39.93f, 327.56f)
        lineToRelative(-4.71f, -8.13f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 286.64f)
        lineToRelative(86.87f, -50.07f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.89f, 5.86f)
        lineToRelative(12.71f, 22f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.86f, 21.85f)
        lineTo(72.76f, 336.35f)
        arcTo(24.06f, 24.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.93f, 327.56f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(170.68f, 273.72f)
        lineTo(147.12f, 233f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.8f, -32.78f)
        lineToRelative(124.46f, -71.75f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.89f, 5.86f)
        lineToRelative(31.57f, 54.59f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 328f, 210.76f)
        lineTo(203.51f, 282.5f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 170.68f, 273.72f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(341.85f, 202.21f)
        lineToRelative(-46.51f, -80.43f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304.14f, 89f)
        lineToRelative(93.29f, -53.78f)
        arcTo(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 430.27f, 44f)
        lineToRelative(46.51f, 80.43f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.8f, 32.79f)
        lineTo(374.69f, 211f)
        arcTo(24.06f, 24.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 341.85f, 202.21f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(127.59f, 480f)
        lineTo(223.73f, 272.01f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(271.8f, 256.02f)
        lineTo(368.55f, 448f)
      }
    }.build()

    return _TelescopeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TelescopeOutline: ImageVector? = null
