package com.trvrx.smack.Controller

import android.app.Application
import com.trvrx.smack.Utilities.SharedPrefs

/**
 * Created by User on 30/1/2561.
 */
class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}