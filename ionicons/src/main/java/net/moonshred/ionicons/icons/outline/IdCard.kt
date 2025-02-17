package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.IdCard: ImageVector
  get() {
    if (_IdCardOutline != null) {
      return _IdCardOutline!!
    }
    _IdCardOutline = ImageVector.Builder(
      name = "Outline.IdCardOutline",
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
        moveTo(144f, 32f)
        lineTo(368f, 32f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 80f)
        lineTo(416f, 432f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 480f)
        lineTo(144f, 480f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 432f)
        lineTo(96f, 80f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 32f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 80f)
        lineTo(304f, 80f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(333.48f, 284.51f)
        arcTo(39.65f, 39.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 272f)
        curveToRelative(-11.6f, 0f, -22.09f, 4.41f, -29.54f, 12.43f)
        reflectiveCurveToRelative(-11.2f, 19.12f, -10.34f, 31f)
        curveTo(265.83f, 338.91f, 283.72f, 358f, 304f, 358f)
        reflectiveCurveToRelative(38.14f, -19.09f, 39.87f, -42.55f)
        curveTo(344.75f, 303.67f, 341.05f, 292.68f, 333.48f, 284.51f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(371.69f, 448f)
        horizontalLineTo(236.31f)
        arcToRelative(
          12.05f,
          12.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.31f,
          -4.17f
        )
        arcToRelative(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.76f, -10.92f)
        curveToRelative(3.25f, -17.56f, 13.38f, -32.31f, 29.3f, -42.66f)
        curveTo(267.68f, 381.06f, 285.6f, 376f, 304f, 376f)
        reflectiveCurveToRelative(36.32f, 5.06f, 50.46f, 14.25f)
        curveToRelative(15.92f, 10.35f, 26.05f, 25.1f, 29.3f, 42.66f)
        arcTo(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 381f, 443.83f)
        arcTo(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 371.69f, 448f)
        close()
      }
    }.build()

    return _IdCardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _IdCardOutline: ImageVector? = null
