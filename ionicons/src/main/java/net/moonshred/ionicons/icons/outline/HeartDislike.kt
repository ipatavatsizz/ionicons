package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.HeartDislike: ImageVector
  get() {
    if (_HeartDislikeOutline != null) {
      return _HeartDislikeOutline!!
    }
    _HeartDislikeOutline = ImageVector.Builder(
      name = "Outline.HeartDislikeOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(417.84f, 448f)
        arcToRelative(
          15.94f,
          15.94f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -11.35f,
          -4.72f
        )
        lineTo(40.65f, 75.26f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.35f, 52.7f)
        lineToRelative(365.83f, 368f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 417.84f, 448f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(364.92f, 80f)
        curveToRelative(-48.09f, 0f, -80f, 29.55f, -96.92f, 51f)
        curveToRelative(-16.88f, -21.48f, -48.83f, -51f, -96.92f, -51f)
        arcToRelative(
          107.37f,
          107.37f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -31f,
          4.55f
        )
        lineTo(168f, 112f)
        curveToRelative(22.26f, 0f, 45.81f, 9f, 63.94f, 26.67f)
        arcToRelative(123f, 123f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.75f, 28.47f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.6f, 0f)
        arcToRelative(123f, 123f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.77f, -28.51f)
        curveTo(322.19f, 121f, 342.66f, 112f, 364.92f, 112f)
        curveToRelative(43.15f, 0f, 78.62f, 36.33f, 79.07f, 81f)
        curveToRelative(0.54f, 53.69f, -22.75f, 99.55f, -57.38f, 139.52f)
        lineToRelative(22.63f, 22.77f)
        curveToRelative(3f, -3.44f, 5.7f, -6.64f, 8.14f, -9.6f)
        curveToRelative(40f, -48.75f, 59.15f, -98.8f, 58.61f, -153f)
        curveTo(475.37f, 130.52f, 425.54f, 80f, 364.92f, 80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(268f, 432f)
        curveTo(180.38f, 372.51f, 91f, 297.6f, 92f, 193f)
        arcToRelative(
          83.69f,
          83.69f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.24f,
          -18.39f
        )
        lineTo(69f, 149.14f)
        arcToRelative(
          115.1f,
          115.1f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -9f,
          43.49f
        )
        curveToRelative(-0.54f, 54.22f, 18.63f, 104.27f, 58.61f, 153f)
        curveToRelative(18.77f, 22.87f, 52.8f, 59.45f, 131.39f, 112.8f)
        arcToRelative(31.84f, 31.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 0f)
        curveToRelative(20.35f, -13.81f, 37.7f, -26.5f, 52.58f, -38.11f)
        lineToRelative(-22.66f, -22.81f)
        curveTo(300.25f, 409.6f, 284.09f, 421.05f, 268f, 432f)
        close()
      }
    }.build()

    return _HeartDislikeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HeartDislikeOutline: ImageVector? = null
