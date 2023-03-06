package com.example.jazzgreatest

import android.os.Parcel
import android.os.Parcelable

data class Legend(
    var name: String?,
    var birthName: String?,
    var born: String?,
    var died: String?,
    var yearsActive: String?,
    var instrument: String?,
    var popularSong: String?,
    var summary: String?,
    var imageId: Int?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(birthName)
        parcel.writeString(born)
        parcel.writeString(died)
        parcel.writeString(yearsActive)
        parcel.writeString(instrument)
        parcel.writeString(popularSong)
        parcel.writeString(summary)
        parcel.writeValue(imageId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Legend> {
        override fun createFromParcel(parcel: Parcel): Legend {
            return Legend(parcel)
        }

        override fun newArray(size: Int): Array<Legend?> {
            return arrayOfNulls(size)
        }
    }
}
