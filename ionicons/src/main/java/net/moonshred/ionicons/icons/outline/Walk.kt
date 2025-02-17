package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Walk: ImageVector
  get() {
    if (_WalkOutline != null) {
      return _WalkOutline!!
    }
    _WalkOutline = ImageVector.Builder(
      name = "Outline.WalkOutline",
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
        moveTo(314.21f, 482.32f)
        lineTo(257.44f, 367.58f)
        lineToRelative(-44.89f, -57.39f)
        arcToRelative(
          72.82f,
          72.82f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -10.13f,
          -37.05f
        )
        verticalLineTo(144f)
        horizontalLineToRelative(15.67f)
        arcToRelative(
          40.22f,
          40.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          40.23f,
          40.22f
        )
        verticalLineTo(367.58f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(127.9f, 293.05f)
        verticalLineTo(218.53f)
        reflectiveCurveTo(165.16f, 144f, 202.42f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(370.1f, 274.42f)
        lineTo(304f, 231f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(170.53f, 478.36f)
        lineTo(224f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(258.32f, 69.48f)
        moveToRelative(-37.26f, 0f)
        arcToRelative(37.26f, 37.26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 74.52f, 0f)
        arcToRelative(37.26f, 37.26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -74.52f, 0f)
      }
    }.build()

    return _WalkOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WalkOutline: ImageVector? = null
