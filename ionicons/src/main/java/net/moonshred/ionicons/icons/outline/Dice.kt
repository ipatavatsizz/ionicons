package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Dice: ImageVector
  get() {
    if (_DiceOutline != null) {
      return _DiceOutline!!
    }
    _DiceOutline = ImageVector.Builder(
      name = "Outline.DiceOutline",
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
        moveTo(448f, 341.37f)
        verticalLineTo(170.61f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432.11f, 143f)
        lineToRelative(-152f, -88.46f)
        arcToRelative(
          47.94f,
          47.94f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -48.24f,
          0f
        )
        lineTo(79.89f, 143f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 170.61f)
        verticalLineTo(341.37f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.89f, 369f)
        lineToRelative(152f, 88.46f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.24f, 0f)
        lineToRelative(152f, -88.46f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 448f, 341.37f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(69f, 153.99f)
        lineToRelative(187f, 110f)
        lineToRelative(187f, -110f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 463.99f)
        lineTo(256f, 263.99f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(232f, 152f)
        arcToRelative(24f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 0f)
        arcToRelative(24f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 296f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 328f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(288f, 296f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 240f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(288f, 384f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 328f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, 0f)
        arcToRelative(16f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, -32f, 0f)
        close()
      }
    }.build()

    return _DiceOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DiceOutline: ImageVector? = null
