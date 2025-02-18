package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Settings: ImageVector
  get() {
    if (_SettingsOutline != null) {
      return _SettingsOutline!!
    }
    _SettingsOutline = ImageVector.Builder(
      name = "Outline.SettingsOutline",
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
        moveTo(262.29f, 192.31f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 57.4f, 57.4f)
        arcTo(64.13f, 64.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 262.29f, 192.31f)
        close()
        moveTo(416.39f, 256f)
        arcToRelative(
          154.34f,
          154.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1.53f,
          20.79f
        )
        lineToRelative(45.21f, 35.46f)
        arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 462.52f, 326f)
        lineToRelative(-42.77f, 74f)
        arcToRelative(
          10.81f,
          10.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -13.14f,
          4.59f
        )
        lineToRelative(-44.9f, -18.08f)
        arcToRelative(
          16.11f,
          16.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -15.17f,
          1.75f
        )
        arcTo(164.48f, 164.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 325f, 400.8f)
        arcToRelative(
          15.94f,
          15.94f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -8.82f,
          12.14f
        )
        lineToRelative(-6.73f, 47.89f)
        arcTo(11.08f, 11.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 298.77f, 470f)
        horizontalLineTo(213.23f)
        arcToRelative(
          11.11f,
          11.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -10.69f,
          -8.87f
        )
        lineToRelative(-6.72f, -47.82f)
        arcToRelative(
          16.07f,
          16.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -9f,
          -12.22f
        )
        arcToRelative(
          155.3f,
          155.3f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -21.46f,
          -12.57f
        )
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.11f, -1.71f)
        lineToRelative(-44.89f, 18.07f)
        arcToRelative(
          10.81f,
          10.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -13.14f,
          -4.58f
        )
        lineToRelative(-42.77f, -74f)
        arcToRelative(
          10.8f,
          10.8f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.45f,
          -13.75f
        )
        lineToRelative(38.21f, -30f)
        arcToRelative(
          16.05f,
          16.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          6f,
          -14.08f
        )
        curveToRelative(-0.36f, -4.17f, -0.58f, -8.33f, -0.58f, -12.5f)
        reflectiveCurveToRelative(0.21f, -8.27f, 0.58f, -12.35f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.07f, -13.94f)
        lineToRelative(-38.19f, -30f)
        arcTo(10.81f, 10.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.48f, 186f)
        lineToRelative(42.77f, -74f)
        arcToRelative(
          10.81f,
          10.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          13.14f,
          -4.59f
        )
        lineToRelative(44.9f, 18.08f)
        arcToRelative(
          16.11f,
          16.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          15.17f,
          -1.75f
        )
        arcTo(164.48f, 164.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 187f, 111.2f)
        arcToRelative(
          15.94f,
          15.94f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          8.82f,
          -12.14f
        )
        lineToRelative(6.73f, -47.89f)
        arcTo(11.08f, 11.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.23f, 42f)
        horizontalLineToRelative(85.54f)
        arcToRelative(
          11.11f,
          11.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          10.69f,
          8.87f
        )
        lineToRelative(6.72f, 47.82f)
        arcToRelative(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12.22f)
        arcToRelative(
          155.3f,
          155.3f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          21.46f,
          12.57f
        )
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.11f, 1.71f)
        lineToRelative(44.89f, -18.07f)
        arcToRelative(
          10.81f,
          10.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          13.14f,
          4.58f
        )
        lineToRelative(42.77f, 74f)
        arcToRelative(
          10.8f,
          10.8f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.45f,
          13.75f
        )
        lineToRelative(-38.21f, 30f)
        arcToRelative(
          16.05f,
          16.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -6.05f,
          14.08f
        )
        curveTo(416.17f, 247.67f, 416.39f, 251.83f, 416.39f, 256f)
        close()
      }
    }.build()

    return _SettingsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SettingsOutline: ImageVector? = null
