package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Radio: ImageVector
  get() {
    if (_RadioSharp != null) {
      return _RadioSharp!!
    }
    _RadioSharp = ImageVector.Builder(
      name = "Sharp.RadioSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(220f, 256f)
        arcToRelative(36f, 35.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 0f)
        arcToRelative(36f, 35.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -72f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(188.4f, 350.8f)
        lineToRelative(-14.62f, -16.44f)
        arcToRelative(
          117.91f,
          117.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0f,
          -156.71f
        )
        lineToRelative(14.62f, -16.43f)
        lineToRelative(32.87f, 29.24f)
        lineToRelative(-14.62f, 16.43f)
        arcToRelative(73.93f, 73.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 98.25f)
        lineToRelative(14.62f, 16.44f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(323.6f, 350.8f)
        lineToRelative(-32.89f, -29.22f)
        lineToRelative(14.62f, -16.44f)
        arcToRelative(
          73.93f,
          73.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -98.25f
        )
        lineToRelative(-14.62f, -16.43f)
        lineToRelative(32.87f, -29.24f)
        lineToRelative(14.62f, 16.43f)
        arcToRelative(
          117.91f,
          117.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0f,
          156.71f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(138.24f, 401.76f)
        lineToRelative(-15f, -16.06f)
        arcToRelative(
          189.85f,
          189.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0f,
          -259.4f
        )
        lineToRelative(15f, -16.07f)
        lineToRelative(32.14f, 30.05f)
        lineToRelative(-15f, 16.06f)
        arcToRelative(
          145.88f,
          145.88f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          199.32f
        )
        lineToRelative(15f, 16.06f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(373.76f, 401.76f)
        lineToRelative(-32.14f, -30f)
        lineToRelative(15f, -16.06f)
        arcToRelative(
          145.88f,
          145.88f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -199.32f
        )
        lineToRelative(-15f, -16.06f)
        lineToRelative(32.14f, -30f)
        lineToRelative(15f, 16.07f)
        arcToRelative(
          189.85f,
          189.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0f,
          259.4f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(430.73f, 447f)
        lineToRelative(-32.79f, -29.33f)
        lineToRelative(14.66f, -16.39f)
        arcToRelative(
          218.2f,
          218.2f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -290.56f
        )
        lineTo(397.93f, 94.34f)
        lineTo(430.72f, 65f)
        lineToRelative(14.67f, 16.39f)
        arcToRelative(
          262.18f,
          262.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0f,
          349.22f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(81.27f, 447f)
        lineTo(66.6f, 430.61f)
        arcToRelative(
          262.18f,
          262.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0f,
          -349.22f
        )
        lineTo(81.28f, 65f)
        lineToRelative(32.79f, 29.34f)
        lineTo(99.39f, 110.72f)
        arcToRelative(
          218.2f,
          218.2f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          290.56f
        )
        lineToRelative(14.66f, 16.39f)
        close()
      }
    }.build()

    return _RadioSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RadioSharp: ImageVector? = null
