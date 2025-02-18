package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Woman: ImageVector
  get() {
    if (_WomanOutline != null) {
      return _WomanOutline!!
    }
    _WomanOutline = ImageVector.Builder(
      name = "Outline.WomanOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(208f, 368f)
        verticalLineTo(472f)
        arcToRelative(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(0f)
        arcToRelative(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 368f)
        verticalLineTo(472f)
        arcToRelative(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(0f)
        arcToRelative(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(183f, 274f)
        arcToRelative(
          23.73f,
          23.73f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -29.84f,
          16.18f
        )
        horizontalLineToRelative(0f)
        arcToRelative(
          23.72f,
          23.72f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -16.17f,
          -29.84f
        )
        lineToRelative(25f, -84.28f)
        arcTo(44.85f, 44.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 205f, 144f)
        horizontalLineTo(307f)
        arcToRelative(44.85f, 44.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43f, 32.08f)
        lineToRelative(25f, 84.28f)
        arcToRelative(
          23.72f,
          23.72f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -16.17f,
          29.84f
        )
        horizontalLineToRelative(0f)
        arcTo(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 329.05f, 274f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 56f)
        moveToRelative(-40f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 192f)
        lineToRelative(-48f, 160f)
        lineToRelative(192f, 0f)
        lineToRelative(-48f, -160f)
      }
    }.build()

    return _WomanOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WomanOutline: ImageVector? = null
