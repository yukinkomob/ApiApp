package jp.techacademy.yuki.nishimura.apiapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    private var shopData: FavoriteShopData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(intent.getStringExtra(KEY_URL).toString())
        shopData = intent.getSerializableExtra(KEY_ID) as FavoriteShopData
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val ret = super.onCreateOptionsMenu(menu)
        if (shopData != null) {
            val shop = FavoriteShop.findBy(shopData!!.id)
            if (shop != null) {
                menu?.add(0, MENU_ID_FAVORITE_REMOVE, Menu.NONE, "お気に入りを削除する")
            } else {
                menu?.add(0, MENU_ID_FAVORITE_ADD, Menu.NONE, "お気に入りに登録する")
            }
        } else {
            menu?.add(0, MENU_ID_FAVORITE_ADD, Menu.NONE, "お気に入りに登録する")
        }
        return ret
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            MENU_ID_FAVORITE_ADD -> {
                shopData?.let {
                    addFavorite(it)
                }
            }
            MENU_ID_FAVORITE_REMOVE -> {
                shopData?.let {
                    showConfirmDeleteFavoriteDialog(it.id)
                }
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun addFavorite(shop: FavoriteShopData) {
        FavoriteShop.insert(FavoriteShop().apply {
            id = shop.id
            name = shop.name
            imageUrl = shop.logoImage
            url = shop.url
        })
        Toast.makeText(applicationContext, "お気に入りに登録しました。", Toast.LENGTH_SHORT).show()
        invalidateOptionsMenu()
    }

    private fun showConfirmDeleteFavoriteDialog(id: String) {
        AlertDialog.Builder(this)
            .setTitle(R.string.delete_favorite_dialog_title)
            .setMessage(R.string.delete_favorite_dialog_message)
            .setPositiveButton(android.R.string.ok) { _, _ ->
                deleteFavorite(id)
            }
            .setNegativeButton(android.R.string.cancel) { _, _ -> }
            .create()
            .show()
    }

    private fun deleteFavorite(id: String) {
        FavoriteShop.delete(id)
        Toast.makeText(applicationContext, "お気に入りを削除しました。", Toast.LENGTH_SHORT).show()
        invalidateOptionsMenu()
    }

    companion object {
        private const val MENU_ID_FAVORITE_ADD = 0
        private const val MENU_ID_FAVORITE_REMOVE = 1

        private const val KEY_URL = "key_url"
        private const val KEY_ID = "key_id"
        fun start(activity: Activity, url: String, shop: FavoriteShopData? = null) {
            val intent = Intent(activity, WebViewActivity::class.java).apply {
                putExtra(KEY_URL, url)
                shop?.let {
                    putExtra(KEY_ID, shop)
                }
            }
            activity.startActivity(intent)
        }
    }
}