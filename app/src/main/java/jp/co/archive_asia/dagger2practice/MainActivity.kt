package jp.co.archive_asia.dagger2practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.co.archive_asia.dagger2practice.component.DaggerCarComponent
import jp.co.archive_asia.dagger2practice.model.Car
import jp.co.archive_asia.dagger2practice.moduel.DieselPetrolEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //멤버 인젝션(Member Injection)메서드
    // -> 인스턴스를 만든 다음 Provider에 의해 제공되는 인스턴스를 주입시킴

    //필드 주입(Field Injection)
    // -> 필드가 정의된 인스턴스를 필드 자체에 값을 주입하는 방식

    //메서드 주입(Method Injection)
    // -> 메서드의 파라미터 입력 값에 Provider에 제공하는 인스턴스를 주입하는 방식
    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Interface 구현하는 Dagger(xxx)Component 객체를 반환하는 create() 메서드를 제공
        //val carComponent : CarComponent = DaggerCarComponent.create()

        val carComponent = DaggerCarComponent
            .builder()
            .dieselPetrolEngineModule(DieselPetrolEngineModule(100))
            .build()
        carComponent.inject(this)

        car.drive()
    }
}