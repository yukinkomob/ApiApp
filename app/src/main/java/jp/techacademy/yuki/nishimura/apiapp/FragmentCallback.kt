package jp.techacademy.yuki.nishimura.apiapp

interface FragmentCallback {
    fun onAddFavorite(shop: Shop)
    fun onDeleteFavorite(id: String)
}
