package com.thechucklingatom.mtgcollectionmanager.Presenters

import com.thechucklingatom.mtgcollectionmanager.Models.BaseModel

/**
 * Created by thechucklingatom on 2/5/2017.
 * @author thechucklingatom
 */
interface BasePresenter {
    fun start()
    fun setModel(model : BaseModel)
}