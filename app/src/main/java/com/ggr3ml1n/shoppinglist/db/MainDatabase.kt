package com.ggr3ml1n.shoppinglist.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ggr3ml1n.shoppinglist.entities.LibraryItem
import com.ggr3ml1n.shoppinglist.entities.NoteItem
import com.ggr3ml1n.shoppinglist.entities.ShoppingListItem
import com.ggr3ml1n.shoppinglist.entities.ShoppingListNames

@Database (entities = [LibraryItem::class, NoteItem::class, ShoppingListItem::class, ShoppingListNames::class], version = 1)
abstract class MainDatabase : RoomDatabase() {
    
    abstract fun getDao(): Dao
    
    companion object {
        @Volatile
        private var INSTANCE: MainDatabase? = null
        fun getDatabase(context: Context) : MainDatabase {
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDatabase::class.java,
                    "shopping_list.db",
                ).build()
                instance
            }
        }
    }
}