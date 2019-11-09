package com.kelvi.motivation.util

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import androidx.annotation.RequiresApi

class SecurityPreferences(context: Context) {

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    @RequiresApi(Build.VERSION_CODES.GINGERBREAD)
    fun storeString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    fun getStoreString(key: String): String? {
        return sharedPreferences.getString(key, "")
    }
}
