package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Wallet: ImageVector
  get() {
    if (_WalletOutline != null) {
      return _WalletOutline!!
    }
    _WalletOutline = ImageVector.Builder(
      name = "Outline.WalletOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96f, 144f)
        lineTo(416f, 144f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 192f)
        lineTo(464f, 384f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 432f)
        lineTo(96f, 432f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 384f)
        lineTo(48f, 192f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 144f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(411.36f, 144f)
        verticalLineTo(114f)
        arcTo(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 64.9f)
        lineTo(88.64f, 109.85f)
        arcTo(50f, 50f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 159f)
        verticalLineToRelative(49f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 320f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 320f)
        close()
      }
    }.build()

    return _WalletOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WalletOutline: ImageVector? = null
