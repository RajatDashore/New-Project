package com.uoons.india.ui.category.category_items.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Data(  @SerializedName("pid"                 ) var pid                : String? = null,
                  @SerializedName("user_id"             ) var userId             : String? = null,
                  @SerializedName("productid"           ) var productid          : String? = null,
                  @SerializedName("product_name"        ) var productName        : String? = null,
                  @SerializedName("product_slug"        ) var productSlug        : String? = null,
                  @SerializedName("product_sku"         ) var productSku         : String? = null,
                  @SerializedName("product_price"       ) var productPrice       : String? = null,
                  @SerializedName("product_sale_price"  ) var productSalePrice   : String? = null,
                  @SerializedName("product_stock"       ) var productStock       : String? = null,
                  @SerializedName("vendor_stock"        ) var vendorStock        : String? = null,
                  @SerializedName("product_weight"      ) var productWeight      : String? = null,
                  @SerializedName("product_description" ) var productDescription : String? = null,
                  @SerializedName("product_images"      ) var productImages      : String? = null,
                  @SerializedName("add_info"            ) var addInfo            : String? = null,
                  @SerializedName("return_policy"       ) var returnPolicy       : String? = null,
                  @SerializedName("product_category"    ) var productCategory    : String? = null,
                  @SerializedName("size"                ) var size               : String? = null,
                  @SerializedName("color"               ) var color              : String? = null,
                  @SerializedName("brand"               ) var brand              : String? = null,
                  @SerializedName("product_upload_date" ) var productUploadDate  : String? = null,
                  @SerializedName("product_tag"         ) var productTag         : String? = null,
                  @SerializedName("type"                ) var type               : String? = null,
                  @SerializedName("best_selling"        ) var bestSelling        : String? = null,
                  @SerializedName("feat_prod"           ) var featProd           : String? = null,
                  @SerializedName("discount"            ) var discount           : String? = null,
                  @SerializedName("end_date"            ) var endDate            : String? = null,
                  @SerializedName("start_date"          ) var startDate          : String? = null,
                  @SerializedName("republic_day"        ) var republicDay        : String? = null,
                  @SerializedName("shipping_charges"    ) var shippingCharges    : String? = null,
                  @SerializedName("deal_of_the_day"     ) var dealOfTheDay       : String? = null,
                  @SerializedName("cash_on_delivary"    ) var cashOnDelivary     : String? = null,
                  @SerializedName("salient_features"    ) var salientFeatures    : String? = null,
                  @SerializedName("freqvently_bought"   ) var freqventlyBought   : String? = null,
                  @SerializedName("product_services"    ) var productServices    : String? = null,
                  @SerializedName("gst"                 ) var gst                : String? = null,
                  @SerializedName("product_status"      ) var productStatus      : String? = null,
                  @SerializedName("meta_keyword"        ) var metaKeyword        : String? = null,
                  @SerializedName("meta_decs"           ) var metaDecs           : String? = null,
                  @SerializedName("live"                ) var live               : String? = null
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
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Data> {
        override fun createFromParcel(parcel: Parcel): Data {
            return Data(parcel)
        }

        override fun newArray(size: Int): Array<Data?> {
            return arrayOfNulls(size)
        }
    }
}
