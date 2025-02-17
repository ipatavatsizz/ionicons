package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.HeartDislikeCircle: ImageVector
  get() {
    if (_HeartDislikeCircleOutline != null) {
      return _HeartDislikeCircleOutline!!
    }
    _HeartDislikeCircleOutline = ImageVector.Builder(
      name = "Outline.HeartDislikeCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(333.2f, 297.69f)
        curveToRelative(18.28f, -23.39f, 27.06f, -47.43f, 26.79f, -73.37f)
        curveToRelative(-0.31f, -31.06f, -25.22f, -56.33f, -55.53f, -56.33f)
        curveToRelative(-20.4f, 0f, -35f, 10.64f, -44.11f, 20.42f)
        arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.7f, 0f)
        curveToRelative(-9.11f, -9.78f, -23.71f, -20.42f, -44.11f, -20.42f)
        lineTo(206f, 168f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.75f, 6.84f)
        lineToRelative(124f, 123.21f)
        arcTo(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 333.2f, 297.69f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(158.84f, 221f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.82f, 2.72f)
        curveToRelative(0f, 0.21f, 0f, 0.43f, 0f, 0.64f)
        curveToRelative(-0.28f, 27.1f, 9.31f, 52.13f, 29.3f, 76.5f)
        curveToRelative(9.38f, 11.44f, 26.4f, 29.73f, 65.7f, 56.41f)
        arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
        curveToRelative(5.15f, -3.49f, 9.9f, -6.84f, 14.31f, -10f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, -6.07f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 368f)
        arcToRelative(
          15.92f,
          15.92f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -11.31f,
          -4.69f
        )
        lineToRelative(-176f, -176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, -22.62f)
        lineToRelative(176f, 176f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 368f)
        close()
      }
    }.build()

    return _HeartDislikeCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HeartDislikeCircleOutline: ImageVector? = null
