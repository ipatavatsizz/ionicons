package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PlayForward: ImageVector
  get() {
    if (_PlayForwardOutline != null) {
      return _PlayForwardOutline!!
    }
    _PlayForwardOutline = ImageVector.Builder(
      name = "Outline.PlayForwardOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(32f, 145.52f)
        verticalLineToRelative(221f)
        curveToRelative(0f, 13.28f, 13f, 21.72f, 23.63f, 15.35f)
        lineToRelative(188.87f, -113f)
        curveToRelative(9.24f, -5.53f, 9.24f, -20.07f, 0f, -25.6f)
        lineToRelative(-188.87f, -113f)
        curveTo(45f, 123.8f, 32f, 132.24f, 32f, 145.52f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(260.57f, 145.52f)
        verticalLineToRelative(221f)
        curveToRelative(0f, 13.28f, 13f, 21.72f, 23.63f, 15.35f)
        lineToRelative(188.87f, -113f)
        curveToRelative(9.24f, -5.53f, 9.24f, -20.07f, 0f, -25.6f)
        lineToRelative(-188.87f, -113f)
        curveTo(273.56f, 123.8f, 260.57f, 132.24f, 260.57f, 145.52f)
        close()
      }
    }.build()

    return _PlayForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlayForwardOutline: ImageVector? = null
