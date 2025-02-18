package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Paw: ImageVector
  get() {
    if (_PawSharp != null) {
      return _PawSharp!!
    }
    _PawSharp = ImageVector.Builder(
      name = "Sharp.PawSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(442.8f, 361.82f)
        curveTo(434f, 336.72f, 413.49f, 324f, 393.69f, 311.7f)
        curveToRelative(-17.23f, -10.71f, -33.5f, -20.83f, -44.14f, -39f)
        curveTo(320.22f, 222.37f, 304.11f, 192f, 256.06f, 192f)
        reflectiveCurveToRelative(-64.21f, 30.38f, -93.61f, 80.69f)
        curveToRelative(-10.65f, 18.21f, -27f, 28.35f, -44.25f, 39.08f)
        curveToRelative(-19.8f, 12.31f, -40.27f, 25f, -49.1f, 50.05f)
        arcTo(78.06f, 78.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 390.11f)
        curveTo(64f, 430.85f, 96.45f, 464f, 132.4f, 464f)
        reflectiveCurveToRelative(83.31f, -18.13f, 123.76f, -18.13f)
        reflectiveCurveTo(343.31f, 464f, 379.71f, 464f)
        reflectiveCurveTo(448f, 430.85f, 448f, 390.11f)
        arcTo(78.3f, 78.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 442.8f, 361.82f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 216f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 120f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 120f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 216f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 112f, 0f)
        arcToRelative(56f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, -112f, 0f)
        close()
      }
    }.build()

    return _PawSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PawSharp: ImageVector? = null
