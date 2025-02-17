package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Egg: ImageVector
  get() {
    if (_EggOutline != null) {
      return _EggOutline!!
    }
    _EggOutline = ImageVector.Builder(
      name = "Outline.EggOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 48f)
        curveTo(192f, 48f, 96f, 171.69f, 96f, 286.55f)
        reflectiveCurveTo(160f, 464f, 256f, 464f)
        reflectiveCurveToRelative(160f, -62.59f, 160f, -177.45f)
        reflectiveCurveTo(320f, 48f, 256f, 48f)
        close()
      }
    }.build()

    return _EggOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EggOutline: ImageVector? = null
