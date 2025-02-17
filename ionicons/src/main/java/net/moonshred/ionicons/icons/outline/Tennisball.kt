package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Tennisball: ImageVector
  get() {
    if (_TennisballOutline != null) {
      return _TennisballOutline!!
    }
    _TennisballOutline = ImageVector.Builder(
      name = "Outline.TennisballOutline",
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
        moveTo(256f, 256f)
        moveToRelative(-208f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, 416f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, -416f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(461.43f, 271.44f)
        curveToRelative(-5.09f, 0.37f, -8.24f, 0.56f, -13.43f, 0.56f)
        curveToRelative(-114.88f, 0f, -208f, -93.12f, -208f, -208f)
        curveToRelative(0f, -5.37f, 0.2f, -8.69f, 0.6f, -14f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(49.65f, 240.56f)
        reflectiveCurveTo(58.84f, 240f, 64f, 240f)
        curveToRelative(114.88f, 0f, 208f, 93.12f, 208f, 208f)
        curveToRelative(0f, 5.38f, -0.61f, 14f, -0.61f, 14f)
      }
    }.build()

    return _TennisballOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TennisballOutline: ImageVector? = null
