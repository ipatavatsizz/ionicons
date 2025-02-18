package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.CodeWorking: ImageVector
  get() {
    if (_CodeWorking != null) {
      return _CodeWorking!!
    }
    _CodeWorking = ImageVector.Builder(
      name = "Filled.CodeWorking",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 10f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 10f
      ) {
        moveTo(346f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 10f
      ) {
        moveTo(166f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 368f)
        lineToRelative(-128f, -112f)
        lineToRelative(128f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 368f)
        lineToRelative(128f, -112f)
        lineToRelative(-128f, -112f)
      }
    }.build()

    return _CodeWorking!!
  }

@Suppress("ObjectPropertyName")
private var _CodeWorking: ImageVector? = null
