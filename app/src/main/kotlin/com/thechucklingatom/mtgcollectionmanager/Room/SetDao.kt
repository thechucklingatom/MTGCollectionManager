package com.thechucklingatom.mtgcollectionmanager.Room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by thechucklingatom on 7/26/17.
 */
@Dao
interface SetDao {

    @Query("SELECT * FROM MtgSet")
    fun getAllSets() : List<DatabaseMtgSet>

    @Insert
    fun insertAll(vararg sets: DatabaseMtgSet)
}