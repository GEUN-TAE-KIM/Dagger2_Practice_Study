package jp.co.archive_asia.dagger2practice.model

import android.util.Log

class DieselEngine(val horsePower: Int) : Engine {
    override fun start() {
        Log.d(TAG, "Diesel engine started $horsePower hp" )
    }
}