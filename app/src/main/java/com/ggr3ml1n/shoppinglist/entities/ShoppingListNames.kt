package com.ggr3ml1n.shoppinglist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "shopping_list_names")
data class ShoppingListNames(
    
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    
    @ColumnInfo(name = "name")
    val name: String,
    
    @ColumnInfo(name = "time")
    val time: String,
    
    @ColumnInfo(name = "allItemCounter")
    val allItemCounter: String,
    
    @ColumnInfo(name = "checkedItemsCounter")
    val checkItemsCounter: String,
    
    @ColumnInfo(name = "itemsIds")
    val itemIds: String,
) : Serializable