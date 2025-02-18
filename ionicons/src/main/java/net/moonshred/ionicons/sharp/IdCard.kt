package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.IdCard: ImageVector
  get() {
    if (_IdCardSharp != null) {
      return _IdCardSharp!!
    }
    _IdCardSharp = ImageVector.Builder(
      name = "Sharp.IdCardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 16f)
        horizontalLineTo(104f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 40f)
        verticalLineTo(472f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(408f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(40f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 408f, 16f)
        close()
        moveTo(346.9f, 312.77f)
        arcToRelative(43f, 43f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40.71f, -40.71f)
        arcTo(43f, 43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 346.9f, 312.77f)
        close()
        moveTo(192f, 64f)
        horizontalLineTo(320f)
        verticalLineTo(96f)
        horizontalLineTo(192f)
        close()
        moveTo(384f, 448f)
        horizontalLineTo(224f)
        verticalLineTo(423.4f)
        curveToRelative(0f, -32.72f, 53.27f, -49.21f, 80f, -49.21f)
        reflectiveCurveToRelative(80f, 16.49f, 80f, 49.21f)
        close()
      }
    }.build()

    return _IdCardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _IdCardSharp: ImageVector? = null
