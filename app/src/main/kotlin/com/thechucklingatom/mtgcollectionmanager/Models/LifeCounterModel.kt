package com.thechucklingatom.mtgcollectionmanager.Models

/**
 * Created by thechucklingatom on 5/14/2017.
 * @author thechucklingatom
 *
 * Holds the two lifetotals, poison counters, etc for the counter.
 */

class LifeCounterModel : BaseModel{
    var lifeTotals : Array<Int> = Array(1, {0})
    var poisonCounters : Array<Int> = Array(1, {0})

    fun initializeLifeTotals(numberOfPlayers : Int, startingLife : Int){
        lifeTotals = Array(numberOfPlayers, {startingLife})
        poisonCounters = Array(numberOfPlayers, {0})
    }

    fun updateLifeTotal(playerNumber : Int, numberToAdd : Int){
        lifeTotals[playerNumber] += numberToAdd
    }

    fun updatePoisonCounters(playerNumber: Int, numberToAdd: Int){
        poisonCounters[playerNumber] += numberToAdd
    }

}