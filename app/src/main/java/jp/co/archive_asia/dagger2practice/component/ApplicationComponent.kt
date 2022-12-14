package jp.co.archive_asia.dagger2practice.component

import dagger.Component
import jp.co.archive_asia.dagger2practice.model.Driver
import jp.co.archive_asia.dagger2practice.moduel.DieselPetrolEngineModule
import jp.co.archive_asia.dagger2practice.moduel.DriveModule
import jp.co.archive_asia.dagger2practice.moduel.PetrolEngineModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DriveModule::class])
interface ApplicationComponent {
    // fun getDriver(): Driver
   // fun getCarComponent(dieselPetrolEngineModule: DieselPetrolEngineModule): CarComponent

    fun getCarComponentBuilder(): CarComponent.Builder
}