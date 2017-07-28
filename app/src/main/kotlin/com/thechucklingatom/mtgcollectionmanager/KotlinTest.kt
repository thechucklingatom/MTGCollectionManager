package com.thechucklingatom.mtgcollectionmanager

import android.app.Activity
import android.arch.persistence.room.Room
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.thechucklingatom.mtgcollectionmanager.Room.MtgDatabase
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.listView
import org.jetbrains.anko.verticalLayout

class KotlinTest : Activity() {

    companion object {
        var database: MtgDatabase? = null
    }

    val arr = Array(5, Int::toString)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        verticalLayout {

            toolbar {
                backgroundColor = resources.getColor(R.color.colorPrimary, null)
                setTitleTextColor(resources.getColor(R.color.colorAccent, null))
                title = "test bar"
            }

            id = R.layout.test_text_layout

            listView {
                id = R.id.test_text_view
            }
        }

        val cardAdapter: CardAdapter? = CardAdapter(this)

        val tempView: ListView = findViewById(R.id.test_text_view) as ListView

        tempView.adapter = cardAdapter

        cardAdapter?.notifyDataSetChanged()

        Log.i("BeforeDb", getDatabasePath("mtgDatabase").toString())

        database = Room.databaseBuilder(this,
                MtgDatabase::class.java,
                "mtgDatabase")
                .build()

        Log.i("BeforeDb", getDatabasePath("mtgDatabase").toString())
    }

}
