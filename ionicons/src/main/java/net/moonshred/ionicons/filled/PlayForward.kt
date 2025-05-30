package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.PlayForward: ImageVector
  get() {
    if (_PlayForward != null) {
      return _PlayForward!!
    }
    _PlayForward = ImageVector.Builder(
      name = "Filled.PlayForward",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(481.29f, 229.47f)
        lineToRelative(-188.87f, -113f)
        arcToRelative(
          30.54f,
          30.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -31.09f,
          -0.39f
        )
        arcToRelative(
          33.74f,
          33.74f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -16.76f,
          29.47f
        )
        verticalLineTo(224.6f)
        lineTo(63.85f, 116.44f)
        arcToRelative(
          30.54f,
          30.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -31.09f,
          -0.39f
        )
        arcTo(33.74f, 33.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 145.52f)
        verticalLineToRelative(221f)
        arcTo(33.74f, 33.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.76f, 396f)
        arcToRelative(
          30.54f,
          30.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          31.09f,
          -0.39f
        )
        lineTo(244.57f, 287.4f)
        verticalLineToRelative(79.08f)
        arcTo(33.74f, 33.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 261.33f, 396f)
        arcToRelative(
          30.54f,
          30.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          31.09f,
          -0.39f
        )
        lineToRelative(188.87f, -113f)
        arcToRelative(31.27f, 31.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -53f)
        close()
      }
    }.build()

    return _PlayForward!!
  }

@Suppress("ObjectPropertyName")
private var _PlayForward: ImageVector? = null
