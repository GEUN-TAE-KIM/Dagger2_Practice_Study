package jp.co.archive_asia.dagger2practice

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }
}