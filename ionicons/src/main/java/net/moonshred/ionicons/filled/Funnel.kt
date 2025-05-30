package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Funnel: ImageVector
  get() {
    if (_Funnel != null) {
      return _Funnel!!
    }
    _Funnel = ImageVector.Builder(
      name = "Filled.Funnel",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(296f, 464f)
        arcToRelative(
          23.88f,
          23.88f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -7.55f,
          -1.23f
        )
        lineToRelative(-80.15f, -26.67f)
        arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 413.32f)
        verticalLineTo(294.11f)
        arcToRelative(
          0.44f,
          0.44f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.09f,
          -0.13f
        )
        lineTo(23.26f, 97.54f)
        arcTo(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46.05f, 48f)
        horizontalLineTo(466f)
        arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.79f, 49.54f)
        lineTo(320.09f, 294f)
        arcToRelative(
          0.77f,
          0.77f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.09f,
          0.13f
        )
        verticalLineTo(440f)
        arcToRelative(23.93f, 23.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        close()
      }
    }.build()

    return _Funnel!!
  }

@Suppress("ObjectPropertyName")
private var _Funnel: ImageVector? = null
