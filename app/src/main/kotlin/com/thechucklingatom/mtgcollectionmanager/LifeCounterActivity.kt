package com.thechucklingatom.mtgcollectionmanager

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.*

class LifeCounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_counter)

        setLayout()
    }

    fun setLayout(){
        verticalLayout {
            val upperTotal = textView{
                text = "19"
                textSize = sp(50f).toFloat()
                gravity = Gravity.CENTER
                rotation = 180f
                typeface = Typeface.DEFAULT_BOLD
                textColor = Color.BLACK
            }

            var lowerTotal = textView {
                text = "20"
                textSize = sp(50f).toFloat()
                gravity = Gravity.CENTER
                typeface = Typeface.DEFAULT_BOLD
                textColor = Color.BLACK
            }

            button {
                onClick {
                    lowerTotal.text = "35"
                }
            }
        }
    }
}
