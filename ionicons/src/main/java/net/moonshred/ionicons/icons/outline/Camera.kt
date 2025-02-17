package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Camera: ImageVector
  get() {
    if (_CameraOutline != null) {
      return _CameraOutline!!
    }
    _CameraOutline = ImageVector.Builder(
      name = "Outline.CameraOutline",
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
        moveTo(350.54f, 148.68f)
        lineToRelative(-26.62f, -42.06f)
        curveTo(318.31f, 100.08f, 310.62f, 96f, 302f, 96f)
        horizontalLineTo(210f)
        curveToRelative(-8.62f, 0f, -16.31f, 4.08f, -21.92f, 10.62f)
        lineToRelative(-26.62f, 42.06f)
        curveTo(155.85f, 155.23f, 148.62f, 160f, 140f, 160f)
        horizontalLineTo(80f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        verticalLineTo(384f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(432f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        verticalLineTo(192f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
        horizontalLineTo(373f)
        curveTo(364.35f, 160f, 356.15f, 155.23f, 350.54f, 148.68f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 272f)
        moveToRelative(-80f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -160f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(124f, 158f)
        lineToRelative(0f, -22f)
        lineToRelative(-24f, 0f)
        lineToRelative(0f, 22f)
      }
    }.build()

    return _CameraOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CameraOutline: ImageVector? = null
