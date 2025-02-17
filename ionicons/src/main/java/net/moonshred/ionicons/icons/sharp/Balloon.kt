package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Balloon: ImageVector
  get() {
    if (_BalloonSharp != null) {
      return _BalloonSharp!!
    }
    _BalloonSharp = ImageVector.Builder(
      name = "Sharp.BalloonSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(391f, 307.27f)
        curveToRelative(32.75f, -46.35f, 46.59f, -101.63f, 39f, -155.68f)
        horizontalLineToRelative(0f)
        curveTo(416.47f, 55.59f, 327.38f, -11.54f, 231.38f, 2f)
        reflectiveCurveTo(68.24f, 104.53f, 81.73f, 200.53f)
        curveToRelative(7.57f, 53.89f, 36.12f, 103.16f, 80.37f, 138.74f)
        curveToRelative(26.91f, 21.64f, 57.59f, 36.1f, 86.05f, 41.33f)
        lineToRelative(-8.36f, 45.23f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9.38f)
        lineTo(279f, 431f)
        curveToRelative(15.9f, 35.87f, 41.65f, 60.48f, 78.41f, 75f)
        lineToRelative(14.88f, 5.88f)
        lineToRelative(11.77f, -29.75f)
        lineToRelative(-14.88f, -5.89f)
        curveToRelative(-26.35f, -10.42f, -44.48f, -26.16f, -57f, -49.92f)
        lineToRelative(21.84f, -3.07f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.05f, -11.49f)
        lineToRelative(-20.49f, -41.16f)
        curveTo(345.56f, 357.73f, 371.07f, 335.42f, 391f, 307.27f)
        close()
        moveTo(230.18f, 322.93f)
        curveToRelative(-41.26f, -16.32f, -76.3f, -52.7f, -91.45f, -94.94f)
        lineToRelative(-5.4f, -15.06f)
        lineToRelative(30.12f, -10.8f)
        lineToRelative(5.4f, 15.06f)
        curveToRelative(14.5f, 40.44f, 47.27f, 65.77f, 73.1f, 76f)
        lineToRelative(14.88f, 5.88f)
        lineToRelative(-11.77f, 29.76f)
        close()
      }
    }.build()

    return _BalloonSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BalloonSharp: ImageVector? = null
