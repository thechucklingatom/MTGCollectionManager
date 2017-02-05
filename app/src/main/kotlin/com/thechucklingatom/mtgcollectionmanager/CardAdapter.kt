package com.thechucklingatom.mtgcollectionmanager

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

/**
 * Created by thechucklingatom on 12/10/2016.
 * @author thechucklingatom
 */

class CardAdapter(context: KotlinTest) : BaseAdapter() {

    var testStringArr: Array<String> = context.arr

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val item = getItem(position)
        return with(parent!!.context) {
            verticalLayout {
                textView {
                    text = item
                    textSize = 24f
                    id = R.id.test_text_item
                }
            }
        }

    }

    override fun getItem(position: Int): String {
        return testStringArr[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return testStringArr.size
    }

}
