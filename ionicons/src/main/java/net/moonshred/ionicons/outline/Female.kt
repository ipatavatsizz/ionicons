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

val Ionicons.Outline.Female: ImageVector
  get() {
    if (_FemaleOutline != null) {
      return _FemaleOutline!!
    }
    _FemaleOutline = ImageVector.Builder(
      name = "Outline.FemaleOutline",
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
        moveTo(256f, 184f)
        moveToRelative(-152f, 0f)
        arcToRelative(152f, 152f, 0f, isMoreThanHalf = true, isPositiveArc = true, 304f, 0f)
        arcToRelative(152f, 152f, 0f, isMoreThanHalf = true, isPositiveArc = true, -304f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 336f)
        lineTo(256f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(314f, 416f)
        lineTo(198f, 416f)
      }
    }.build()

    return _FemaleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FemaleOutline: ImageVector? = null
