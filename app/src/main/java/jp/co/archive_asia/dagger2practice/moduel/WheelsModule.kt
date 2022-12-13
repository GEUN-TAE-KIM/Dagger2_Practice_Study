package jp.co.archive_asia.dagger2practice.moduel

import dagger.Module
import dagger.Provides
import jp.co.archive_asia.dagger2practice.model.Rims
import jp.co.archive_asia.dagger2practice.model.Tires
import jp.co.archive_asia.dagger2practice.model.Wheels

@Module
class WheelsModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideRims() = Rims()

        @JvmStatic
        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflateTires()
            return tires
        }

        @JvmStatic
        @Provides
        fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
    }
}