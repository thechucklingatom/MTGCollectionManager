package com.thechucklingatom.mtgcollectionmanager.Views

/**
 * Created by thechucklingatom on 2/5/2017.
 * @author thechucklingatom
 */
interface BaseView<in T> {

    fun setPresenter(presenter : T)

}