package com.kelvi.motivation.util

import android.content.Context
import android.content.SharedPreferences
import android.os.Build


class SecurityPreferences(context: Context) {

    private val mSaredPreferences: SharedPreferences = context.getSharedPreferences("motivation", Context.MODE_PRIVATE)


    fun storeString(key: String, value: String) {
        mSaredPreferences.edit().putString(key, value).apply()
    }

    fun getStoreString(key: String): String? {
        return mSaredPreferences.getString(key, "")
    }
}
