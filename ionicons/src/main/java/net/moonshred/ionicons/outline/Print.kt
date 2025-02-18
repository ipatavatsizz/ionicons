package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Print: ImageVector
  get() {
    if (_PrintOutline != null) {
      return _PrintOutline!!
    }
    _PrintOutline = ImageVector.Builder(
      name = "Outline.PrintOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 368f)
        horizontalLineToRelative(24f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
        verticalLineTo(168f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
        horizontalLineTo(104f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 40f)
        verticalLineTo(328f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
        horizontalLineToRelative(24f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(152.32f, 240f)
        lineTo(359.68f, 240f)
        arcTo(24.32f, 24.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 264.32f)
        lineTo(384f, 423.68f)
        arcTo(24.32f, 24.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 359.68f, 448f)
        lineTo(152.32f, 448f)
        arcTo(24.32f, 24.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 423.68f)
        lineTo(128f, 264.32f)
        arcTo(24.32f, 24.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152.32f, 240f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 128f)
        verticalLineTo(104f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
        horizontalLineTo(168f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 40f)
        verticalLineToRelative(24f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(392f, 184f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
    }.build()

    return _PrintOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PrintOutline: ImageVector? = null
