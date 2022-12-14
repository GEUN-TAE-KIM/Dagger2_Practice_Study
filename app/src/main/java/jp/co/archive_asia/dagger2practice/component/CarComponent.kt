package jp.co.archive_asia.dagger2practice.component

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import jp.co.archive_asia.dagger2practice.MainActivity
import jp.co.archive_asia.dagger2practice.model.Car
import jp.co.archive_asia.dagger2practice.model.PerActivity
import jp.co.archive_asia.dagger2practice.moduel.DieselPetrolEngineModule
import jp.co.archive_asia.dagger2practice.moduel.PetrolEngineModule
import jp.co.archive_asia.dagger2practice.moduel.WheelsModule
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
//클래스의 인스턴스를 모아 놓는 저장소 역활. 각 인스턴스들을 모듈 단위로 제공
/*@Component(dependencies = [ApplicationComponent::class] ,
    modules = [WheelsModule::class, PetrolEngineModule::class])//, PetrolEngineModule::class])*/

//여러 Component들을 쓸수 있게 의존 관게를 하고 상위에 프로바이더를 쓸 수 있도록 하는 것
@Subcomponent(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    // 별도의 Builder를 설정하지 않아도 Component내부에 Builder가 만들어져 있음
    // Builder를 따로 설정하기 위해서 Component.Builder를 선언
    // 기존 빌더와 달라진 점은
    // -> 빌더 내부에 메서드가 들어가고 해당 메서드를 통해 값을 세팅
/*    @Component.Builder
    interface Builder {

        // 특정 인스턴스를 Provide하는 @BindsInstance가 Component이 빌더안에 설정되면 해당 Component는
        // BindsInstance에 의해 제공된 Component 및 그 하위의 모든 모듈에 Provide가 가능
        // 그래서 PetrolEngineModule에 없어도 제공이 가능하게 된 것
        //TODO 그냥 Provider의 특수한 형태 @Bind 와 관련된 Annotation은 모두 Provider의 그냥 특수한 형태라고 함
        @BindsInstance
        fun horsePower(@Named("horsePower")hp: Int): Builder

        // 인스턴스의 타입이 같을 때 이름을 설정하여 주입 하는 것
        @BindsInstance
        fun engineCapacity(@Named("engineCapacity")cap: Int): Builder

        fun getApplicationComponent(appComponent: ApplicationComponent): Builder

        fun build(): CarComponent
    }*/


    //어떤 Component의 하위에 포함되는 컴포넌트 부모 모듈과 컴포넌트의 프로바이더를 모두 사용 가능
   /* @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horsePower")hp: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity")cap: Int): Builder

        fun build(): CarComponent

    }*/

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @Named("horsePower")hp: Int,
            @BindsInstance @Named("engineCapacity")cap: Int
        ): CarComponent
    }
}