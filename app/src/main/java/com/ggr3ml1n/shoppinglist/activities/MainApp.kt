package com.ggr3ml1n.shoppinglist.activities

import android.app.Application
import com.ggr3ml1n.shoppinglist.db.MainDatabase

class MainApp : Application() {
    val database by lazy { MainDatabase.getDatabase(this) }
}