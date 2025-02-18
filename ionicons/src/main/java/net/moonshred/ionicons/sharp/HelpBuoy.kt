package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HelpBuoy: ImageVector
  get() {
    if (_HelpBuoySharp != null) {
      return _HelpBuoySharp!!
    }
    _HelpBuoySharp = ImageVector.Builder(
      name = "Sharp.HelpBuoySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(132.29f, 32f, 32f, 132.29f, 32f, 256f)
        reflectiveCurveTo(132.29f, 480f, 256f, 480f)
        reflectiveCurveTo(480f, 379.71f, 480f, 256f)
        reflectiveCurveTo(379.71f, 32f, 256f, 32f)
        close()
        moveTo(192f, 256f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 64f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 256f)
        close()
        moveTo(429.24f, 193.71f)
        lineTo(342.91f, 199f)
        arcToRelative(
          104.86f,
          104.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -29.86f,
          -29.86f
        )
        lineToRelative(5.24f, -86.33f)
        arcToRelative(185f, 185f, 0f, isMoreThanHalf = false, isPositiveArc = true, 111f, 111f)
        close()
        moveTo(125.89f, 125.89f)
        arcToRelative(
          183.44f,
          183.44f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          67.82f,
          -43.13f
        )
        lineTo(199f, 169.09f)
        arcTo(104.86f, 104.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 169.09f, 199f)
        lineToRelative(-86.33f, -5.24f)
        arcTo(183.44f, 183.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 125.89f, 125.89f)
        close()
        moveTo(82.76f, 318.29f)
        lineToRelative(86.33f, -5.24f)
        arcTo(104.86f, 104.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 199f, 342.91f)
        lineToRelative(-5.24f, 86.33f)
        arcTo(185f, 185f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.76f, 318.29f)
        close()
        moveTo(386.11f, 386.11f)
        arcToRelative(
          183.44f,
          183.44f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -67.82f,
          43.13f
        )
        lineToRelative(-5.24f, -86.33f)
        arcToRelative(
          104.86f,
          104.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          29.86f,
          -29.86f
        )
        lineToRelative(86.33f, 5.24f)
        arcTo(183.44f, 183.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 386.11f, 386.11f)
        close()
      }
    }.build()

    return _HelpBuoySharp!!
  }

@Suppress("ObjectPropertyName")
private var _HelpBuoySharp: ImageVector? = null
