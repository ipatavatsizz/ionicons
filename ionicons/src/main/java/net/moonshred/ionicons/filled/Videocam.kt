package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Videocam: ImageVector
  get() {
    if (_Videocam != null) {
      return _Videocam!!
    }
    _Videocam = ImageVector.Builder(
      name = "Filled.Videocam",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 384.39f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13f, -2.77f)
        arcToRelative(
          15.77f,
          15.77f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.71f,
          -1.54f
        )
        lineToRelative(-82.71f, -58.22f)
        horizontalLineToRelative(0f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 295.7f)
        verticalLineTo(216.3f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.58f, -26.16f)
        lineToRelative(82.71f, -58.22f)
        arcToRelative(
          15.77f,
          15.77f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.71f,
          -1.54f
        )
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45f, 29.24f)
        verticalLineTo(352.38f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(268f, 400f)
        horizontalLineTo(84f)
        arcToRelative(68.07f, 68.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -68f, -68f)
        verticalLineTo(180f)
        arcToRelative(68.07f, 68.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, -68f)
        horizontalLineTo(268.48f)
        arcTo(67.6f, 67.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 179.52f)
        verticalLineTo(332f)
        arcTo(68.07f, 68.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 268f, 400f)
        close()
      }
    }.build()

    return _Videocam!!
  }

@Suppress("ObjectPropertyName")
private var _Videocam: ImageVector? = null
