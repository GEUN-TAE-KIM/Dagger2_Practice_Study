package jp.co.archive_asia.dagger2practice.model

import android.util.Log
import jp.co.archive_asia.dagger2practice.model.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor(val horsePower: Int): Engine {
    override fun start() {
        Log.d(TAG, "Petrol engine started $horsePower hp")
    }
}