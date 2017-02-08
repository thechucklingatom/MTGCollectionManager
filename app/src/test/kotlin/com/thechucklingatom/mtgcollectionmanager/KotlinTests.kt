package com.thechucklingatom.mtgcollectionmanager

import com.thechucklingatom.mtgcollectionmanager.Models.CardModel
import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Created by thechucklingatom on 2/5/2017.
 * @author thechucklingatom
 */

class KotlinTests {

    @Test
    fun firstTest() {
        assertTrue(true)
    }

    @Test
    fun CardModelDoesReturnCards(){
        val CardModel = CardModel()
        assertTrue(CardModel.getAllCards().isNotEmpty())
    }
}