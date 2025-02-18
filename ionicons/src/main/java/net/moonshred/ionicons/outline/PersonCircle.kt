package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PersonCircle: ImageVector
  get() {
    if (_PersonCircleOutline != null) {
      return _PersonCircleOutline!!
    }
    _PersonCircleOutline = ImageVector.Builder(
      name = "Outline.PersonCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(258.9f, 48f)
        curveTo(141.92f, 46.42f, 46.42f, 141.92f, 48f, 258.9f)
        curveTo(49.56f, 371.09f, 140.91f, 462.44f, 253.1f, 464f)
        curveToRelative(117f, 1.6f, 212.48f, -93.9f, 210.88f, -210.88f)
        curveTo(462.44f, 140.91f, 371.09f, 49.56f, 258.9f, 48f)
        close()
        moveTo(385.32f, 375.25f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.14f, -0.32f)
        arcToRelative(
          124.27f,
          124.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32.35f,
          -29.59f
        )
        curveTo(321.37f, 329f, 289.11f, 320f, 256f, 320f)
        reflectiveCurveToRelative(-65.37f, 9f, -90.83f, 25.34f)
        arcToRelative(
          124.24f,
          124.24f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32.35f,
          29.58f
        )
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.14f, 0.32f)
        arcTo(175.32f, 175.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 259f)
        curveTo(78.37f, 161.69f, 158.22f, 80.24f, 255.57f, 80f)
        reflectiveCurveTo(432f, 158.81f, 432f, 256f)
        arcTo(175.32f, 175.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 385.32f, 375.25f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 144f)
        curveToRelative(-19.72f, 0f, -37.55f, 7.39f, -50.22f, 20.82f)
        reflectiveCurveToRelative(-19f, 32f, -17.57f, 51.93f)
        curveTo(191.11f, 256f, 221.52f, 288f, 256f, 288f)
        reflectiveCurveToRelative(64.83f, -32f, 67.79f, -71.24f)
        curveToRelative(1.48f, -19.74f, -4.8f, -38.14f, -17.68f, -51.82f)
        curveTo(293.39f, 151.44f, 275.59f, 144f, 256f, 144f)
        close()
      }
    }.build()

    return _PersonCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PersonCircleOutline: ImageVector? = null
