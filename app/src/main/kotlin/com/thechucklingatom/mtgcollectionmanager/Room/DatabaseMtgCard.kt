package com.thechucklingatom.mtgcollectionmanager.Room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by thechucklingatom on 7/26/17.
 */
@Entity(tableName = "Card")
data class DatabaseMtgCard(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var name: String = "")