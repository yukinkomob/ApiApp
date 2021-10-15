package jp.techacademy.yuki.nishimura.apiapp

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("results")
    var results: Results
)

data class Results(
    @SerializedName("api_version")
    var apiVersion: String,
    @SerializedName("results_available")
    var resultsAvailable: Int,
    @SerializedName("results_returned")
    var resultsReturned: String,
    @SerializedName("results_start")
    var resultsStart: Int,
    @SerializedName("shop")
    var shop: List<Shop>
)

data class Shop(
    @SerializedName("access")
    var access: String,
    @SerializedName("address")
    var address: String,
    @SerializedName("band")
    var band: String,
    @SerializedName("barrier_free")
    var barrierFree: String,
    @SerializedName("budget")
    var budget: Budget,
    @SerializedName("budget_memo")
    var budgetMemo: String,
    @SerializedName("capacity")
    var capacity: Int,
    @SerializedName("card")
    var card: String,
    @SerializedName("catch")
    var `catch`: String,
    @SerializedName("charter")
    var charter: String,
    @SerializedName("child")
    var child: String,
    @SerializedName("close")
    var close: String,
    @SerializedName("coupon_urls")
    var couponUrls: CouponUrls,
    @SerializedName("course")
    var course: String,
    @SerializedName("english")
    var english: String,
    @SerializedName("free_drink")
    var freeDrink: String,
    @SerializedName("free_food")
    var freeFood: String,
    @SerializedName("genre")
    var genre: Genre,
    @SerializedName("horigotatsu")
    var horigotatsu: String,
    @SerializedName("id")
    var id: String,
    @SerializedName("karaoke")
    var karaoke: String,
    @SerializedName("ktai_coupon")
    var ktaiCoupon: Int,
    @SerializedName("large_area")
    var largeArea: LargeArea,
    @SerializedName("large_service_area")
    var largeServiceArea: LargeServiceArea,
    @SerializedName("lat")
    var lat: Double,
    @SerializedName("lng")
    var lng: Double,
    @SerializedName("logo_image")
    var logoImage: String,
    @SerializedName("lunch")
    var lunch: String,
    @SerializedName("middle_area")
    var middleArea: MiddleArea,
    @SerializedName("midnight")
    var midnight: String,
    @SerializedName("mobile_access")
    var mobileAccess: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("name_kana")
    var nameKana: String,
    @SerializedName("non_smoking")
    var nonSmoking: String,
    @SerializedName("open")
    var `open`: String,
    @SerializedName("other_memo")
    var otherMemo: String,
    @SerializedName("parking")
    var parking: String,
    @SerializedName("party_capacity")
    var partyCapacity: Int,
    @SerializedName("pet")
    var pet: String,
    @SerializedName("photo")
    var photo: Photo,
    @SerializedName("private_room")
    var privateRoom: String,
    @SerializedName("service_area")
    var serviceArea: ServiceArea,
    @SerializedName("shop_detail_memo")
    var shopDetailMemo: String,
    @SerializedName("show")
    var show: String,
    @SerializedName("small_area")
    var smallArea: SmallArea,
    @SerializedName("station_name")
    var stationName: String,
    @SerializedName("sub_genre")
    var subGenre: SubGenre,
    @SerializedName("tatami")
    var tatami: String,
    @SerializedName("tv")
    var tv: String,
    @SerializedName("urls")
    var urls: Urls,
    @SerializedName("wedding")
    var wedding: String,
    @SerializedName("wifi")
    var wifi: String
)

data class Budget(
    @SerializedName("average")
    var average: String,
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class CouponUrls(
    @SerializedName("pc")
    var pc: String,
    @SerializedName("sp")
    var sp: String
)

data class Genre(
    @SerializedName("catch")
    var `catch`: String,
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class LargeArea(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class LargeServiceArea(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class MiddleArea(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class Photo(
    @SerializedName("mobile")
    var mobile: Mobile,
    @SerializedName("pc")
    var pc: Pc
)

data class Mobile(
    @SerializedName("l")
    var l: String,
    @SerializedName("s")
    var s: String
)

data class Pc(
    @SerializedName("l")
    var l: String,
    @SerializedName("m")
    var m: String,
    @SerializedName("s")
    var s: String
)

data class ServiceArea(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class SmallArea(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class SubGenre(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String
)

data class Urls(
    @SerializedName("pc")
    var pc: String
)
