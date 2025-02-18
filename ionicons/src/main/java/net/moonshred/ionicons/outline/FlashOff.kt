package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.FlashOff: ImageVector
  get() {
    if (_FlashOffOutline != null) {
      return _FlashOffOutline!!
    }
    _FlashOffOutline = ImageVector.Builder(
      name = "Outline.FlashOffOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 448f)
        arcToRelative(
          15.92f,
          15.92f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -11.31f,
          -4.69f
        )
        lineToRelative(-352f, -352f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91.31f, 68.69f)
        lineToRelative(352f, 352f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 448f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(294.34f, 84.28f)
        lineTo(272.26f, 205.12f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.17f, 15.71f)
        arcToRelative(
          16.49f,
          16.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          9.93f,
          3.17f
        )
        horizontalLineToRelative(94.12f)
        lineToRelative(-38.37f, 47.42f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.28f, 5.34f)
        lineToRelative(17.07f, 17.07f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, -0.31f)
        lineToRelative(60.8f, -75.16f)
        arcTo(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 431.5f, 204f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 416f, 192f)
        horizontalLineTo(307.19f)
        lineTo(335.4f, 37.63f)
        curveToRelative(0.05f, -0.3f, 0.1f, -0.59f, 0.13f, -0.89f)
        arcTo(18.45f, 18.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 302.73f, 23f)
        lineTo(210.15f, 137.46f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.28f, 5.35f)
        lineToRelative(17.07f, 17.06f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, -0.31f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(217.78f, 427.57f)
        lineToRelative(22f, -120.71f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.19f, -15.7f)
        arcToRelative(
          16.54f,
          16.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -9.92f,
          -3.16f
        )
        horizontalLineToRelative(-94.1f)
        lineToRelative(38.36f, -47.42f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -5.34f)
        lineToRelative(-17.07f, -17.07f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.93f, 0.31f)
        lineTo(83.8f, 293.64f)
        arcTo(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.5f, 308f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 320f)
        horizontalLineTo(204.83f)
        lineTo(176.74f, 474.36f)
        lineToRelative(0f, 0.11f)
        arcTo(18.37f, 18.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 209.24f, 489f)
        lineToRelative(92.61f, -114.46f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.28f, -5.35f)
        lineTo(284.5f, 352.13f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.94f, 0.31f)
        close()
      }
    }.build()

    return _FlashOffOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FlashOffOutline: ImageVector? = null
