package com.uoons.india.ui.home.fragment.model

import com.google.gson.annotations.SerializedName
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
data class Items(
    @SerializedName("id"     ) var id    : String? = null,
    @SerializedName("title" ) var title : String? = null,
    @SerializedName("under" ) var under : String? = null,
    @SerializedName("product_name"  ) var product_name : String? = null,
    @SerializedName("product_images"  ) var product_images : String? = null,
    @SerializedName("image"  ) var image : String? = null,
    @SerializedName("url"    ) var url   : String? = null,
    @SerializedName("type"   ) var type  : String? = null,
    @SerializedName("cat_id" ) var catId : String? = null,
    @SerializedName("sponsored_by" ) var sponsoredBy : String? = null,
    @SerializedName("created_at"   ) var createdAt   : String? = null,
    @SerializedName("product_views"      ) var productViews     : Int?    = null,

    @SerializedName("p_id"       ) var pId       : String? = null,
    @SerializedName("ip_address" ) var ipAddress : String? = null,
    @SerializedName("address"    ) var address   : String? = null,
    @SerializedName("status"     ) var status    : String? = null,

    @SerializedName("pid") var pid: String? = null,
    @SerializedName("productid") var productid: String? = null,
    @SerializedName("brand") var brand: String? = null,
    @SerializedName("product_description") var productDescription: String? = null,
    @SerializedName("cash_on_delivary") var cashOnDelivary: String? = null,
    @SerializedName("end_date") var endDate: String? = null,
    @SerializedName("republic_day") var republicDay: String? = null,
    @SerializedName("product_stock") var productStock: String? = null,
    @SerializedName("deal_of_the_day") var dealOfTheDay: String? = null,
    @SerializedName("product_slug") var productSlug: String? = null,
    @SerializedName("product_tag") var productTag: String? = null,
    @SerializedName("product_price") var productPrice: String? = null,
    @SerializedName("product_sale_price") var productSalePrice: String? = null,
    @SerializedName("product_category") var productCategory: String? = null,
    @SerializedName("size") var size: String? = null,
    @SerializedName("color") var color: String? = null,
    @SerializedName("discount") var discount: String? = null,
    @SerializedName("product_image") var productImage: String? = null,
    @SerializedName("category") var category: String? = null,

    @SerializedName("user_id"             ) var userId             : String? = null,
    @SerializedName("product_name"        ) var productName        : String? = null,
    @SerializedName("product_sku"         ) var productSku         : String? = null,
    @SerializedName("vendor_stock"        ) var vendorStock        : String? = null,
    @SerializedName("product_weight"      ) var productWeight      : String? = null,
    @SerializedName("product_images"      ) var productImages      : String? = null,
    @SerializedName("add_info"            ) var addInfo            : String? = null,
    @SerializedName("return_policy"       ) var returnPolicy       : String? = null,
    @SerializedName("product_upload_date" ) var productUploadDate  : String? = null,
    @SerializedName("best_selling"        ) var bestSelling        : String? = null,
    @SerializedName("feat_prod"           ) var featProd           : String? = null,
    @SerializedName("start_date"          ) var startDate          : String? = null,
    @SerializedName("shipping_charges"    ) var shippingCharges    : String? = null,
    @SerializedName("salient_features"    ) var salientFeatures    : String? = null,
    @SerializedName("freqvently_bought"   ) var freqventlyBought   : String? = null,
    @SerializedName("product_services"    ) var productServices    : String? = null,
    @SerializedName("gst"                 ) var gst                : String? = null,
    @SerializedName("product_status"      ) var productStatus      : String? = null,
    @SerializedName("meta_keyword"        ) var metaKeyword        : String? = null,
    @SerializedName("meta_decs"           ) var metaDecs           : String? = null,
    @SerializedName("live"                ) var live               : String? = null,

    @SerializedName("c_id"         ) var cId         : String? = null,
    @SerializedName("show"         ) var show        : String? = null,
    @SerializedName("banner_image" ) var bannerImage : String? = null,
    @SerializedName("back_image"   ) var backImage   : String? = null,
    @SerializedName("back_color"   ) var backColor   : String? = null,
    @SerializedName("cat_icon"     ) var catIcon     : String? = null,
    @SerializedName("item_order"   ) var itemOrder   : String? = null,
    @SerializedName("parent"       ) var parent      : String? = null



)
