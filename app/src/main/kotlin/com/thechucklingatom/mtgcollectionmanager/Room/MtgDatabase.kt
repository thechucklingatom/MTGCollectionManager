package com.thechucklingatom.mtgcollectionmanager.Room

import android.arch.persistence.db.SupportSQLiteOpenHelper
import android.arch.persistence.room.Database
import android.arch.persistence.room.DatabaseConfiguration
import android.arch.persistence.room.InvalidationTracker
import android.arch.persistence.room.RoomDatabase

/**
 * Created by thechucklingatom on 7/26/17.
 */
@Database(entities = arrayOf(DatabaseMtgSet::class, DatabaseMtgCard::class), version = 1)
abstract class MtgDatabase : RoomDatabase() {
    abstract fun mtgDao() : MtgDao
}