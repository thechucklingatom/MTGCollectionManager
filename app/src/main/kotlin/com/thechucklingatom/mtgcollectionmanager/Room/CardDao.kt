package com.thechucklingatom.mtgcollectionmanager.Room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by thechucklingatom on 8/1/2017.
 */
@Dao
interface CardDao {
    @Query("SELECT * FROM card")
    fun getAllCards() : List<DatabaseMtgCard>

    @Query("SELECT * FROM card WHERE name LIKE :arg0")
    fun getCardByPartialName(name: String) : List<DatabaseMtgCard>

    @Insert
    fun insertAll(vararg cards: DatabaseMtgCard)
}