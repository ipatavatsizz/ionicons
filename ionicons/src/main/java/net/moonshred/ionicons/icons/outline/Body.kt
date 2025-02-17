package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Body: ImageVector
  get() {
    if (_BodyOutline != null) {
      return _BodyOutline!!
    }
    _BodyOutline = ImageVector.Builder(
      name = "Outline.BodyOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 56f)
        moveToRelative(-40f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(199.3f, 295.62f)
        horizontalLineToRelative(0f)
        lineToRelative(-30.4f, 172.2f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 27.8f)
        arcToRelative(
          23.76f,
          23.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          27.6f,
          -19.5f
        )
        lineToRelative(21f, -119.9f)
        verticalLineToRelative(0.2f)
        reflectiveCurveToRelative(5.2f, -32.5f, 17.5f, -32.5f)
        horizontalLineToRelative(3.1f)
        curveToRelative(12.5f, 0f, 17.5f, 32.5f, 17.5f, 32.5f)
        verticalLineToRelative(-0.1f)
        lineToRelative(21f, 119.9f)
        arcToRelative(
          23.92f,
          23.92f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          47.1f,
          -8.4f
        )
        lineToRelative(-30.4f, -172.2f)
        lineToRelative(-4.9f, -29.7f)
        curveToRelative(-2.9f, -18.1f, -4.2f, -47.6f, 0.5f, -59.7f)
        curveToRelative(4f, -10.4f, 14.13f, -14.2f, 23.2f, -14.2f)
        horizontalLineTo(424f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -48f)
        horizontalLineTo(88f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 48f)
        horizontalLineToRelative(92.5f)
        curveToRelative(9.23f, 0f, 19.2f, 3.8f, 23.2f, 14.2f)
        curveToRelative(4.7f, 12.1f, 3.4f, 41.6f, 0.5f, 59.7f)
        close()
      }
    }.build()

    return _BodyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BodyOutline: ImageVector? = null
