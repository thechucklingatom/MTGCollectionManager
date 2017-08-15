package com.thechucklingatom.mtgcollectionmanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.thechucklingatom.mtgcollectionmanager.Presenters.LifeCounterPresenter
import com.thechucklingatom.mtgcollectionmanager.Views.LifeCounterView

class LifeCounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_counter)
    }
}
