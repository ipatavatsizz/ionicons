package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ExtensionPuzzle: ImageVector
  get() {
    if (_ExtensionPuzzleOutline != null) {
      return _ExtensionPuzzleOutline!!
    }
    _ExtensionPuzzleOutline = ImageVector.Builder(
      name = "Outline.ExtensionPuzzleOutline",
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
        moveTo(413.66f, 246.1f)
        horizontalLineTo(386f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
        verticalLineTo(166.86f)
        arcTo(38.86f, 38.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 345.14f, 128f)
        horizontalLineTo(267.9f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
        verticalLineTo(98.34f)
        curveToRelative(0f, -27.14f, -21.5f, -49.86f, -48.64f, -50.33f)
        arcToRelative(
          49.53f,
          49.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -50.4f,
          49.51f
        )
        verticalLineTo(126f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
        horizontalLineTo(87.62f)
        arcTo(39.74f, 39.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 167.62f)
        verticalLineTo(238f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
        horizontalLineTo(76.91f)
        curveToRelative(29.37f, 0f, 53.68f, 25.48f, 54.09f, 54.85f)
        curveToRelative(0.42f, 29.87f, -23.51f, 57.15f, -53.29f, 57.15f)
        horizontalLineTo(50f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
        verticalLineToRelative(70.38f)
        arcTo(39.74f, 39.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.62f, 464f)
        horizontalLineTo(158f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
        verticalLineTo(441.07f)
        curveToRelative(0f, -30.28f, 24.75f, -56.35f, 55f, -57.06f)
        curveToRelative(30.1f, -0.7f, 57f, 20.31f, 57f, 50.28f)
        verticalLineTo(462f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
        horizontalLineToRelative(71.14f)
        arcTo(38.86f, 38.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 384f, 425.14f)
        verticalLineToRelative(-78f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
        horizontalLineToRelative(28.48f)
        curveToRelative(27.63f, 0f, 49.52f, -22.67f, 49.52f, -50.4f)
        reflectiveCurveTo(440.8f, 246.1f, 413.66f, 246.1f)
        close()
      }
    }.build()

    return _ExtensionPuzzleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ExtensionPuzzleOutline: ImageVector? = null
