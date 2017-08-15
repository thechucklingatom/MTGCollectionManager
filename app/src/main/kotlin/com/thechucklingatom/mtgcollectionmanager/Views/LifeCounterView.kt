package com.thechucklingatom.mtgcollectionmanager.Views

import com.thechucklingatom.mtgcollectionmanager.Presenters.BasePresenter
import com.thechucklingatom.mtgcollectionmanager.Presenters.LifeCounterPresenter

/**
 * Created by thechucklingatom on 5/14/2017.
 * @author thechucklingatom
 *
 * View for the life counter part of the app.
 */

open class LifeCounterView<in T> : BaseView<T>{
    var presenter : LifeCounterPresenter? = null

    override fun setPresenter(presenter: T) {
        this.presenter = presenter as LifeCounterPresenter
    }

}
