package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Chatbubble: ImageVector
  get() {
    if (_ChatbubbleOutline != null) {
      return _ChatbubbleOutline!!
    }
    _ChatbubbleOutline = ImageVector.Builder(
      name = "Outline.ChatbubbleOutline",
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
        moveTo(87.49f, 380f)
        curveToRelative(1.19f, -4.38f, -1.44f, -10.47f, -3.95f, -14.86f)
        arcTo(44.86f, 44.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 81f, 361.34f)
        arcToRelative(
          199.81f,
          199.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -33f,
          -110f
        )
        curveTo(47.65f, 139.09f, 140.73f, 48f, 255.83f, 48f)
        curveTo(356.21f, 48f, 440f, 117.54f, 459.58f, 209.85f)
        arcTo(199f, 199f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 251.49f)
        curveToRelative(0f, 112.41f, -89.49f, 204.93f, -204.59f, 204.93f)
        curveToRelative(-18.3f, 0f, -43f, -4.6f, -56.47f, -8.37f)
        reflectiveCurveToRelative(-26.92f, -8.77f, -30.39f, -10.11f)
        arcToRelative(
          31.09f,
          31.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -11.12f,
          -2.07f
        )
        arcToRelative(
          30.71f,
          30.71f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -12.09f,
          2.43f
        )
        lineTo(81.51f, 462.78f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.84f, 464f)
        arcToRelative(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.57f, -9.74f)
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
    }.build()

    return _ChatbubbleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChatbubbleOutline: ImageVector? = null
