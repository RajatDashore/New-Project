package com.uoons.india.ui.order.order_tracker.model

import android.graphics.drawable.GradientDrawable
import android.os.Parcelable
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize
import kotlin.properties.Delegates.observable

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
class TimelineAttributes(
        var markerSize: Int,
        var markerColor: Int,
        var markerInCenter: Boolean,
        var markerLeftPadding: Int,
        var markerTopPadding: Int,
        var markerRightPadding: Int,
        var markerBottomPadding: Int,
        var linePadding: Int,
        var lineWidth: Int,
        var startLineColor: Int,
        var endLineColor: Int,
        var lineStyle: Int,
        var lineDashWidth: Int,
        var lineDashGap: Int
): Parcelable {

   /* @IgnoredOnParcel
    var orientation by observable(GradientDrawable.Orientation.VERTICAL) { _, oldValue, newValue ->
        onOrientationChanged?.invoke(oldValue, newValue)
    }
    */

    private lateinit var orientation: Any

    @IgnoredOnParcel
    var onOrientationChanged: ((GradientDrawable.Orientation, GradientDrawable.Orientation) -> Unit)? = null

    fun copy(): TimelineAttributes {
        val attributes = TimelineAttributes(markerSize, markerColor, markerInCenter, markerLeftPadding, markerTopPadding,
                markerRightPadding, markerBottomPadding, linePadding, lineWidth, startLineColor, endLineColor, lineStyle, lineDashWidth,
                lineDashGap)
        attributes.orientation = orientation
        return attributes
    }

    override fun toString(): String {
        return "TimelineAttributes(markerSize=$markerSize, markerColor=$markerColor, markerInCenter=$markerInCenter, " +
                "markerTopPadding=$markerTopPadding, markerBottomPadding=$markerBottomPadding, linePadding=$linePadding, " +
                "lineWidth=$lineWidth, startLineColor=$startLineColor, endLineColor=$endLineColor, lineStyle=$lineStyle, " +
                "lineDashWidth=$lineDashWidth, lineDashGap=$lineDashGap, onOrientationChanged=$onOrientationChanged)"
    }
}