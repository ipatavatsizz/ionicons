package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Transgender: ImageVector
  get() {
    if (_TransgenderSharp != null) {
      return _TransgenderSharp!!
    }
    _TransgenderSharp = ImageVector.Builder(
      name = "Sharp.TransgenderSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 448.94f)
        lineToRelative(-48.94f, -49.08f)
        lineTo(464f, 366.92f)
        lineToRelative(-31.1f, -31.11f)
        lineTo(400f, 368.71f)
        lineTo(376.45f, 345.1f)
        arcToRelative(
          149.64f,
          149.64f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.1f,
          -178.45f
        )
        lineToRelative(59.55f, -59.56f)
        lineTo(435.9f, 144f)
        horizontalLineToRelative(44f)
        lineTo(479.9f, 32f)
        horizontalLineToRelative(-112f)
        lineTo(367.9f, 76f)
        horizontalLineToRelative(36.87f)
        lineToRelative(-59.55f, 59.55f)
        arcToRelative(
          149.65f,
          149.65f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -178.59f,
          0f
        )
        lineTo(159.08f, 128f)
        lineToRelative(33f, -33f)
        lineTo(161f, 63.88f)
        lineToRelative(-33f, 33f)
        lineTo(107.09f, 76f)
        lineTo(144f, 76f)
        lineTo(144f, 32f)
        lineTo(32f, 32f)
        lineTo(32f, 144f)
        lineTo(76f, 144f)
        lineTo(76f, 107.09f)
        lineTo(96.87f, 128f)
        lineToRelative(-33f, 33f)
        lineTo(95f, 192.05f)
        lineToRelative(33f, -33f)
        lineToRelative(7.56f, 7.57f)
        arcTo(149.18f, 149.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 106f, 255.94f)
        curveToRelative(0f, 82.69f, 67.27f, 150f, 150f, 150f)
        arcToRelative(
          149.12f,
          149.12f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          89.44f,
          -29.67f
        )
        lineToRelative(23.51f, 23.58f)
        lineTo(335.81f, 432.9f)
        lineTo(366.92f, 464f)
        lineToRelative(33f, -33f)
        lineToRelative(48.9f, 49f)
        close()
        moveTo(150f, 255.94f)
        arcToRelative(106f, 106f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106f, 106f)
        arcTo(106.09f, 106.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 150f, 255.94f)
        close()
      }
    }.build()

    return _TransgenderSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TransgenderSharp: ImageVector? = null
