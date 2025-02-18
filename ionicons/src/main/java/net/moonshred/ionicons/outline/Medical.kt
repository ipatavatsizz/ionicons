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

val Ionicons.Outline.Medical: ImageVector
  get() {
    if (_MedicalOutline != null) {
      return _MedicalOutline!!
    }
    _MedicalOutline = ImageVector.Builder(
      name = "Outline.MedicalOutline",
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
        moveTo(429.93f, 174.27f)
        lineToRelative(-16.47f, -28.59f)
        arcToRelative(
          15.49f,
          15.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -21.15f,
          -5.7f
        )
        lineToRelative(-98.39f, 57f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -3.5f)
        lineTo(288f, 80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(240f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        lineToRelative(0.07f, 113.57f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 3.5f)
        lineToRelative(-98.39f, -57f)
        arcToRelative(
          15.49f,
          15.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -21.15f,
          5.7f
        )
        lineTo(82.07f, 174.37f)
        arcToRelative(
          15.42f,
          15.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          5.69f,
          21.1f
        )
        lineToRelative(98.49f, 57.08f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.9f)
        lineTo(87.76f, 316.53f)
        arcToRelative(
          15.54f,
          15.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -5.69f,
          21.1f
        )
        lineToRelative(16.47f, 28.59f)
        arcToRelative(
          15.49f,
          15.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          21.15f,
          5.7f
        )
        lineToRelative(98.39f, -57f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3.5f)
        lineTo(224f, 432f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineToRelative(32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        lineToRelative(-0.07f, -113.67f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, -3.5f)
        lineToRelative(98.39f, 57f)
        arcToRelative(
          15.49f,
          15.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          21.15f,
          -5.7f
        )
        lineToRelative(16.47f, -28.59f)
        arcToRelative(
          15.42f,
          15.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -5.69f,
          -21.1f
        )
        lineToRelative(-98.49f, -57.08f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6.9f)
        lineToRelative(98.49f, -57.08f)
        arcTo(15.51f, 15.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 429.93f, 174.27f)
        close()
      }
    }.build()

    return _MedicalOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MedicalOutline: ImageVector? = null
