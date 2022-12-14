package jp.co.archive_asia.dagger2practice

import android.app.Application
import jp.co.archive_asia.dagger2practice.component.ApplicationComponent
import jp.co.archive_asia.dagger2practice.component.CarComponent
import jp.co.archive_asia.dagger2practice.component.DaggerApplicationComponent
import jp.co.archive_asia.dagger2practice.component.DaggerCarComponent

class Dagger2CarApplication: Application() {
    // lateinit var carComponent: CarComponent
    lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.create()
      /*  carComponent =
            DaggerCarComponent
            .builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()*/
    }
}