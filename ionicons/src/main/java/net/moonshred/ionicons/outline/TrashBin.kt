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

val Ionicons.Outline.TrashBin: ImageVector
  get() {
    if (_TrashBinOutline != null) {
      return _TrashBinOutline!!
    }
    _TrashBinOutline = ImageVector.Builder(
      name = "Outline.TrashBinOutline",
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
        moveTo(432f, 144f)
        lineTo(403.33f, 419.74f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 371.55f, 448f)
        horizontalLineTo(140.46f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -31.78f, -28.26f)
        lineTo(80f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 64f)
        lineTo(464f, 64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 80f)
        lineTo(480f, 128f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 144f)
        lineTo(48f, 144f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 128f)
        lineTo(32f, 80f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(312f, 240f)
        lineTo(200f, 352f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(312f, 352f)
        lineTo(200f, 240f)
      }
    }.build()

    return _TrashBinOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TrashBinOutline: ImageVector? = null
