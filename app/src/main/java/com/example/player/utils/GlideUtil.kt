package com.example.player.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 *   Create by hanjun
 *   on 2019-04-29
 *   Glide工具类
 */
object GlideUtil  {

    /**
     * 设置Url到ImageView
     */
    fun setUrl(context: Context, url: String, view: ImageView) {
        Glide.with(context).load(url).into(view)
    }
}