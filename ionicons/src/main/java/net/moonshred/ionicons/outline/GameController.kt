package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.GameController: ImageVector
  get() {
    if (_GameControllerOutline != null) {
      return _GameControllerOutline!!
    }
    _GameControllerOutline = ImageVector.Builder(
      name = "Outline.GameControllerOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(467.51f, 248.83f)
        curveToRelative(-18.4f, -83.18f, -45.69f, -136.24f, -89.43f, -149.17f)
        arcTo(91.5f, 91.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 96f)
        curveToRelative(-26.89f, 0f, -48.11f, 16f, -96f, 16f)
        reflectiveCurveToRelative(-69.15f, -16f, -96f, -16f)
        arcToRelative(
          99.09f,
          99.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -27.2f,
          3.66f
        )
        curveTo(89f, 112.59f, 61.94f, 165.7f, 43.33f, 248.83f)
        curveToRelative(-19f, 84.91f, -15.56f, 152f, 21.58f, 164.88f)
        curveToRelative(26f, 9f, 49.25f, -9.61f, 71.27f, -37f)
        curveToRelative(25f, -31.2f, 55.79f, -40.8f, 119.82f, -40.8f)
        reflectiveCurveToRelative(93.62f, 9.6f, 118.66f, 40.8f)
        curveToRelative(22f, 27.41f, 46.11f, 45.79f, 71.42f, 37.16f)
        curveTo(487.1f, 399.86f, 486.52f, 334.74f, 467.51f, 248.83f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(292f, 224f)
        moveToRelative(-20f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 288f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -19.95f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 288f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 180f)
        moveToRelative(-20f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(380f, 224f)
        moveToRelative(-20f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 176f)
        lineTo(160f, 272f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 224f)
        lineTo(112f, 224f)
      }
    }.build()

    return _GameControllerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _GameControllerOutline: ImageVector? = null
