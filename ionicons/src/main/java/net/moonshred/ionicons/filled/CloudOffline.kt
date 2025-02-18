package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.CloudOffline: ImageVector
  get() {
    if (_CloudOffline != null) {
      return _CloudOffline!!
    }
    _CloudOffline = ImageVector.Builder(
      name = "Filled.CloudOffline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 464f)
        arcToRelative(
          15.92f,
          15.92f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -11.31f,
          -4.69f
        )
        lineToRelative(-384f, -384f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 75.31f, 52.69f)
        lineToRelative(384f, 384f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 464f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(38.72f, 196.78f)
        curveTo(13.39f, 219.88f, 0f, 251.42f, 0f, 288f)
        curveToRelative(0f, 36f, 14.38f, 68.88f, 40.49f, 92.59f)
        curveTo(65.64f, 403.43f, 99.56f, 416f, 136f, 416f)
        horizontalLineTo(328.8f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -13.66f)
        lineTo(100.88f, 168.76f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -2f)
        curveTo(72f, 173.15f, 53.4f, 183.38f, 38.72f, 196.78f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(476.59f, 391.23f)
        curveTo(499.76f, 372.78f, 512f, 345.39f, 512f, 312f)
        curveToRelative(0f, -57.57f, -42f, -90.58f, -87.56f, -100.75f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.12f, -12.39f)
        curveToRelative(-7.68f, -36.68f, -24.45f, -68.15f, -49.18f, -92f)
        arcTo(153.57f, 153.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 64f)
        curveToRelative(-31.12f, 0f, -60.12f, 9f, -84.62f, 26.1f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, 12.26f)
        lineTo(461.68f, 393.8f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.2f, 0.93f)
        quadTo(474.31f, 393.05f, 476.59f, 391.23f)
        close()
      }
    }.build()

    return _CloudOffline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudOffline: ImageVector? = null
