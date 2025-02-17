package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Cloudy: ImageVector
  get() {
    if (_CloudyOutline != null) {
      return _CloudyOutline!!
    }
    _CloudyOutline = ImageVector.Builder(
      name = "Outline.CloudyOutline",
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
        moveTo(100.18f, 241.19f)
        arcToRelative(
          15.93f,
          15.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          13.37f,
          -13.25f
        )
        curveTo(126.6f, 145.59f, 186.34f, 96f, 256f, 96f)
        curveToRelative(64.69f, 0f, 107.79f, 42.36f, 124.92f, 87f)
        arcToRelative(
          16.11f,
          16.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          12.53f,
          10.18f
        )
        curveTo(449.36f, 202.06f, 496f, 239.21f, 496f, 304f)
        curveToRelative(0f, 66f, -54f, 112f, -120f, 112f)
        horizontalLineTo(116f)
        curveToRelative(-55f, 0f, -100f, -27.44f, -100f, -88f)
        curveTo(16f, 273.57f, 59.89f, 247.19f, 100.18f, 241.19f)
        close()
      }
    }.build()

    return _CloudyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudyOutline: ImageVector? = null
