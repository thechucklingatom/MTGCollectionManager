package com.thechucklingatom.mtgcollectionmanager.Room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by thechucklingatom on 7/26/17.
 */
@Entity(tableName = "Set")
data class DatabaseMtgSet(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String = "")