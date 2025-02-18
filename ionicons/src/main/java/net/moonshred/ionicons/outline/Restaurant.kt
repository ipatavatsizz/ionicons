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

val Ionicons.Outline.Restaurant: ImageVector
  get() {
    if (_RestaurantOutline != null) {
      return _RestaurantOutline!!
    }
    _RestaurantOutline = ImageVector.Builder(
      name = "Outline.RestaurantOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(57.49f, 47.74f)
        lineTo(425.92f, 416.17f)
        arcToRelative(37.28f, 37.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 52.72f)
        horizontalLineToRelative(0f)
        arcToRelative(37.29f, 37.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52.72f, 0f)
        lineToRelative(-90f, -91.55f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 274f, 354.91f)
        verticalLineToRelative(-5.53f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.52f, -22.78f)
        lineToRelative(-11.62f, -10.73f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -29.8f, -7.44f)
        horizontalLineToRelative(0f)
        arcTo(48.53f, 48.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176.5f, 295.8f)
        lineTo(91.07f, 210.36f)
        curveTo(40.39f, 159.68f, 21.74f, 83.15f, 57.49f, 47.74f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 32f)
        lineToRelative(-77.25f, 77.25f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 154.51f)
        verticalLineToRelative(14.86f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.69f, 11.32f)
        lineTo(288f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 224f)
        lineToRelative(11.31f, -11.31f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 342.63f, 208f)
        horizontalLineToRelative(14.86f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.26f, -18.75f)
        lineTo(480f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(440f, 72f)
        lineTo(360f, 152f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(200f, 368f)
        lineTo(100.28f, 468.28f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56.56f, 0f)
        horizontalLineToRelative(0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -56.56f)
        lineTo(128f, 328f)
      }
    }.build()

    return _RestaurantOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RestaurantOutline: ImageVector? = null
