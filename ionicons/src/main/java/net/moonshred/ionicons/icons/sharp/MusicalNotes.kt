package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.MusicalNotes: ImageVector
  get() {
    if (_MusicalNotesSharp != null) {
      return _MusicalNotesSharp!!
    }
    _MusicalNotesSharp = ImageVector.Builder(
      name = "Sharp.MusicalNotesSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(429.46f, 32.07f)
        curveToRelative(-23.6f, 6.53f, -205.55f, 58.81f, -250.54f, 71.43f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.92f, 3.83f)
        verticalLineToRelative(247f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, 1.89f)
        lineToRelative(-27.85f, 9.55f)
        curveToRelative(-19f, 7.44f, -66.82f, 16.68f, -66.82f, 59.19f)
        curveToRelative(0f, 35.54f, 24.63f, 51.54f, 45.86f, 54.28f)
        arcToRelative(
          52.06f,
          52.06f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          7.81f,
          0.8f
        )
        curveToRelative(7.37f, 0f, 36.38f, -7.08f, 53.3f, -18.08f)
        curveTo(208f, 448.25f, 208f, 448f, 208f, 412f)
        verticalLineTo(202f)
        curveToRelative(0f, -0.9f, 0.62f, -0.84f, 1.48f, -1.07f)
        lineToRelative(188f, -51.92f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.53f, 2f)
        verticalLineTo(306.55f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.36f, 1.89f)
        curveToRelative(-8.9f, 3f, -19.23f, 6.5f, -26.48f, 9.12f)
        curveTo(341.39f, 328.68f, 304f, 335.65f, 304f, 376f)
        curveToRelative(0f, 38.51f, 28.26f, 54.58f, 46.3f, 55.83f)
        arcToRelative(
          87.37f,
          87.37f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          21.33f,
          -1f
        )
        curveToRelative(9f, -1.38f, 24.09f, -5.9f, 38.14f, -14.86f)
        curveTo(432f, 401.79f, 432f, 401.51f, 432f, 360f)
        verticalLineTo(34f)
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 429.46f, 32.07f)
        close()
      }
    }.build()

    return _MusicalNotesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MusicalNotesSharp: ImageVector? = null
