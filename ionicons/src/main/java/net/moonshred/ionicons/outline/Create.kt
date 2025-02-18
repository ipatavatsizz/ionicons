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

val Ionicons.Outline.Create: ImageVector
  get() {
    if (_CreateOutline != null) {
      return _CreateOutline!!
    }
    _CreateOutline = ImageVector.Builder(
      name = "Outline.CreateOutline",
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
        moveTo(384f, 224f)
        verticalLineTo(408f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, 40f)
        horizontalLineTo(104f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
        verticalLineTo(168f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
        horizontalLineTo(271.48f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(459.94f, 53.25f)
        arcToRelative(
          16.06f,
          16.06f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -23.22f,
          -0.56f
        )
        lineTo(424.35f, 65f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
        lineToRelative(11.34f, 11.32f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.34f, 0f)
        lineToRelative(12.06f, -12f)
        curveTo(465.19f, 69.54f, 465.76f, 59.62f, 459.94f, 53.25f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(399.34f, 90f)
        lineTo(218.82f, 270.2f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, 3.93f)
        lineTo(208.16f, 299f)
        arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.86f, 4.86f)
        lineToRelative(24.85f, -8.35f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -2.31f)
        lineTo(422f, 112.66f)
        arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 422f, 100f)
        lineTo(412.05f, 90f)
        arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 399.34f, 90f)
        close()
      }
    }.build()

    return _CreateOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CreateOutline: ImageVector? = null
