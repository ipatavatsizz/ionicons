package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.PlaySkipBack: ImageVector
  get() {
    if (_PlaySkipBack != null) {
      return _PlaySkipBack!!
    }
    _PlaySkipBack = ImageVector.Builder(
      name = "Filled.PlaySkipBack",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineTo(216.43f)
        lineTo(360.77f, 77.11f)
        arcToRelative(
          35.13f,
          35.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          35.77f,
          -0.44f
        )
        curveToRelative(12f, 6.8f, 19.46f, 20f, 19.46f, 34.33f)
        verticalLineTo(401f)
        curveToRelative(0f, 14.37f, -7.46f, 27.53f, -19.46f, 34.33f)
        arcToRelative(
          35.14f,
          35.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -35.77f,
          -0.45f
        )
        lineTo(128f, 295.57f)
        verticalLineTo(432f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        verticalLineTo(80f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 64f)
        close()
      }
    }.build()

    return _PlaySkipBack!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipBack: ImageVector? = null
