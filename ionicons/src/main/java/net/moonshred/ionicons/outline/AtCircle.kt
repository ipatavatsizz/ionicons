package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.AtCircle: ImageVector
  get() {
    if (_AtCircleOutline != null) {
      return _AtCircleOutline!!
    }
    _AtCircleOutline = ImageVector.Builder(
      name = "Outline.AtCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448.08f, 256.08f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveToRelative(-192f, 86f, -192f, 192f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448.08f, 362.11f, 448.08f, 256.08f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 28f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(300.81f, 358.29f)
        curveToRelative(-20.83f, 7.42f, -34.05f, 9.59f, -54.19f, 9.59f)
        curveToRelative(-61.17f, 0f, -106.39f, -50.07f, -101f, -111.84f)
        reflectiveCurveTo(205f, 144.21f, 266.14f, 144.21f)
        curveToRelative(68.92f, 0f, 106.79f, 45.55f, 101.47f, 106.55f)
        curveToRelative(-4f, 45.54f, -32.8f, 58.66f, -47.89f, 56f)
        curveToRelative(-14.2f, -2.55f, -25.92f, -15.52f, -23.75f, -40.35f)
        lineToRelative(5.62f, -44.66f)
        curveToRelative(-7.58f, -9.17f, -28.11f, -18f, -49.93f, -14.54f)
        curveTo(231.77f, 210.3f, 209f, 228f, 206.56f, 256f)
        reflectiveCurveToRelative(14.49f, 50.84f, 39.93f, 50.84f)
        reflectiveCurveToRelative(47.86f, -18.39f, 50.69f, -50.84f)
      }
    }.build()

    return _AtCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AtCircleOutline: ImageVector? = null
