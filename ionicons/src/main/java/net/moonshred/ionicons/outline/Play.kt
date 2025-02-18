package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Play: ImageVector
  get() {
    if (_PlayOutline != null) {
      return _PlayOutline!!
    }
    _PlayOutline = ImageVector.Builder(
      name = "Outline.PlayOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(112f, 111f)
        verticalLineTo(401f)
        curveToRelative(0f, 17.44f, 17f, 28.52f, 31f, 20.16f)
        lineToRelative(247.9f, -148.37f)
        curveToRelative(12.12f, -7.25f, 12.12f, -26.33f, 0f, -33.58f)
        lineTo(143f, 90.84f)
        curveTo(129f, 82.48f, 112f, 93.56f, 112f, 111f)
        close()
      }
    }.build()

    return _PlayOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlayOutline: ImageVector? = null
