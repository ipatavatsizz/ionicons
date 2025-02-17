package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Male: ImageVector
  get() {
    if (_MaleOutline != null) {
      return _MaleOutline!!
    }
    _MaleOutline = ImageVector.Builder(
      name = "Outline.MaleOutline",
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
        moveTo(216f, 296f)
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
        moveTo(448f, 160f)
        lineToRelative(0f, -96f)
        lineToRelative(-96f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(324f, 188f)
        lineTo(448f, 64f)
      }
    }.build()

    return _MaleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MaleOutline: ImageVector? = null
