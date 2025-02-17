package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Eye: ImageVector
  get() {
    if (_EyeOutline != null) {
      return _EyeOutline!!
    }
    _EyeOutline = ImageVector.Builder(
      name = "Outline.EyeOutline",
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
        moveTo(255.66f, 112f)
        curveToRelative(-77.94f, 0f, -157.89f, 45.11f, -220.83f, 135.33f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.27f, 17.77f)
        curveTo(82.92f, 340.8f, 161.8f, 400f, 255.66f, 400f)
        curveTo(348.5f, 400f, 429f, 340.62f, 477.45f, 264.75f)
        arcToRelative(
          16.14f,
          16.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -17.47f
        )
        curveTo(428.89f, 172.28f, 347.8f, 112f, 255.66f, 112f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-80f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -160f, 0f)
      }
    }.build()

    return _EyeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EyeOutline: ImageVector? = null
