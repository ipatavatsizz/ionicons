package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Walk: ImageVector
  get() {
    if (_WalkSharp != null) {
      return _WalkSharp!!
    }
    _WalkSharp = ImageVector.Builder(
      name = "Sharp.WalkSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(315.09f, 481.38f)
        lineTo(258.14f, 366.26f)
        lineToRelative(-45f, -57.56f)
        arcToRelative(
          73.11f,
          73.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -10.16f,
          -37.17f
        )
        verticalLineTo(142f)
        horizontalLineToRelative(15.73f)
        arcTo(40.36f, 40.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 259f, 182.32f)
        verticalLineTo(344.84f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128.18f, 291.5f)
        lineToRelative(0f, -74.77f)
        lineToRelative(64.95f, -65.1f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376.35f, 295.73f)
        lineToRelative(-83.95f, -56.38f)
        lineToRelative(0f, -44.68f)
        lineToRelative(104.68f, 72.95f)
        lineToRelative(-20.73f, 28.11f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(175.13f, 498.58f)
        lineToRelative(-21.43f, -26.91f)
        lineToRelative(80.33f, -81.54f)
        lineToRelative(15.53f, 32.07f)
        lineToRelative(-74.43f, 76.38f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 16f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(259.02f, 67.21f)
        moveToRelative(-37.38f, 0f)
        arcToRelative(37.38f, 37.38f, 0f, isMoreThanHalf = true, isPositiveArc = true, 74.76f, 0f)
        arcToRelative(37.38f, 37.38f, 0f, isMoreThanHalf = true, isPositiveArc = true, -74.76f, 0f)
      }
    }.build()

    return _WalkSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WalkSharp: ImageVector? = null
