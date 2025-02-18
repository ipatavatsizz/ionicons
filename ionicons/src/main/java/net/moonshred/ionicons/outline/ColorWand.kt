package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ColorWand: ImageVector
  get() {
    if (_ColorWandOutline != null) {
      return _ColorWandOutline!!
    }
    _ColorWandOutline = ImageVector.Builder(
      name = "Outline.ColorWandOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(178.29f, 178.29f)
        lineTo(178.29f, 178.29f)
        arcTo(31.52f, 31.51f, 45f, isMoreThanHalf = false, isPositiveArc = true, 222.86f, 178.29f)
        lineTo(445.71f, 401.14f)
        arcTo(31.52f, 31.51f, 45f, isMoreThanHalf = false, isPositiveArc = true, 445.71f, 445.72f)
        lineTo(445.71f, 445.72f)
        arcTo(31.52f, 31.51f, 45f, isMoreThanHalf = false, isPositiveArc = true, 401.14f, 445.71f)
        lineTo(178.29f, 222.86f)
        arcTo(31.52f, 31.51f, 45f, isMoreThanHalf = false, isPositiveArc = true, 178.29f, 178.29f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(178.38f, 178.38f)
        horizontalLineToRelative(0f)
        arcToRelative(31.64f, 31.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 44.75f)
        lineTo(223.25f, 268f)
        lineTo(268f, 223.25f)
        lineToRelative(-44.87f, -44.87f)
        arcTo(31.64f, 31.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 178.38f, 178.38f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(48f, 192f)
        lineTo(96f, 192f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(90.18f, 90.18f)
        lineTo(124.12f, 124.12f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(192f, 48f)
        lineTo(192f, 96f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(293.82f, 90.18f)
        lineTo(259.88f, 124.12f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(124.12f, 259.88f)
        lineTo(90.18f, 293.82f)
      }
    }.build()

    return _ColorWandOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ColorWandOutline: ImageVector? = null
