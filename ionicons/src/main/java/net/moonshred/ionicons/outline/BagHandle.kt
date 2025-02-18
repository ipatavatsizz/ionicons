package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.BagHandle: ImageVector
  get() {
    if (_BagHandleOutline != null) {
      return _BagHandleOutline!!
    }
    _BagHandleOutline = ImageVector.Builder(
      name = "Outline.BagHandleOutline",
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
        moveTo(80f, 176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(408f)
        curveToRelative(0f, 30.24f, 25.76f, 56f, 56f, 56f)
        horizontalLineTo(392f)
        curveToRelative(30.24f, 0f, 56f, -24.51f, 56f, -54.75f)
        verticalLineTo(192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 176f)
        verticalLineTo(144f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, -96f)
        horizontalLineToRelative(0f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
        verticalLineToRelative(32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 224f)
        verticalLineToRelative(16f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 96f)
        horizontalLineToRelative(0f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, -96f)
        verticalLineTo(224f)
      }
    }.build()

    return _BagHandleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BagHandleOutline: ImageVector? = null
