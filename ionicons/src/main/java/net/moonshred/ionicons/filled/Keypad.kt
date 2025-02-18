package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Keypad: ImageVector
  get() {
    if (_Keypad != null) {
      return _Keypad!!
    }
    _Keypad = ImageVector.Builder(
      name = "Filled.Keypad",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 400f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 272f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 16f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 272f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 16f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 272f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 16f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, 48f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        close()
      }
    }.build()

    return _Keypad!!
  }

@Suppress("ObjectPropertyName")
private var _Keypad: ImageVector? = null
