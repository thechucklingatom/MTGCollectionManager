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

    @Query("SELECT * FROM MtgSet ORDER BY :arg0")
    fun getAllSetsOrderByParameter(orderBy: String) : List<DatabaseMtgSet>

    @Query("SELECT * FROM MtgSet ORDER BY :arg0 DESC")
    fun getAllSetsOrderByParameterDescending(orderBy: String) : List<DatabaseMtgSet>

    @Insert
    fun insertAll(vararg sets: DatabaseMtgSet)
}