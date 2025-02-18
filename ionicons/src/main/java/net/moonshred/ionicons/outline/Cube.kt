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

val Ionicons.Outline.Cube: ImageVector
  get() {
    if (_CubeOutline != null) {
      return _CubeOutline!!
    }
    _CubeOutline = ImageVector.Builder(
      name = "Outline.CubeOutline",
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
        moveTo(448f, 341.37f)
        verticalLineTo(170.61f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432.11f, 143f)
        lineToRelative(-152f, -88.46f)
        arcToRelative(
          47.94f,
          47.94f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -48.24f,
          0f
        )
        lineTo(79.89f, 143f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 170.61f)
        verticalLineTo(341.37f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.89f, 369f)
        lineToRelative(152f, 88.46f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.24f, 0f)
        lineToRelative(152f, -88.46f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 448f, 341.37f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(69f, 153.99f)
        lineToRelative(187f, 110f)
        lineToRelative(187f, -110f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 463.99f)
        lineTo(256f, 263.99f)
      }
    }.build()

    return _CubeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CubeOutline: ImageVector? = null
