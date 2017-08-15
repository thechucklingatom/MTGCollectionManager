package com.thechucklingatom.mtgcollectionmanager.Presenters

import com.thechucklingatom.mtgcollectionmanager.Models.BaseModel
import com.thechucklingatom.mtgcollectionmanager.Models.LifeCounterModel

/**
 * Created by thechucklingatom on 5/14/2017.
 * @author thechucklingatom
 *
 * The presenter for the the LifeCounter part of the app.
 */

class LifeCounterPresenter : BasePresenter{
    var model : LifeCounterModel? = null
    override fun setModel(model: BaseModel) {
        this.model = model as LifeCounterModel
    }

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
