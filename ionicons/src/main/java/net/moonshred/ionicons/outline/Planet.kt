package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Planet: ImageVector
  get() {
    if (_PlanetOutline != null) {
      return _PlanetOutline!!
    }
    _PlanetOutline = ImageVector.Builder(
      name = "Outline.PlanetOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(413.48f, 284.46f)
        curveToRelative(58.87f, 47.24f, 91.61f, 89f, 80.31f, 108.55f)
        curveToRelative(-17.85f, 30.85f, -138.78f, -5.48f, -270.1f, -81.15f)
        reflectiveCurveTo(0.37f, 149.84f, 18.21f, 119f)
        curveToRelative(11.16f, -19.28f, 62.58f, -12.32f, 131.64f, 14.09f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-160f, 0f)
        arcToRelative(160f, 160f, 0f, isMoreThanHalf = true, isPositiveArc = true, 320f, 0f)
        arcToRelative(160f, 160f, 0f, isMoreThanHalf = true, isPositiveArc = true, -320f, 0f)
      }
    }.build()

    return _PlanetOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlanetOutline: ImageVector? = null
