package jp.techacademy.yuki.nishimura.apiapp

import java.io.Serializable

data class FavoriteShopData(
    var url: String,
    var id: String,
    var logoImage: String,
    var name: String,
): Serializable