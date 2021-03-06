package com.example.player.presenter.impl

import com.example.player.base.BaseView
import com.example.player.model.YueDanBean
import com.example.player.net.ResponseHandler
import com.example.player.net.YueDanRequest
import com.example.player.presenter.interf.YueDanPresenter

/**
 *   Create by hanjun
 *   on 2019-04-29
 *   悦单界面Presenter
 */
class YueDanPresenterImpl(var yueDanView: BaseView<YueDanBean>?) : YueDanPresenter, ResponseHandler<YueDanBean> {

    var isLoadMore = false

    override fun destory() {
        yueDanView?.let {
            yueDanView = null
        }
    }

    override fun onError(msg: String?) {
        yueDanView?.onError(msg)
    }

    override fun onSuccess(result: YueDanBean) {
        yueDanView?.loadSuccess(result, isLoadMore)
    }


    override fun loadData(offset: Int, isLoadMore: Boolean) {
        this.isLoadMore = isLoadMore
        YueDanRequest(offset, this).excute()
    }

}