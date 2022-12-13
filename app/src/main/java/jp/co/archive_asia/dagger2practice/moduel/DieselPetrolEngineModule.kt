package jp.co.archive_asia.dagger2practice.moduel

import dagger.Module
import dagger.Provides
import jp.co.archive_asia.dagger2practice.model.DieselEngine
import jp.co.archive_asia.dagger2practice.model.Engine

@Module
class DieselPetrolEngineModule(val horsePower: Int) {

    @Provides
    fun bindEngine(): Engine = DieselEngine(horsePower)
}