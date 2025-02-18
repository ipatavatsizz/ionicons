package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bandage: ImageVector
  get() {
    if (_BandageOutline != null) {
      return _BandageOutline!!
    }
    _BandageOutline = ImageVector.Builder(
      name = "Outline.BandageOutline",
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
        moveTo(57.7f, 329.67f)
        lineTo(329.68f, 57.7f)
        arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 454.3f, 57.7f)
        lineTo(454.31f, 57.71f)
        arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 454.31f, 182.33f)
        lineTo(182.33f, 454.3f)
        arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 57.71f, 454.3f)
        lineTo(57.7f, 454.29f)
        arcTo(88.12f, 88.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 57.7f, 329.67f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(287.1f, 145.69f)
        lineTo(366.3f, 224.89f)
        arcTo(32f, 32f, 60.95f, isMoreThanHalf = false, isPositiveArc = true, 366.3f, 270.15f)
        lineTo(272.96f, 363.48f)
        arcTo(32f, 32f, 132.52f, isMoreThanHalf = false, isPositiveArc = true, 227.71f, 363.48f)
        lineTo(148.51f, 284.29f)
        arcTo(32f, 32f, 98.42f, isMoreThanHalf = false, isPositiveArc = true, 148.51f, 239.03f)
        lineTo(241.85f, 145.69f)
        arcTo(32f, 32f, 132.52f, isMoreThanHalf = false, isPositiveArc = true, 287.1f, 145.69f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 208f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(304f, 256f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(208f, 256f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 304f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
    }.build()

    return _BandageOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BandageOutline: ImageVector? = null
