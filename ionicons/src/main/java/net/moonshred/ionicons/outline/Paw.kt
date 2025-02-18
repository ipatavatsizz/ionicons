package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Paw: ImageVector
  get() {
    if (_PawOutline != null) {
      return _PawOutline!!
    }
    _PawOutline = ImageVector.Builder(
      name = "Outline.PawOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(457.74f, 170.1f)
        arcToRelative(
          30.26f,
          30.26f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -11.16f,
          -2.1f
        )
        horizontalLineToRelative(-0.4f)
        curveToRelative(-20.17f, 0.3f, -42.79f, 19.19f, -54.66f, 47.76f)
        curveToRelative(-14.23f, 34.18f, -7.68f, 69.15f, 14.74f, 78.14f)
        arcToRelative(
          30.21f,
          30.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          11.15f,
          2.1f
        )
        curveToRelative(20.27f, 0f, 43.2f, -19f, 55.17f, -47.76f)
        curveTo(486.71f, 214.06f, 480.06f, 179.09f, 457.74f, 170.1f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(327.6f, 303.48f)
        curveTo(299.8f, 257.35f, 287.8f, 240f, 256f, 240f)
        reflectiveCurveToRelative(-43.9f, 17.46f, -71.7f, 63.48f)
        curveToRelative(-23.8f, 39.36f, -71.9f, 42.64f, -83.9f, 76.07f)
        arcToRelative(
          50.91f,
          50.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -3.6f,
          19.25f
        )
        curveToRelative(0f, 27.19f, 20.8f, 49.2f, 46.4f, 49.2f)
        curveToRelative(31.8f, 0f, 75.1f, -25.39f, 112.9f, -25.39f)
        reflectiveCurveTo(337f, 448f, 368.8f, 448f)
        curveToRelative(25.6f, 0f, 46.3f, -22f, 46.3f, -49.2f)
        arcToRelative(51f, 51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, -19.25f)
        curveTo(399.4f, 346f, 351.4f, 342.84f, 327.6f, 303.48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(192.51f, 196f)
        arcToRelative(26.53f, 26.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -0.3f)
        curveToRelative(23.21f, -3.37f, 37.7f, -35.53f, 32.44f, -71.85f)
        curveTo(224f, 89.61f, 203.22f, 64f, 181.49f, 64f)
        arcToRelative(26.53f, 26.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0.3f)
        curveToRelative(-23.21f, 3.37f, -37.7f, 35.53f, -32.44f, 71.85f)
        curveTo(150f, 170.29f, 170.78f, 196f, 192.51f, 196f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(366.92f, 136.15f)
        curveToRelative(5.26f, -36.32f, -9.23f, -68.48f, -32.44f, -71.85f)
        arcToRelative(26.53f, 26.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -0.3f)
        curveToRelative(-21.73f, 0f, -42.47f, 25.61f, -47.43f, 59.85f)
        curveToRelative(-5.26f, 36.32f, 9.23f, 68.48f, 32.44f, 71.85f)
        arcToRelative(26.53f, 26.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0.3f)
        curveTo(341.22f, 196f, 362f, 170.29f, 366.92f, 136.15f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(105.77f, 293.9f)
        curveToRelative(22.39f, -9f, 28.93f, -44f, 14.72f, -78.14f)
        curveTo(108.53f, 187f, 85.62f, 168f, 65.38f, 168f)
        arcToRelative(
          30.21f,
          30.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -11.15f,
          2.1f
        )
        curveToRelative(-22.39f, 9f, -28.93f, 44f, -14.72f, 78.14f)
        curveTo(51.47f, 277f, 74.38f, 296f, 94.62f, 296f)
        arcTo(30.21f, 30.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 105.77f, 293.9f)
        close()
      }
    }.build()

    return _PawOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PawOutline: ImageVector? = null
