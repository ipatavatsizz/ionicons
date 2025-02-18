package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Cloudy: ImageVector
  get() {
    if (_Cloudy != null) {
      return _Cloudy!!
    }
    _Cloudy = ImageVector.Builder(
      name = "Filled.Cloudy",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376f, 432f)
        horizontalLineTo(116f)
        curveToRelative(-32.37f, 0f, -60.23f, -8.57f, -80.59f, -24.77f)
        curveTo(12.24f, 388.78f, 0f, 361.39f, 0f, 328f)
        curveToRelative(0f, -57.57f, 42f, -90.58f, 87.56f, -100.75f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.12f, -12.39f)
        curveToRelative(7.68f, -36.68f, 24.45f, -68.15f, 49.18f, -92f)
        arcTo(153.57f, 153.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 80f)
        curveToRelative(35.5f, 0f, 68.24f, 11.69f, 94.68f, 33.8f)
        arcToRelative(
          156.24f,
          156.24f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          42.05f,
          56f
        )
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.37f, 9.16f)
        curveToRelative(27f, 5.61f, 51.07f, 17.33f, 69.18f, 33.85f)
        curveTo(498.61f, 235.88f, 512f, 267.42f, 512f, 304f)
        curveToRelative(0f, 36f, -14.38f, 68.88f, -40.49f, 92.59f)
        curveTo(446.36f, 419.43f, 412.44f, 432f, 376f, 432f)
        close()
      }
    }.build()

    return _Cloudy!!
  }

@Suppress("ObjectPropertyName")
private var _Cloudy: ImageVector? = null
