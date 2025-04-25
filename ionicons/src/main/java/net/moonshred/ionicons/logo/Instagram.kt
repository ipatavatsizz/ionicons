package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Instagram: ImageVector
  get() {
    if (_Instagram != null) {
      return _Instagram!!
    }
    _Instagram = ImageVector.Builder(
      name = "Logo.Instagram",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(349.33f, 69.33f)
        arcToRelative(
          93.62f,
          93.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          93.34f,
          93.34f
        )
        verticalLineTo(349.33f)
        arcToRelative(
          93.62f,
          93.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -93.34f,
          93.34f
        )
        horizontalLineTo(162.67f)
        arcToRelative(
          93.62f,
          93.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -93.34f,
          -93.34f
        )
        verticalLineTo(162.67f)
        arcToRelative(
          93.62f,
          93.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          93.34f,
          -93.34f
        )
        horizontalLineTo(349.33f)
        moveToRelative(0f, -37.33f)
        horizontalLineTo(162.67f)
        curveTo(90.8f, 32f, 32f, 90.8f, 32f, 162.67f)
        verticalLineTo(349.33f)
        curveTo(32f, 421.2f, 90.8f, 480f, 162.67f, 480f)
        horizontalLineTo(349.33f)
        curveTo(421.2f, 480f, 480f, 421.2f, 480f, 349.33f)
        verticalLineTo(162.67f)
        curveTo(480f, 90.8f, 421.2f, 32f, 349.33f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(377.33f, 162.67f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, -28f)
        arcTo(27.94f, 27.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 377.33f, 162.67f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 181.33f)
        arcTo(74.67f, 74.67f, 0f, isMoreThanHalf = true, isPositiveArc = true, 181.33f, 256f)
        arcTo(74.75f, 74.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 181.33f)
        moveTo(256f, 144f)
        arcTo(112f, 112f, 0f, isMoreThanHalf = true, isPositiveArc = false, 368f, 256f)
        arcTo(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 144f)
        close()
      }
    }.build()

    return _Instagram!!
  }

@Suppress("ObjectPropertyName")
private var _Instagram: ImageVector? = null
