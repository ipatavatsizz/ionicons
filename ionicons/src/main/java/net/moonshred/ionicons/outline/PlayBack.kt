package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PlayBack: ImageVector
  get() {
    if (_PlayBackOutline != null) {
      return _PlayBackOutline!!
    }
    _PlayBackOutline = ImageVector.Builder(
      name = "Outline.PlayBackOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(480f, 145.52f)
        verticalLineToRelative(221f)
        curveToRelative(0f, 13.28f, -13f, 21.72f, -23.63f, 15.35f)
        lineTo(267.5f, 268.8f)
        curveToRelative(-9.24f, -5.53f, -9.24f, -20.07f, 0f, -25.6f)
        lineToRelative(188.87f, -113f)
        curveTo(467f, 123.8f, 480f, 132.24f, 480f, 145.52f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(251.43f, 145.52f)
        verticalLineToRelative(221f)
        curveToRelative(0f, 13.28f, -13f, 21.72f, -23.63f, 15.35f)
        lineTo(38.93f, 268.8f)
        curveToRelative(-9.24f, -5.53f, -9.24f, -20.07f, 0f, -25.6f)
        lineToRelative(188.87f, -113f)
        curveTo(238.44f, 123.8f, 251.43f, 132.24f, 251.43f, 145.52f)
        close()
      }
    }.build()

    return _PlayBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlayBackOutline: ImageVector? = null
