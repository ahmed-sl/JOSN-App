package com.example.jsonpractice

import com.google.gson.annotations.SerializedName

class Datum {

    @SerializedName("date")
    var date: String? = null

    @SerializedName("eur")
    var eur: Cur? = null

    class Cur {

        @SerializedName("sar")
        var inr: String? = null

        @SerializedName("usd")
        var usd: String? = null

        @SerializedName("aud")
        var aud: String? = null

        @SerializedName("inr")
        var sar: String? = null

        @SerializedName("cny")
        var cny: String? = null

        @SerializedName("jpy")
        var jpy: String? = null

    }
}