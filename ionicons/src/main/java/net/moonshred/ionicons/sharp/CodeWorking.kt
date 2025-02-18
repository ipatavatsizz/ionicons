package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.CodeWorking: ImageVector
  get() {
    if (_CodeWorkingSharp != null) {
      return _CodeWorkingSharp!!
    }
    _CodeWorkingSharp = ImageVector.Builder(
      name = "Sharp.CodeWorkingSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 10f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(256f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 10f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(346f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 10f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(166f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(160f, 368f)
        lineToRelative(-128f, -112f)
        lineToRelative(128f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(352f, 368f)
        lineToRelative(128f, -112f)
        lineToRelative(-128f, -112f)
      }
    }.build()

    return _CodeWorkingSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CodeWorkingSharp: ImageVector? = null
