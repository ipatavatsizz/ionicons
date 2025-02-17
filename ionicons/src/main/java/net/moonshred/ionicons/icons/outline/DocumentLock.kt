package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.DocumentLock: ImageVector
  get() {
    if (_DocumentLockOutline != null) {
      return _DocumentLockOutline!!
    }
    _DocumentLockOutline = ImageVector.Builder(
      name = "Outline.DocumentLockOutline",
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
        moveTo(288f, 304f)
        verticalLineTo(286f)
        curveToRelative(0f, -16.63f, -14.26f, -30f, -32f, -30f)
        reflectiveCurveToRelative(-32f, 13.37f, -32f, 30f)
        verticalLineToRelative(18f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(304f, 416f)
        horizontalLineTo(208f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
        verticalLineTo(336f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
        horizontalLineToRelative(96f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        verticalLineToRelative(48f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304f, 416f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 221.25f)
        verticalLineTo(416f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
        horizontalLineTo(144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(96f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
        horizontalLineToRelative(98.75f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.62f, 9.37f)
        lineTo(406.63f, 198.63f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 221.25f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 50.88f)
        verticalLineTo(176f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(413.12f)
      }
    }.build()

    return _DocumentLockOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DocumentLockOutline: ImageVector? = null
