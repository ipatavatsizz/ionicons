package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Nutrition: ImageVector
  get() {
    if (_NutritionOutline != null) {
      return _NutritionOutline!!
    }
    _NutritionOutline = ImageVector.Builder(
      name = "Outline.NutritionOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(352f, 128f)
        curveToRelative(-32.26f, -2.89f, -64f, 16f, -96f, 16f)
        reflectiveCurveToRelative(-63.75f, -19f, -96f, -16f)
        curveToRelative(-64f, 6f, -96f, 64f, -96f, 160f)
        curveToRelative(0f, 80f, 64f, 192f, 111.2f, 192f)
        reflectiveCurveToRelative(51.94f, -24f, 80.8f, -24f)
        reflectiveCurveToRelative(33.59f, 24f, 80.8f, 24f)
        reflectiveCurveTo(448f, 368f, 448f, 288f)
        curveTo(448f, 192f, 419f, 134f, 352f, 128f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(323.92f, 83.14f)
        curveToRelative(-21f, 21f, -45.66f, 27f, -58.82f, 28.79f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 103.2f)
        arcToRelative(
          97.6f,
          97.6f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          28.61f,
          -59.33f
        )
        curveToRelative(22f, -22f, 46f, -26.9f, 58.72f, -27.85f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 24.94f)
        arcTo(98f, 98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 323.92f, 83.14f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 304f)
        arcToRelative(24f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 0f)
        arcToRelative(24f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 304f)
        arcToRelative(24f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 0f)
        arcToRelative(24f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 0f)
        close()
      }
    }.build()

    return _NutritionOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NutritionOutline: ImageVector? = null
