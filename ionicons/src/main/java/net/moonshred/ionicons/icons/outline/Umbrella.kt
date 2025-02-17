package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Umbrella: ImageVector
  get() {
    if (_UmbrellaOutline != null) {
      return _UmbrellaOutline!!
    }
    _UmbrellaOutline = ImageVector.Builder(
      name = "Outline.UmbrellaOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 272f)
        verticalLineTo(432f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
        horizontalLineToRelative(0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(464f, 272f)
        curveToRelative(0f, -114.88f, -93.12f, -208f, -208f, -208f)
        reflectiveCurveTo(48f, 157.12f, 48f, 272f)
        horizontalLineToRelative(0f)
        arcToRelative(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 0f)
        horizontalLineToRelative(0f)
        arcToRelative(
          78.28f,
          78.28f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          102.31f,
          -7.27f
        )
        lineTo(256f, 272f)
        lineToRelative(9.69f, -7.27f)
        arcTo(78.28f, 78.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 272f)
        horizontalLineToRelative(0f)
        arcToRelative(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 0f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 64f)
        lineTo(256f, 48f)
      }
    }.build()

    return _UmbrellaOutline!!
  }

@Suppress("ObjectPropertyName")
private var _UmbrellaOutline: ImageVector? = null
