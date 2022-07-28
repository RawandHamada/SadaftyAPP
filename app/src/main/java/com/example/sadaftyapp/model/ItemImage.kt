package com.example.sadaftyapp.model

import android.os.Parcel
import android.os.Parcelable

class ItemImage(
    var id: String?,
    var profile_image: String?

    //var share: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()


    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)

        parcel.writeString(profile_image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemImage> {
        override fun createFromParcel(parcel: Parcel): ItemImage {
            return ItemImage(parcel)
        }

        override fun newArray(size: Int): Array<ItemImage?> {
            return arrayOfNulls(size)
        }
    }
}