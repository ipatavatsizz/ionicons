package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.DocumentLock: ImageVector
  get() {
    if (_DocumentLockSharp != null) {
      return _DocumentLockSharp!!
    }
    _DocumentLockSharp = ImageVector.Builder(
      name = "Sharp.DocumentLockSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(276f, 192f)
        horizontalLineTo(422.31f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -3.41f)
        lineTo(275.41f, 40.27f)
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 272f, 41.69f)
        verticalLineTo(188f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 276f, 192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 272f)
        curveToRelative(-8.82f, 0f, -16f, 6.28f, -16f, 14f)
        verticalLineToRelative(18f)
        horizontalLineToRelative(32f)
        verticalLineTo(286f)
        curveTo(272f, 278.28f, 264.82f, 272f, 256f, 272f)
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
        moveTo(336f, 399.91f)
        arcTo(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 319.91f, 416f)
        lineTo(192.09f, 416f)
        arcTo(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 399.91f)
        lineTo(176f, 320f)
        curveToRelative(0f, -10f, 7f, -16f, 16f, -16f)
        horizontalLineToRelative(16f)
        lineTo(208f, 286f)
        curveToRelative(0f, -25.36f, 21.53f, -46f, 48f, -46f)
        reflectiveCurveToRelative(48f, 20.64f, 48f, 46f)
        verticalLineToRelative(18f)
        horizontalLineToRelative(16f)
        arcToRelative(15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
      }
    }.build()

    return _DocumentLockSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentLockSharp: ImageVector? = null
