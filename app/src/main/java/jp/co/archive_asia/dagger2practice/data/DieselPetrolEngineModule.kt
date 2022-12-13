package jp.co.archive_asia.dagger2practice.data

import dagger.Binds
import dagger.Module
import jp.co.archive_asia.dagger2practice.DieselEngine
import jp.co.archive_asia.dagger2practice.Engine

@Module
abstract class DieselPetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}