package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Wallet: ImageVector
  get() {
    if (_WalletSharp != null) {
      return _WalletSharp!!
    }
    _WalletSharp = ImageVector.Builder(
      name = "Sharp.WalletSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(47.5f, 104f)
        horizontalLineTo(432f)
        verticalLineTo(51.52f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -19.14f, -15.69f)
        lineToRelative(-368f, 60.48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 10.47f)
        arcTo(39.69f, 39.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.5f, 104f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(463.5f, 128f)
        horizontalLineTo(47.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(432f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineToRelative(416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(144f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 463.5f, 128f)
        close()
        moveTo(368f, 320f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 320f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(31.33f, 259.5f)
        verticalLineTo(116f)
        curveToRelative(0f, -12.33f, 5.72f, -18.48f, 15.42f, -20f)
        curveToRelative(35.2f, -5.53f, 108.58f, -8.5f, 108.58f, -8.5f)
        reflectiveCurveToRelative(-8.33f, 16f, -27.33f, 16f)
        verticalLineTo(128f)
        curveToRelative(18.5f, 0f, 31.33f, 23.5f, 31.33f, 23.5f)
        lineTo(84.83f, 236f)
        close()
      }
    }.build()

    return _WalletSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WalletSharp: ImageVector? = null
