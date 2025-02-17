package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PartlySunny: ImageVector
  get() {
    if (_PartlySunnyOutline != null) {
      return _PartlySunnyOutline!!
    }
    _PartlySunnyOutline = ImageVector.Builder(
      name = "Outline.PartlySunnyOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
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
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384.8f, 271.4f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -123.55f, -92f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(464f, 208f)
        lineTo(496f, 208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 48f)
        lineTo(336f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(222.86f, 94.86f)
        lineTo(245.49f, 117.49f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(449.14f, 94.86f)
        lineTo(426.51f, 117.49f)
      }
    }.build()

    return _PartlySunnyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PartlySunnyOutline: ImageVector? = null
