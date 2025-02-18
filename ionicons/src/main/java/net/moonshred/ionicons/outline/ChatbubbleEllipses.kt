package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ChatbubbleEllipses: ImageVector
  get() {
    if (_ChatbubbleEllipsesOutline != null) {
      return _ChatbubbleEllipsesOutline!!
    }
    _ChatbubbleEllipsesOutline = ImageVector.Builder(
      name = "Outline.ChatbubbleEllipsesOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(87.48f, 380f)
        curveToRelative(1.2f, -4.38f, -1.43f, -10.47f, -3.94f, -14.86f)
        arcTo(42.63f, 42.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 81f, 361.34f)
        arcToRelative(
          199.81f,
          199.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -33f,
          -110f
        )
        curveTo(47.64f, 139.09f, 140.72f, 48f, 255.82f, 48f)
        curveTo(356.2f, 48f, 440f, 117.54f, 459.57f, 209.85f)
        arcTo(199f, 199f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 251.49f)
        curveToRelative(0f, 112.41f, -89.49f, 204.93f, -204.59f, 204.93f)
        curveToRelative(-18.31f, 0f, -43f, -4.6f, -56.47f, -8.37f)
        reflectiveCurveToRelative(-26.92f, -8.77f, -30.39f, -10.11f)
        arcToRelative(
          31.14f,
          31.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -11.13f,
          -2.07f
        )
        arcToRelative(
          30.7f,
          30.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -12.08f,
          2.43f
        )
        lineTo(81.5f, 462.78f)
        arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.84f, 464f)
        arcToRelative(
          9.61f,
          9.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.58f,
          -9.74f
        )
        arcToRelative(
          15.85f,
          15.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0.6f,
          -3.29f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 256f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 256f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _ChatbubbleEllipsesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChatbubbleEllipsesOutline: ImageVector? = null
