package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Football: ImageVector
  get() {
    if (_FootballSharp != null) {
      return _FootballSharp!!
    }
    _FootballSharp = ImageVector.Builder(
      name = "Sharp.FootballSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(396.64f, 344.08f)
        lineTo(349.87f, 344.08f)
        lineToRelative(-16.89f, -29f)
        lineToRelative(15f, -60.44f)
        lineTo(377.79f, 242f)
        lineToRelative(42.65f, 36.71f)
        arcTo(164.87f, 164.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 396.64f, 344.08f)
        close()
        moveTo(134.21f, 242f)
        lineTo(164f, 254.67f)
        lineToRelative(15f, 60.44f)
        lineToRelative(-16.89f, 29f)
        lineTo(115.36f, 344.11f)
        arcToRelative(
          164.87f,
          164.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -23.8f,
          -65.34f
        )
        close()
        moveTo(383.28f, 149.53f)
        lineTo(364.87f, 201.86f)
        lineTo(333.75f, 215.04f)
        lineTo(277f, 167.46f)
        verticalLineToRelative(-35f)
        lineToRelative(43.86f, -29.22f)
        arcTo(166.87f, 166.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 383.28f, 149.56f)
        close()
        moveTo(191.14f, 103.2f)
        lineTo(235f, 132.42f)
        verticalLineToRelative(35f)
        lineToRelative(-56.75f, 47.61f)
        lineToRelative(-31.12f, -13.18f)
        lineToRelative(-18.41f, -52.33f)
        arcTo(166.87f, 166.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 191.14f, 103.2f)
        close()
        moveTo(217.58f, 417.5f)
        lineTo(197.48f, 366.84f)
        lineTo(213.48f, 339.33f)
        horizontalLineToRelative(85f)
        lineToRelative(16.06f, 27.53f)
        lineToRelative(-20f, 50.6f)
        arcToRelative(166.23f, 166.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -77f, 0f)
        close()
      }
    }.build()

    return _FootballSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FootballSharp: ImageVector? = null
