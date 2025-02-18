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

val Ionicons.Outline.Diamond: ImageVector
  get() {
    if (_DiamondOutline != null) {
      return _DiamondOutline!!
    }
    _DiamondOutline = ImageVector.Builder(
      name = "Outline.DiamondOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(35.42f, 188.21f)
        lineTo(243.17f, 457.67f)
        arcToRelative(16.17f, 16.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.66f, 0f)
        lineTo(476.58f, 188.21f)
        arcToRelative(
          16.52f,
          16.52f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0.95f,
          -18.75f
        )
        lineTo(407.06f, 55.71f)
        arcTo(16.22f, 16.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 393.27f, 48f)
        horizontalLineTo(118.73f)
        arcToRelative(
          16.22f,
          16.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -13.79f,
          7.71f
        )
        lineTo(34.47f, 169.46f)
        arcTo(16.52f, 16.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.42f, 188.21f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 176f)
        lineTo(464f, 176f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 64f)
        lineToRelative(-48f, 112f)
        lineToRelative(-96f, -128f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 64f)
        lineToRelative(48f, 112f)
        lineToRelative(96f, -128f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 448f)
        lineTo(160f, 176f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 448f)
        lineTo(352f, 176f)
      }
    }.build()

    return _DiamondOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DiamondOutline: ImageVector? = null
