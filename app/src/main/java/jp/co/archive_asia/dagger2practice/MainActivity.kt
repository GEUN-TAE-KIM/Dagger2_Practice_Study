package jp.co.archive_asia.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Interface 구현하는 Dagger(xxx)Component 객체를 반환하는 create() 메서드를 제공
        //이를 이용해 만들어진 DaggerCarComponent 인스턴스로 Dagger를 통해 객체가 생성되고 car 구성요소가 생성
        val carComponent : CarComponent = DaggerCarComponent.create()

        val car: Car = carComponent.getCar()

        car.drive()
    }
}