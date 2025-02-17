package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.HeartCircle: ImageVector
  get() {
    if (_HeartCircleOutline != null) {
      return _HeartCircleOutline!!
    }
    _HeartCircleOutline = ImageVector.Builder(
      name = "Outline.HeartCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 360f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -2.78f)
        curveToRelative(-39.3f, -26.68f, -56.32f, -45f, -65.7f, -56.41f)
        curveToRelative(-20f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
        curveToRelative(0.31f, -31.06f, 25.22f, -56.33f, 55.53f, -56.33f)
        curveToRelative(20.4f, 0f, 35f, 10.63f, 44.1f, 20.41f)
        arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.72f, 0f)
        curveToRelative(9.11f, -9.78f, 23.7f, -20.41f, 44.1f, -20.41f)
        curveToRelative(30.31f, 0f, 55.22f, 25.27f, 55.53f, 56.33f)
        curveToRelative(0.28f, 27.1f, -9.31f, 52.13f, -29.3f, 76.5f)
        curveToRelative(-9.38f, 11.44f, -26.4f, 29.73f, -65.7f, 56.41f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 360f)
        close()
      }
    }.build()

    return _HeartCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HeartCircleOutline: ImageVector? = null
