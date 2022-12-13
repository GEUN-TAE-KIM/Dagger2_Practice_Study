package jp.co.archive_asia.dagger2practice.model

import android.util.Log
import jp.co.archive_asia.dagger2practice.model.Engine
import javax.inject.Inject
import javax.inject.Named

//Named 으로 어떤 것을 주입 받아야 하는지 명확해짐
class PetrolEngine @Inject constructor(
    @Named("horsePower") val horsePower: Int,
    @Named("engineCapacity") val engineCapacity: Int
) : Engine {

    override fun start() {
        Log.d(TAG, "Petrol engine started $horsePower hp, $engineCapacity capacity")
    }
}