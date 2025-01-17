package com.uoons.india.ui.product_detail.model

import com.google.gson.annotations.SerializedName

data class ProductDetailData(
    @SerializedName("pid") var pid: String? = null,
    @SerializedName("user_id") var userId: String? = null,
    @SerializedName("productid") var productid: String? = null,
    @SerializedName("product_name") var productName: String? = null,
    @SerializedName("product_slug") var productSlug: String? = null,
    @SerializedName("product_sku") var productSku: String? = null,
    @SerializedName("product_price") var productPrice: String? = null,
    @SerializedName("product_sale_price") var productSalePrice: String? = null,
    @SerializedName("product_stock") var productStock: String? = null,
    @SerializedName("vendor_stock") var vendorStock: String? = null,
    @SerializedName("product_weight") var productWeight: String? = null,
    @SerializedName("product_description") var productDescription: String? = null,
    @SerializedName("description" ) var description : DescriptionModel? = DescriptionModel(),
    @SerializedName("product_images") var productImages: String? = null,
    @SerializedName("images") var images: ArrayList<ImagesArrayListModel> = arrayListOf(),
    @SerializedName("add_info") var addInfo: ArrayList<String> = arrayListOf(),
    @SerializedName("return_policy") var returnPolicy: String? = null,
    @SerializedName("product_category") var productCategory: String? = null,
    @SerializedName("size") var size: String? = null,
    @SerializedName("color") var color: String? = null,
    @SerializedName("brand") var brand: String? = null,
    @SerializedName("product_upload_date") var productUploadDate: String? = null,
    @SerializedName("product_tag") var productTag: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("best_selling") var bestSelling: String? = null,
    @SerializedName("best_selling_color_code") var bestSellingColorCode: String? = null,
    @SerializedName("feat_prod") var featProd: String? = null,
    @SerializedName("discount") var discount: String? = null,
    @SerializedName("end_date") var endDate: String? = null,
    @SerializedName("start_date") var startDate: String? = null,
    @SerializedName("republic_day") var republicDay: String? = null,
    @SerializedName("shipping_charges") var shippingCharges: String? = null,
    @SerializedName("deal_of_the_day") var dealOfTheDay: String? = null,
    @SerializedName("cash_on_delivary") var cashOnDelivary: String? = null,
    @SerializedName("salient_features") var salientFeatures: ArrayList<String> = arrayListOf(),
    @SerializedName("freqvently_bought") var freqventlyBought: String? = null,
    @SerializedName("product_services") var productServices: String? = null,
    @SerializedName("gst") var gst: String? = null,
    @SerializedName("product_status") var productStatus: String? = null,
    @SerializedName("meta_keyword") var metaKeyword: String? = null,
    @SerializedName("meta_decs") var metaDecs: String? = null,
    @SerializedName("questionanswer") var questionanswer: ArrayList<QuestionanswerModel> = arrayListOf(),
    @SerializedName("live") var live: String? = null,
    @SerializedName("inCart") var inCart: Boolean? = null,
    @SerializedName("inWishlist") var inWishlist: Boolean? = null,
    @SerializedName("similar_products") var similarProducts: ArrayList<SimilarProductsModel> = arrayListOf(),

    @SerializedName("add_information") var addInformation: ArrayList<ProductAddInfoModel> = arrayListOf(),
    @SerializedName("rating") var rating: RatingModel? = RatingModel(),
    @SerializedName("reviews") var reviews: ArrayList<ReviewsModel> = arrayListOf(),
    @SerializedName("freq_prod") var freqProd: ArrayList<FreqProdModel> = arrayListOf(),
    @SerializedName("advertisment" ) var advertisment : Advertisment? = Advertisment()
)