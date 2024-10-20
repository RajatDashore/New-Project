package com.uoons.india.data.local

import androidx.datastore.preferences.preferencesKey
import io.michaelrocks.paranoid.Obfuscate

@Obfuscate
object PreferenceKeys{

    val MY_LANGUAGE = preferencesKey<String>("My_Lang")
    val GET_STARTED = preferencesKey<String>("GET_STARTED")
    val ONLINE = preferencesKey<String>("ONLINE")
    val COD = preferencesKey<String>("COD")
    val CHANNEL_CODE = preferencesKey<String>("CHANNEL_CODE")
    val ACCESS_TOKEN = preferencesKey<String>("ACCESS_TOKEN")
    val MOBILE_NO = preferencesKey<String>("MOBILE_NO")
    val NEW_MOBILE_NO = preferencesKey<String>("NEW_MOBILE_NO")
    val PROFILE_ID = preferencesKey<String>("PROFILE_ID")
    val USER_NAME = preferencesKey<String>("USER_NAME")
    val USER_NAME_ORDER = preferencesKey<String>("USER_NAME_ORDER")
    val USER_EMAIL_ORDER = preferencesKey<String>("USER_EMAIL_ORDER")
    val PROFILE_IMAGE = preferencesKey<String>("PROFILE_IMAGE")
    val PIN_CODE = preferencesKey<String>("PIN_CODE")
    val PIN_CODE_EXPECTED_DELIVERY = preferencesKey<String>("PIN_CODE_EXPECTED_DELIVERY")
    val GRANTED_PERMISSION = preferencesKey<String>("permission")
    val COUPEN_CODE = preferencesKey<String>("COUPEN_CODE")
    val ADDRESS_ID = preferencesKey<String>("ADDRESS_ID")
    val HOME_SUB_ID = preferencesKey<String>("HOME_SUB_ID")
    val SORTING_ID = preferencesKey<String>("SORTING_ID")
    val SORT_BY_NAME = preferencesKey<String>("SORT_BY_NAME")
    val SUB_CATE_ID = preferencesKey<String>("SUB_CATE_ID")
    val FILTER_LIST = preferencesKey<String>("FILTER_LIST")
    val FIREBASE_LINK = preferencesKey<String>("Firebaselink")
    val ORDER_ID = preferencesKey<String>("Order_id")
    val ORDER_amount = preferencesKey<String>("Order_amount")

    val ONE_TIME_REQUEST = preferencesKey<String>("true")

}
