package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.PeopleCircle: ImageVector
  get() {
    if (_PeopleCircleOutline != null) {
      return _PeopleCircleOutline!!
    }
    _PeopleCircleOutline = ImageVector.Builder(
      name = "Outline.PeopleCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        curveTo(141.31f, 464f, 48f, 370.69f, 48f, 256f)
        reflectiveCurveTo(141.31f, 48f, 256f, 48f)
        reflectiveCurveToRelative(208f, 93.31f, 208f, 208f)
        reflectiveCurveTo(370.69f, 464f, 256f, 464f)
        close()
        moveTo(256f, 80f)
        curveTo(159f, 80f, 80f, 159f, 80f, 256f)
        reflectiveCurveTo(159f, 432f, 256f, 432f)
        reflectiveCurveToRelative(176f, -78.95f, 176f, -176f)
        reflectiveCurveTo(353.05f, 80f, 256f, 80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(323.67f, 292f)
        curveToRelative(-17.4f, 0f, -34.21f, -7.72f, -47.34f, -21.73f)
        arcToRelative(
          83.76f,
          83.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -22f,
          -51.32f
        )
        curveToRelative(-1.47f, -20.7f, 4.88f, -39.75f, 17.88f, -53.62f)
        reflectiveCurveTo(303.38f, 144f, 323.67f, 144f)
        curveToRelative(20.14f, 0f, 38.37f, 7.62f, 51.33f, 21.46f)
        reflectiveCurveToRelative(19.47f, 33f, 18f, 53.51f)
        horizontalLineToRelative(0f)
        arcToRelative(84f, 84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22f, 51.3f)
        curveTo(357.86f, 284.28f, 341.06f, 292f, 323.67f, 292f)
        close()
        moveTo(379.48f, 218f)
        horizontalLineToRelative(0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(163.82f, 295.36f)
        curveToRelative(-29.76f, 0f, -55.93f, -27.51f, -58.33f, -61.33f)
        curveToRelative(-1.23f, -17.32f, 4.15f, -33.33f, 15.17f, -45.08f)
        reflectiveCurveToRelative(26.22f, -18f, 43.15f, -18f)
        reflectiveCurveToRelative(32.12f, 6.44f, 43.07f, 18.14f)
        reflectiveCurveToRelative(16.5f, 27.82f, 15.25f, 45f)
        curveTo(219.69f, 267.86f, 193.53f, 295.36f, 163.82f, 295.36f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(420.37f, 355.28f)
        curveToRelative(-1.59f, -4.7f, -5.46f, -9.71f, -13.22f, -14.46f)
        curveToRelative(-23.46f, -14.33f, -52.32f, -21.91f, -83.48f, -21.91f)
        curveToRelative(-30.57f, 0f, -60.23f, 7.9f, -83.53f, 22.25f)
        curveToRelative(-26.25f, 16.17f, -43.89f, 39.75f, -51f, 68.18f)
        curveToRelative(-1.68f, 6.69f, -4.13f, 19.14f, -1.51f, 26.11f)
        arcToRelative(
          192.18f,
          192.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          232.75f,
          -80.17f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(163.63f, 401.37f)
        curveToRelative(7.07f, -28.21f, 22.12f, -51.73f, 45.47f, -70.75f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.59f, -13.77f)
        curveToRelative(-12f, -3.83f, -25.7f, -5.88f, -42.69f, -5.88f)
        curveToRelative(-23.82f, 0f, -49.11f, 6.45f, -68.14f, 18.17f)
        curveToRelative(-5.4f, 3.33f, -10.7f, 4.61f, -14.78f, 5.75f)
        arcToRelative(
          192.84f,
          192.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          77.78f,
          86.64f
        )
        lineToRelative(1.79f, -0.14f)
        arcTo(102.82f, 102.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 163.63f, 401.37f)
        close()
      }
    }.build()

    return _PeopleCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PeopleCircleOutline: ImageVector? = null
