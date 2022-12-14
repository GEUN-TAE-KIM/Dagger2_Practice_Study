package jp.co.archive_asia.dagger2practice.component

import dagger.Component
import jp.co.archive_asia.dagger2practice.model.Driver
import jp.co.archive_asia.dagger2practice.moduel.DriveModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DriveModule::class])
interface ApplicationComponent {
    fun getDriver(): Driver
}