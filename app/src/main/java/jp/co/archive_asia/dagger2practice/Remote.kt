package jp.co.archive_asia.dagger2practice

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun enableRemote(car: Car) {
        Log.d(TAG, "Remote is connected")
    }
}