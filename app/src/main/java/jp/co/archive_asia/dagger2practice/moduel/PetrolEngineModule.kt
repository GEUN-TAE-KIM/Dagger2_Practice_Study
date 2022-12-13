package jp.co.archive_asia.dagger2practice.moduel

import dagger.Binds
import dagger.Module
import jp.co.archive_asia.dagger2practice.model.Engine
import jp.co.archive_asia.dagger2practice.model.PetrolEngine

//@Binds는 @Provides의 특수한 형태일 뿐 같은 역활을 함
// 추상 클래스와 추상 메서드에만 유효하며 반드시 하나의 매개 변수만을 가져와야 함
@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine

    /*@Provides
    fun provideEngine(engine: PetrolEngine): Engine = engine*/
}