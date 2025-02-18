package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Location: ImageVector
  get() {
    if (_LocationOutline != null) {
      return _LocationOutline!!
    }
    _LocationOutline = ImageVector.Builder(
      name = "Outline.LocationOutline",
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
        moveTo(256f, 48f)
        curveToRelative(-79.5f, 0f, -144f, 61.39f, -144f, 137f)
        curveToRelative(0f, 87f, 96f, 224.87f, 131.25f, 272.49f)
        arcToRelative(15.77f, 15.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.5f, 0f)
        curveTo(304f, 409.89f, 400f, 272.07f, 400f, 185f)
        curveTo(400f, 109.39f, 335.5f, 48f, 256f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 192f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
    }.build()

    return _LocationOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LocationOutline: ImageVector? = null
