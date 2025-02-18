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

val Ionicons.Outline.Library: ImageVector
  get() {
    if (_LibraryOutline != null) {
      return _LibraryOutline!!
    }
    _LibraryOutline = ImageVector.Builder(
      name = "Outline.LibraryOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 96f)
        lineTo(80f, 96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 112f)
        lineTo(96f, 448f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 464f)
        lineTo(48f, 464f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 448f)
        lineTo(32f, 112f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 96f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 224f)
        lineTo(240f, 224f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 400f)
        lineTo(240f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 160f)
        lineTo(224f, 160f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 176f)
        lineTo(240f, 448f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 464f)
        lineTo(128f, 464f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 448f)
        lineTo(112f, 176f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 160f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(272f, 48f)
        lineTo(336f, 48f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 64f)
        lineTo(352f, 448f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 464f)
        lineTo(272f, 464f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 448f)
        lineTo(256f, 64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 272f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(422.46f, 96.11f)
        lineToRelative(-40.4f, 4.25f)
        curveToRelative(-11.12f, 1.17f, -19.18f, 11.57f, -17.93f, 23.1f)
        lineToRelative(34.92f, 321.59f)
        curveToRelative(1.26f, 11.53f, 11.37f, 20f, 22.49f, 18.84f)
        lineToRelative(40.4f, -4.25f)
        curveToRelative(11.12f, -1.17f, 19.18f, -11.57f, 17.93f, -23.1f)
        lineTo(445f, 115f)
        curveTo(443.69f, 103.42f, 433.58f, 94.94f, 422.46f, 96.11f)
        close()
      }
    }.build()

    return _LibraryOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LibraryOutline: ImageVector? = null
