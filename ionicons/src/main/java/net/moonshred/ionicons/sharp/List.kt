package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.List: ImageVector
  get() {
    if (_ListSharp != null) {
      return _ListSharp!!
    }
    _ListSharp = ImageVector.Builder(
      name = "Sharp.ListSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 144f)
        lineTo(464f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 256f)
        lineTo(464f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 368f)
        lineTo(464f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 128f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-32f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 240f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-32f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 352f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-32f)
        close()
      }
    }.build()

    return _ListSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ListSharp: ImageVector? = null
