package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Download: ImageVector
  get() {
    if (_Download != null) {
      return _Download!!
    }
    _Download = ImageVector.Builder(
      name = "Filled.Download",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376f, 160f)
        horizontalLineTo(272f)
        verticalLineTo(313.37f)
        lineToRelative(52.69f, -52.68f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 22.62f)
        lineToRelative(-80f, 80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, 0f)
        lineToRelative(-80f, -80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, -22.62f)
        lineTo(240f, 313.37f)
        verticalLineTo(160f)
        horizontalLineTo(136f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineTo(424f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineTo(376f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(216f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 376f, 160f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 0f)
        verticalLineTo(160f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _Download!!
  }

@Suppress("ObjectPropertyName")
private var _Download: ImageVector? = null
