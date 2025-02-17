package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Skull: ImageVector
  get() {
    if (_SkullOutline != null) {
      return _SkullOutline!!
    }
    _SkullOutline = ImageVector.Builder(
      name = "Outline.SkullOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(448f, 225.64f)
        verticalLineToRelative(99f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40.23f, 59.42f)
        lineToRelative(-23.68f, 9.47f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 364.6f, 417f)
        lineToRelative(-10f, 50.14f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 338.88f, 480f)
        horizontalLineTo(173.12f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.69f, -12.86f)
        lineTo(147.4f, 417f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.49f, -23.44f)
        lineToRelative(-23.68f, -9.47f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 324.67f)
        verticalLineTo(224f)
        curveTo(64f, 118.08f, 149.77f, 32.19f, 255.65f, 32f)
        reflectiveCurveTo(448f, 119.85f, 448f, 225.64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(168f, 280f)
        moveToRelative(-40f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(344f, 280f)
        moveToRelative(-40f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 336f)
        lineToRelative(-16f, 48f)
        lineToRelative(32f, 0f)
        lineToRelative(-16f, -48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 448f)
        lineTo(256f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 448f)
        lineTo(208f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(304f, 448f)
        lineTo(304f, 480f)
      }
    }.build()

    return _SkullOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SkullOutline: ImageVector? = null
