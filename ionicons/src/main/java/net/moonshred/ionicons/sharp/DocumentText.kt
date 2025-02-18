package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.DocumentText: ImageVector
  get() {
    if (_DocumentTextSharp != null) {
      return _DocumentTextSharp!!
    }
    _DocumentTextSharp = ImageVector.Builder(
      name = "Sharp.DocumentTextSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
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
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(248f, 224f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        lineTo(240f, 32f)
        lineTo(92f, 32f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 44f)
        lineTo(80f, 468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        lineTo(420f, 480f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        lineTo(432f, 224f)
        close()
        moveTo(352f, 384f)
        lineTo(160f, 384f)
        lineTo(160f, 352f)
        lineTo(352f, 352f)
        close()
        moveTo(352f, 304f)
        lineTo(160f, 304f)
        lineTo(160f, 272f)
        lineTo(352f, 272f)
        close()
      }
    }.build()

    return _DocumentTextSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentTextSharp: ImageVector? = null
