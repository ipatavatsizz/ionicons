package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Python: ImageVector
  get() {
    if (_Python != null) {
      return _Python!!
    }
    _Python = ImageVector.Builder(
      name = "Logo.Python",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(314f, 36.38f)
        curveToRelative(-18.59f, -3.06f, -45.8f, -4.47f, -64.27f, -4.38f)
        arcToRelative(
          311.09f,
          311.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -51.66f,
          4.38f
        )
        curveToRelative(-45.74f, 8f, -54.07f, 24.7f, -54.07f, 55.54f)
        verticalLineTo(128f)
        horizontalLineTo(256f)
        verticalLineToRelative(16f)
        horizontalLineTo(107.62f)
        curveTo(66.06f, 144f, 32.33f, 193.67f, 32f, 255.12f)
        curveToRelative(0f, 0.29f, 0f, 0.58f, 0f, 0.88f)
        arcToRelative(
          162.91f,
          162.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          3.13f,
          32f
        )
        curveToRelative(9.29f, 46.28f, 38.23f, 80f, 72.49f, 80f)
        horizontalLineTo(128f)
        verticalLineTo(314f)
        curveToRelative(0f, -31.3f, 20.84f, -59.95f, 55f, -66.1f)
        lineToRelative(9.87f, -1.23f)
        horizontalLineTo(314f)
        arcToRelative(
          56.05f,
          56.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          15.06f,
          -2f
        )
        arcTo(52.48f, 52.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 193.68f)
        verticalLineTo(91.92f)
        curveTo(368f, 63f, 343.32f, 41.19f, 314f, 36.38f)
        close()
        moveTo(194.93f, 105.5f)
        arcToRelative(
          20.37f,
          20.37f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          20.3f,
          -20.3f
        )
        arcTo(20.29f, 20.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 194.93f, 105.5f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(475.28f, 217f)
        curveToRelative(-10.7f, -42.61f, -38.41f, -73f, -70.9f, -73f)
        horizontalLineTo(386.67f)
        verticalLineToRelative(47.45f)
        curveToRelative(0f, 39.57f, -26f, 68.22f, -57.74f, 73.13f)
        arcToRelative(
          63.54f,
          63.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.69f,
          0.75f
        )
        horizontalLineTo(198.08f)
        arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.23f, 1.95f)
        curveTo(160.54f, 273.14f, 144f, 291.7f, 144f, 315.77f)
        verticalLineTo(417.54f)
        curveToRelative(0f, 29f, 29.14f, 46f, 57.73f, 54.31f)
        curveToRelative(34.21f, 9.95f, 71.48f, 11.75f, 112.42f, 0f)
        curveToRelative(27.19f, -7.77f, 53.85f, -23.48f, 53.85f, -54.31f)
        verticalLineTo(384f)
        horizontalLineTo(256f)
        verticalLineTo(368f)
        horizontalLineTo(404.38f)
        curveToRelative(29.44f, 0f, 54.95f, -24.93f, 67.45f, -61.31f)
        arcTo(156.83f, 156.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 256f)
        arcTo(160.64f, 160.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 475.28f, 217f)
        close()
        moveTo(316.51f, 404f)
        arcToRelative(
          20.37f,
          20.37f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          -20.3f,
          20.3f
        )
        arcTo(20.29f, 20.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 316.51f, 404f)
        close()
      }
    }.build()

    return _Python!!
  }

@Suppress("ObjectPropertyName")
private var _Python: ImageVector? = null
