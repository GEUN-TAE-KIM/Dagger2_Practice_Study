package jp.co.archive_asia.dagger2practice

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }
}