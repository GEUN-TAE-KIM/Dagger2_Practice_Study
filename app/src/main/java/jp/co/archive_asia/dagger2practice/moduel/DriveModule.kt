package jp.co.archive_asia.dagger2practice.moduel

import dagger.Module
import dagger.Provides
import jp.co.archive_asia.dagger2practice.model.Driver
import javax.inject.Singleton

@Module
class DriveModule(val name:String) {

        @Singleton
        @Provides
        fun drive(): Driver = Driver(name)

}