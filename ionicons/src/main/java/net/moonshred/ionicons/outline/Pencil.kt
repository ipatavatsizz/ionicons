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

val Ionicons.Outline.Pencil: ImageVector
  get() {
    if (_PencilOutline != null) {
      return _PencilOutline!!
    }
    _PencilOutline = ImageVector.Builder(
      name = "Outline.PencilOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(364.13f, 125.25f)
        lineToRelative(-277.13f, 277.75f)
        lineToRelative(-23f, 45f)
        lineToRelative(44.99f, -23f)
        lineToRelative(277.76f, -277.13f)
        lineToRelative(-22.62f, -22.62f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(420.69f, 68.69f)
        lineTo(398.07f, 91.31f)
        lineToRelative(22.62f, 22.63f)
        lineToRelative(22.62f, -22.63f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.62f)
        horizontalLineToRelative(0f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 420.69f, 68.69f)
        close()
      }
    }.build()

    return _PencilOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PencilOutline: ImageVector? = null
