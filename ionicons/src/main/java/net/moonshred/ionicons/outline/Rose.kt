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

val Ionicons.Outline.Rose: ImageVector
  get() {
    if (_RoseOutline != null) {
      return _RoseOutline!!
    }
    _RoseOutline = ImageVector.Builder(
      name = "Outline.RoseOutline",
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
        moveTo(416f, 128f)
        curveToRelative(-18.9f, 4.25f, -36.8f, 8.94f, -53.7f, 13.95f)
        curveToRelative(-40.5f, 12f, -75.5f, 27.15f, -105.4f, 41.65f)
        curveToRelative(-19.3f, 9.37f, -26.2f, 13.51f, -51.5f, 28.23f)
        curveTo(147f, 245.52f, 112f, 289.23f, 112f, 354.64f)
        curveTo(112f, 428.55f, 167.6f, 480f, 256f, 480f)
        reflectiveCurveToRelative(144f, -55.81f, 144f, -129.72f)
        reflectiveCurveTo(339f, 225.24f, 416f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(264f, 180.19f)
        curveToRelative(-19.69f, -27f, -38.2f, -38.69f, -52.7f, -46.59f)
        curveTo(162.6f, 107.1f, 96f, 96f, 96f, 96f)
        curveToRelative(41.5f, 43.7f, 37.2f, 90.1f, 32f, 128f)
        curveToRelative(0f, 0f, -3.87f, 32.88f, 1.91f, 58.41f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(372f, 139.15f)
        curveTo(356.55f, 102.6f, 336f, 64f, 336f, 64f)
        reflectiveCurveToRelative(-63.32f, 0f, -135.69f, 64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(253.48f, 87.57f)
        curveTo(221.25f, 45.81f, 176f, 32f, 176f, 32f)
        curveToRelative(-15.3f, 20.8f, -28.79f, 51.58f, -34.87f, 74.17f)
      }
    }.build()

    return _RoseOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RoseOutline: ImageVector? = null
