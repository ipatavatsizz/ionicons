package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Images: ImageVector
  get() {
    if (_ImagesOutline != null) {
      return _ImagesOutline!!
    }
    _ImagesOutline = ImageVector.Builder(
      name = "Outline.ImagesOutline",
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
        moveTo(432f, 112f)
        verticalLineTo(96f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        horizontalLineTo(64f)
        arcTo(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
        verticalLineTo(352f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineTo(80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(141.99f, 128f)
        lineTo(450.01f, 128f)
        arcTo(45.99f, 45.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 496f, 173.99f)
        lineTo(496f, 418.01f)
        arcTo(45.99f, 45.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 450.01f, 464f)
        lineTo(141.99f, 464f)
        arcTo(45.99f, 45.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 418.01f)
        lineTo(96f, 173.99f)
        arcTo(45.99f, 45.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.99f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(342.15f, 219.64f)
        arcToRelative(30.77f, 30.55f, 0f, isMoreThanHalf = true, isPositiveArc = false, 61.54f, 0f)
        arcToRelative(30.77f, 30.55f, 0f, isMoreThanHalf = true, isPositiveArc = false, -61.54f, 0f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(342.15f, 372.17f)
        lineTo(255f, 285.78f)
        arcToRelative(
          30.93f,
          30.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -42.18f,
          -1.21f
        )
        lineTo(96f, 387.64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(265.23f, 464f)
        lineTo(383.82f, 346.27f)
        arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.46f, -1.87f)
        lineTo(496f, 402.91f)
      }
    }.build()

    return _ImagesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ImagesOutline: ImageVector? = null
