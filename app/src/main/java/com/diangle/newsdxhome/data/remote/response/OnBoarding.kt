package com.diangle.newsdxhome.data.remote.response
import com.google.gson.annotations.SerializedName


data class OnBoarding(
    @SerializedName("DATA")
    val dATA: List<DATA?>?,
    @SerializedName("STATUS")
    val sTATUS: Boolean?,
    @SerializedName("STATUS_MSG")
    val sTATUSMSG: String?
) {
    data class DATA(
        @SerializedName("image_url")
        val imageUrl: String?,
        @SerializedName("title")
        val title: String?
    )
}