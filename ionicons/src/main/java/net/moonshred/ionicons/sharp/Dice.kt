package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Dice: ImageVector
  get() {
    if (_DiceSharp != null) {
      return _DiceSharp!!
    }
    _DiceSharp = ImageVector.Builder(
      name = "Sharp.DiceSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 366.92f)
        lineTo(240f, 480f)
        verticalLineTo(284f)
        lineTo(48f, 170f)
        close()
        moveTo(192f, 288f)
        curveToRelative(8.84f, 0f, 16f, 10.75f, 16f, 24f)
        reflectiveCurveToRelative(-7.16f, 24f, -16f, 24f)
        reflectiveCurveToRelative(-16f, -10.75f, -16f, -24f)
        reflectiveCurveTo(183.16f, 288f, 192f, 288f)
        close()
        moveTo(96f, 320f)
        curveToRelative(8.84f, 0f, 16f, 10.75f, 16f, 24f)
        reflectiveCurveToRelative(-7.16f, 24f, -16f, 24f)
        reflectiveCurveToRelative(-16f, -10.75f, -16f, -24f)
        reflectiveCurveTo(87.16f, 320f, 96f, 320f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 284f)
        lineTo(272f, 480f)
        lineTo(464f, 366.92f)
        lineTo(464f, 170f)
        close()
        moveTo(320f, 424f)
        curveToRelative(-8.84f, 0f, -16f, -10.75f, -16f, -24f)
        reflectiveCurveToRelative(7.16f, -24f, 16f, -24f)
        reflectiveCurveToRelative(16f, 10.75f, 16f, 24f)
        reflectiveCurveTo(328.84f, 424f, 320f, 424f)
        close()
        moveTo(320f, 336f)
        curveToRelative(-8.84f, 0f, -16f, -10.75f, -16f, -24f)
        reflectiveCurveToRelative(7.16f, -24f, 16f, -24f)
        reflectiveCurveToRelative(16f, 10.75f, 16f, 24f)
        reflectiveCurveTo(328.84f, 336f, 320f, 336f)
        close()
        moveTo(416f, 368f)
        curveToRelative(-8.84f, 0f, -16f, -10.75f, -16f, -24f)
        reflectiveCurveToRelative(7.16f, -24f, 16f, -24f)
        reflectiveCurveToRelative(16f, 10.75f, 16f, 24f)
        reflectiveCurveTo(424.84f, 368f, 416f, 368f)
        close()
        moveTo(416f, 280f)
        curveToRelative(-8.84f, 0f, -16f, -10.75f, -16f, -24f)
        reflectiveCurveToRelative(7.16f, -24f, 16f, -24f)
        reflectiveCurveToRelative(16f, 10.75f, 16f, 24f)
        reflectiveCurveTo(424.84f, 280f, 416f, 280f)
        close()
        moveTo(448f, 357.64f)
        horizontalLineToRelative(0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        lineTo(64f, 144f)
        lineTo(256f, 256f)
        lineTo(448f, 144f)
        close()
        moveTo(256f, 152f)
        curveToRelative(-13.25f, 0f, -24f, -7.16f, -24f, -16f)
        reflectiveCurveToRelative(10.75f, -16f, 24f, -16f)
        reflectiveCurveToRelative(24f, 7.16f, 24f, 16f)
        reflectiveCurveTo(269.25f, 152f, 256f, 152f)
        close()
      }
    }.build()

    return _DiceSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DiceSharp: ImageVector? = null
