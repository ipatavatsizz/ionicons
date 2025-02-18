package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Male: ImageVector
  get() {
    if (_MaleSharp != null) {
      return _MaleSharp!!
    }
    _MaleSharp = ImageVector.Builder(
      name = "Sharp.MaleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(330f, 48f)
        verticalLineTo(92f)
        horizontalLineToRelative(58.89f)
        lineTo(328.5f, 152.39f)
        curveToRelative(-68.2f, -52.86f, -167f, -48f, -229.54f, 14.57f)
        horizontalLineToRelative(0f)
        curveTo(31.12f, 234.81f, 31.12f, 345.19f, 99f, 413f)
        arcTo(174.21f, 174.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 345f, 413f)
        curveToRelative(62.57f, -62.58f, 67.43f, -161.34f, 14.57f, -229.54f)
        lineTo(420f, 123.11f)
        verticalLineTo(182f)
        horizontalLineToRelative(44f)
        verticalLineTo(48f)
        close()
        moveTo(313.92f, 381.92f)
        arcToRelative(
          130.13f,
          130.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -183.84f,
          0f
        )
        curveToRelative(-50.69f, -50.68f, -50.69f, -133.16f, 0f, -183.84f)
        reflectiveCurveToRelative(133.16f, -50.69f, 183.84f, 0f)
        reflectiveCurveTo(364.61f, 331.24f, 313.92f, 381.92f)
        close()
      }
    }.build()

    return _MaleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MaleSharp: ImageVector? = null
