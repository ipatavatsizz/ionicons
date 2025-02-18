package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Document: ImageVector
  get() {
    if (_DocumentSharp != null) {
      return _DocumentSharp!!
    }
    _DocumentSharp = ImageVector.Builder(
      name = "Sharp.DocumentSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 216f)
        verticalLineTo(32f)
        horizontalLineTo(92f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 44f)
        verticalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(224f)
        horizontalLineTo(248f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 216f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 41.69f)
        verticalLineTo(188f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
        horizontalLineTo(422.31f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -3.41f)
        lineTo(275.41f, 40.27f)
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 272f, 41.69f)
        close()
      }
    }.build()

    return _DocumentSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentSharp: ImageVector? = null
