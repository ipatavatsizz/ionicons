package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Fish: ImageVector
  get() {
    if (_FishOutline != null) {
      return _FishOutline!!
    }
    _FishOutline = ImageVector.Builder(
      name = "Outline.FishOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(240f, 152f)
        curveToRelative(-50.71f, 12.21f, -94.15f, 52.31f, -120.3f, 73.43f)
        arcToRelative(
          261.14f,
          261.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -23.81f,
          -19.58f
        )
        curveTo(59.53f, 179.29f, 16f, 176f, 16f, 176f)
        reflectiveCurveToRelative(11.37f, 51.53f, 41.36f, 79.83f)
        curveTo(27.37f, 284.14f, 16f, 335.67f, 16f, 335.67f)
        reflectiveCurveToRelative(43.53f, -3.29f, 79.89f, -29.85f)
        arcToRelative(
          259.18f,
          259.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          23.61f,
          -19.41f
        )
        curveTo(145.6f, 307.55f, 189.24f, 347.75f, 240f, 360f)
        lineToRelative(-16f, 56f)
        curveToRelative(39.43f, -6.67f, 78.86f, -35.51f, 94.72f, -48.25f)
        curveTo(448f, 362f, 496f, 279f, 496f, 256f)
        curveToRelative(0f, -22f, -48f, -106f, -176.89f, -111.73f)
        curveTo(303.52f, 131.78f, 263.76f, 102.72f, 224f, 96f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 239.99f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(378.37f, 356f)
        arcToRelative(199.22f, 199.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -200f)
      }
    }.build()

    return _FishOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FishOutline: ImageVector? = null
