package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ColorFill: ImageVector
  get() {
    if (_ColorFillOutline != null) {
      return _ColorFillOutline!!
    }
    _ColorFillOutline = ImageVector.Builder(
      name = "Outline.ColorFillOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(419.1f, 337.45f)
        arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.1f, 0f)
        curveToRelative(-10.5f, 12.4f, -45f, 46.55f, -45f, 77.66f)
        curveToRelative(0f, 27f, 21.5f, 48.89f, 48f, 48.89f)
        horizontalLineToRelative(0f)
        curveToRelative(26.5f, 0f, 48f, -22f, 48f, -48.89f)
        curveTo(464f, 384f, 429.7f, 349.85f, 419.1f, 337.45f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(387f, 287.9f)
        lineTo(155.61f, 58.36f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -51f, 0f)
        lineToRelative(-5.15f, 5.15f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 51f)
        lineToRelative(52.89f, 52.89f)
        lineToRelative(57f, -57f)
        lineTo(56.33f, 263.2f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, 40f)
        lineToRelative(131.2f, 126f)
        arcToRelative(
          28.05f,
          28.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          38.9f,
          -0.1f
        )
        curveToRelative(37.8f, -36.6f, 118.3f, -114.5f, 126.7f, -122.9f)
        curveToRelative(5.8f, -5.8f, 18.2f, -7.1f, 28.7f, -7.1f)
        horizontalLineToRelative(0.3f)
        arcTo(6.53f, 6.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 387f, 287.9f)
        close()
      }
    }.build()

    return _ColorFillOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ColorFillOutline: ImageVector? = null
