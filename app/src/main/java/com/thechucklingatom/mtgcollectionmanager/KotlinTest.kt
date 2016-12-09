package com.thechucklingatom.mtgcollectionmanager

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import org.jetbrains.anko.*

class KotlinTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout{
            val name = editText()
            button("Say Hello"){
                onClick { toast("Hello, ${name.text}")}
            }
        }
    }

}
