package jp.co.archive_asia.dagger2practice.model

import javax.inject.Scope

//CustomScope 만들기
 /*Container에서 제공하는 인스턴스들이 한번만 생성되도 되는데 호출 될때마다 생성 되며 불필요한 메로리 사용이 생김
 이를 해결하기 위해 하는것이 @Scope
 한번 생성된 객체가 재사용되는 범위를 관리*/
// Scope는 객체가 재사용되는 범위만을 가리킬 뿐
@Scope
annotation class PerActivity {
}