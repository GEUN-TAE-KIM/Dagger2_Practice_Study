package jp.co.archive_asia.dagger2practice.component

import dagger.Component
import jp.co.archive_asia.dagger2practice.MainActivity
import jp.co.archive_asia.dagger2practice.model.Car
import jp.co.archive_asia.dagger2practice.moduel.DieselPetrolEngineModule
import jp.co.archive_asia.dagger2practice.moduel.WheelsModule

//클래스의 인스턴스를 모아 놓는 저장소 역활. 각 인스턴스들을 모듈 단위로 제공
@Component(modules = [WheelsModule::class, DieselPetrolEngineModule::class])//, PetrolEngineModule::class])
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}