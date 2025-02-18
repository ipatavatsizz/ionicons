package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.IceCream: ImageVector
  get() {
    if (_IceCreamOutline != null) {
      return _IceCreamOutline!!
    }
    _IceCreamOutline = ImageVector.Builder(
      name = "Outline.IceCreamOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 256f)
        lineToRelative(-96f, 224f)
        lineToRelative(-62f, -145f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(299.42f, 223.48f)
        curveTo(291.74f, 239.75f, 275.18f, 252f, 256f, 252f)
        curveToRelative(-13.1f, 0f, -27f, -5f, -33.63f, -9.76f)
        curveTo(216.27f, 237.87f, 208f, 240f, 208f, 250f)
        verticalLineToRelative(62f)
        arcToRelative(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        horizontalLineToRelative(0f)
        arcToRelative(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(256f)
        horizontalLineToRelative(-2f)
        curveToRelative(-35.35f, 0f, -62f, -28.65f, -62f, -64f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
        horizontalLineToRelative(8f)
        verticalLineToRelative(-8f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 0f)
        verticalLineToRelative(8f)
        horizontalLineToRelative(8f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 128f)
        curveToRelative(-21.78f, 0f, -42f, -13f, -52.59f, -32.51f)
        close()
      }
    }.build()

    return _IceCreamOutline!!
  }

@Suppress("ObjectPropertyName")
private var _IceCreamOutline: ImageVector? = null
