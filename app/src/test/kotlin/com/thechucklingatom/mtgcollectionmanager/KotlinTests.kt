package com.thechucklingatom.mtgcollectionmanager

import com.thechucklingatom.mtgcollectionmanager.Models.CardModel
import io.magicthegathering.javasdk.resource.Card
import junit.framework.TestCase.assertTrue
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

    @Test
    fun CardModelReturnsSet(){
        val CardModel = CardModel()
        val cardList : List<Card> = CardModel.getAllCards().filter { it.set == "LEA"}

        assertTrue(!cardList.filter { it.name == "Fear" }.isEmpty())
        assertTrue(cardList.filter { it.name == "Grapeshot" }.isEmpty())

    }
}