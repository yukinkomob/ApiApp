package jp.techacademy.yuki.nishimura.apiapp

interface FragmentCallback {
    fun onClickItem(url: String, shop: FavoriteShopData? = null)
    fun onAddFavorite(shop: Shop)
    fun onDeleteFavorite(id: String)
}
