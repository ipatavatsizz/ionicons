package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Construct: ImageVector
  get() {
    if (_ConstructOutline != null) {
      return _ConstructOutline!!
    }
    _ConstructOutline = ImageVector.Builder(
      name = "Outline.ConstructOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(436.67f, 184.11f)
        arcToRelative(27.17f, 27.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -38.3f, 0f)
        lineToRelative(-22.48f, -22.49f)
        arcToRelative(27.15f, 27.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -38.29f)
        lineToRelative(50.89f, -50.89f)
        arcToRelative(
          0.85f,
          0.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.26f,
          -1.38f
        )
        curveTo(393.68f, 57f, 351.09f, 64.15f, 324.05f, 91f)
        curveToRelative(-25.88f, 25.69f, -27.35f, 64.27f, -17.87f, 98f)
        arcToRelative(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.67f, 27.14f)
        lineToRelative(-173f, 160.76f)
        arcToRelative(
          40.76f,
          40.76f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          57.57f,
          57.54f
        )
        lineToRelative(162.15f, -173.3f)
        arcTo(27f, 27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 372f, 253.44f)
        curveToRelative(33.46f, 8.94f, 71.49f, 7.26f, 97.07f, -17.94f)
        curveToRelative(27.49f, -27.08f, 33.42f, -74.94f, 20.1f, -102.33f)
        arcToRelative(
          0.85f,
          0.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -1.36f,
          -0.22f
        )
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(224f, 284f)
        curveToRelative(-17.48f, -17f, -25.49f, -24.91f, -31f, -30.29f)
        arcToRelative(
          18.24f,
          18.24f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -3.33f,
          -21.35f
        )
        arcToRelative(
          20.76f,
          20.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          3.5f,
          -4.62f
        )
        lineToRelative(15.68f, -15.29f)
        arcToRelative(
          18.66f,
          18.66f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          5.63f,
          -3.87f
        )
        arcToRelative(18.11f, 18.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 3.62f)
        curveToRelative(5.45f, 5.29f, 15.43f, 15f, 33.41f, 32.52f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(317.07f, 291.3f)
        curveToRelative(40.95f, 38.1f, 90.62f, 83.27f, 110f, 99.41f)
        arcToRelative(
          13.46f,
          13.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0.94f,
          19.92f
        )
        lineTo(394.63f, 444f)
        arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.29f, -0.76f)
        curveToRelative(-16.53f, -19.18f, -61.09f, -67.11f, -99.27f, -107f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(17.34f, 193.5f)
        lineToRelative(29.41f, -28.74f)
        arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, -1.35f)
        arcToRelative(4.85f, 4.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, 1.35f)
        horizontalLineToRelative(0f)
        arcToRelative(9.86f, 9.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.19f, 2.77f)
        curveToRelative(3.83f, -0.42f, 7.92f, -1.6f, 10.57f, -4.12f)
        curveToRelative(6f, -5.8f, -0.94f, -17.23f, 4.34f, -24.54f)
        arcToRelative(207f, 207f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.78f, -22.6f)
        curveToRelative(6f, -5.88f, 29.84f, -28.32f, 69.9f, -44.45f)
        arcTo(107.31f, 107.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 206.67f, 64f)
        curveToRelative(22.59f, 0f, 40f, 10f, 46.26f, 15.67f)
        arcToRelative(
          89.54f,
          89.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          10.28f,
          11.64f
        )
        arcTo(78.92f, 78.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 254f, 88.54f)
        arcTo(68.82f, 68.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 234f, 87.28f)
        curveToRelative(-13.33f, 1.09f, -29.41f, 7.26f, -38f, 14f)
        curveToRelative(-13.9f, 11f, -19.87f, 25.72f, -20.81f, 44.71f)
        curveToRelative(-0.68f, 14.12f, 2.72f, 22.1f, 36.1f, 55.49f)
        arcToRelative(6.6f, 6.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.34f, 9.16f)
        lineToRelative(-18.22f, 18f)
        arcToRelative(6.88f, 6.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.54f, 0.09f)
        curveToRelative(-21.94f, -21.94f, -36.65f, -33.09f, -45f, -38.16f)
        reflectiveCurveToRelative(-15.07f, -6.5f, -18.3f, -6.85f)
        arcToRelative(
          30.85f,
          30.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -18.27f,
          3.87f
        )
        arcToRelative(11.39f, 11.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, 2f)
        arcToRelative(
          14.14f,
          14.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0.42f,
          20.08f
        )
        lineToRelative(1.71f, 1.6f)
        arcToRelative(4.63f, 4.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.64f)
        lineTo(71.73f, 246.6f)
        arcTo(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.32f, 248f)
        arcToRelative(
          4.86f,
          4.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -3.41f,
          -1.35f
        )
        lineTo(17.34f, 200.22f)
        arcTo(4.88f, 4.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.34f, 193.5f)
        close()
      }
    }.build()

    return _ConstructOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ConstructOutline: ImageVector? = null
