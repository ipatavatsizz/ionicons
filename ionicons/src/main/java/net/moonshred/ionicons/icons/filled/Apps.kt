package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Apps: ImageVector
  get() {
    if (_Apps != null) {
      return _Apps!!
    }
    _Apps = ImageVector.Builder(
      name = "Filled.Apps",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(104f, 160f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 160f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 160f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 160f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 160f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 408f, 160f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(104f, 312f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 312f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 312f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 312f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 312f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 408f, 312f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(104f, 464f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 464f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 464f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 464f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 408f, 464f)
        close()
      }
    }.build()

    return _Apps!!
  }

@Suppress("ObjectPropertyName")
private var _Apps: ImageVector? = null
