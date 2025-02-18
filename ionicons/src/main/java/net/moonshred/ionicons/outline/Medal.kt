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

val Ionicons.Outline.Medal: ImageVector
  get() {
    if (_MedalOutline != null) {
      return _MedalOutline!!
    }
    _MedalOutline = ImageVector.Builder(
      name = "Outline.MedalOutline",
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
        moveTo(256f, 352f)
        moveToRelative(-112f, 0f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = true, isPositiveArc = true, 224f, 0f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = true, isPositiveArc = true, -224f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 352f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(147f, 323f)
        lineTo(41.84f, 159.32f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, -31.61f)
        lineToRelative(31f, -62f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 99.78f, 48f)
        horizontalLineTo(412.22f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.62f, 17.69f)
        lineToRelative(31f, 62f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, 31.61f)
        lineTo(365f, 323f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(371f, 144f)
        lineTo(37f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(428.74f, 52.6f)
        lineTo(305f, 250f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(140.55f, 144f)
        lineTo(207f, 250f)
      }
    }.build()

    return _MedalOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MedalOutline: ImageVector? = null
