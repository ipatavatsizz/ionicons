package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Book: ImageVector
  get() {
    if (_BookOutline != null) {
      return _BookOutline!!
    }
    _BookOutline = ImageVector.Builder(
      name = "Outline.BookOutline",
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
        moveTo(256f, 160f)
        curveToRelative(16f, -63.16f, 76.43f, -95.41f, 208f, -96f)
        arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineTo(368f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        curveToRelative(-128f, 0f, -177.45f, 25.81f, -208f, 64f)
        curveToRelative(-30.37f, -38f, -80f, -64f, -208f, -64f)
        curveToRelative(-9.88f, 0f, -16f, -8.05f, -16f, -17.93f)
        verticalLineTo(80f)
        arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 64f)
        curveTo(179.57f, 64.59f, 240f, 96.84f, 256f, 160f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 160f)
        lineTo(256f, 448f)
      }
    }.build()

    return _BookOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BookOutline: ImageVector? = null
