package jp.co.archive_asia.dagger2practice

import dagger.Component

//클래스의 인스턴스를 모아 놓는 저장소 역활. 각 인스턴스들을 모듈 단위로 제공
@Component
interface CarComponent {
    fun getCar() : Car

    fun inject(mainActivity: MainActivity)
}