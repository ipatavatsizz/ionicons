package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Build: ImageVector
  get() {
    if (_BuildOutline != null) {
      return _BuildOutline!!
    }
    _BuildOutline = ImageVector.Builder(
      name = "Outline.BuildOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(393.87f, 190f)
        arcToRelative(32.1f, 32.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.25f, 0f)
        lineToRelative(-26.57f, -26.57f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -45.26f)
        lineTo(382.19f, 58f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -1.64f)
        curveToRelative(-38.82f, -16.64f, -89.15f, -8.16f, -121.11f, 23.57f)
        curveToRelative(-30.58f, 30.35f, -32.32f, 76f, -21.12f, 115.84f)
        arcToRelative(
          31.93f,
          31.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.06f,
          32.08f
        )
        lineTo(64f, 380f)
        arcToRelative(48.17f, 48.17f, 0f, isMoreThanHalf = true, isPositiveArc = false, 68f, 68f)
        lineTo(285.86f, 281f)
        arcToRelative(
          31.93f,
          31.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          31.6f,
          -9.13f
        )
        curveTo(357f, 282.46f, 402f, 280.47f, 432.18f, 250.68f)
        curveToRelative(32.49f, -32f, 39.5f, -88.56f, 23.75f, -120.93f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -0.26f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 416f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
    }.build()

    return _BuildOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BuildOutline: ImageVector? = null
