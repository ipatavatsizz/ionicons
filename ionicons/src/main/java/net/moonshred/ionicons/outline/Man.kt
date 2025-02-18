package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Man: ImageVector
  get() {
    if (_ManOutline != null) {
      return _ManOutline!!
    }
    _ManOutline = ImageVector.Builder(
      name = "Outline.ManOutline",
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
        moveTo(208f, 208f)
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
        moveTo(256f, 336f)
        verticalLineTo(472f)
        arcToRelative(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(0f)
        arcToRelative(23.73f, 23.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(208f, 192f)
        verticalLineToRelative(88f)
        arcToRelative(23.72f, 23.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        horizontalLineToRelative(0f)
        arcToRelative(23.72f, 23.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(192f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
        horizontalLineToRelative(96f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineToRelative(88f)
        arcToRelative(23.72f, 23.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        horizontalLineToRelative(0f)
        arcToRelative(23.72f, 23.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(192f)
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
    }.build()

    return _ManOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ManOutline: ImageVector? = null
