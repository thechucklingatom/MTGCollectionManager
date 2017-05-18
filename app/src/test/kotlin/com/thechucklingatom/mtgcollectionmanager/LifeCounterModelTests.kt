package com.thechucklingatom.mtgcollectionmanager

import com.thechucklingatom.mtgcollectionmanager.Models.LifeCounterModel
import junit.framework.TestCase.assertTrue
import org.junit.Test

/**
 * Created by thechucklingatom on 5/14/2017.
 *
 * @author thechucklingatom
 */

class LifeCounterModelTests {
    @Test
    fun ModelSetup(){
        val testModel : LifeCounterModel = LifeCounterModel()

        testModel.initializeLifeTotals(2, 20)

        assertTrue(testModel.lifeTotals.size == 2)
        assertTrue(testModel.lifeTotals.filter { it != 20 }.isEmpty())
    }
}