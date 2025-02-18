package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CloudyNight: ImageVector
  get() {
    if (_CloudyNightOutline != null) {
      return _CloudyNightOutline!!
    }
    _CloudyNightOutline = ImageVector.Builder(
      name = "Outline.CloudyNightOutline",
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
        moveTo(388.31f, 272f)
        curveToRelative(47.75f, 0f, 89.77f, -27.77f, 107.69f, -68.92f)
        curveToRelative(-14.21f, 6.18f, -30.9f, 8.61f, -47.38f, 8.61f)
        arcTo(116.31f, 116.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 332.31f, 95.38f)
        curveToRelative(0f, -16.48f, 2.43f, -33.17f, 8.61f, -47.38f)
        curveTo(299.77f, 65.92f, 272f, 107.94f, 272f, 155.69f)
        arcToRelative(
          116.31f,
          116.31f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          3.44f,
          28.18f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(90.61f, 306.85f)
        arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 293.6f)
        curveTo(116.09f, 220.17f, 169.63f, 176f, 232f, 176f)
        curveToRelative(57.93f, 0f, 96.62f, 37.75f, 112.2f, 77.74f)
        arcToRelative(
          15.84f,
          15.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          12.2f,
          9.87f
        )
        curveToRelative(50f, 8.15f, 91.6f, 41.54f, 91.6f, 99.59f)
        curveTo(448f, 422.6f, 399.4f, 464f, 340f, 464f)
        horizontalLineTo(106f)
        curveToRelative(-49.5f, 0f, -90f, -24.7f, -90f, -79.2f)
        curveTo(16f, 336.33f, 54.67f, 312.58f, 90.61f, 306.85f)
        close()
      }
    }.build()

    return _CloudyNightOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudyNightOutline: ImageVector? = null
