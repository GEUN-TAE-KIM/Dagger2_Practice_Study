package jp.co.archive_asia.dagger2practice

import android.util.Log
import javax.inject.Inject

//프로비전 메서드 겠지?
// 프러비전 -> 자체로 Provider에 의해 반환되는 인스턴스를 반환하는 메서드
class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    companion object {
        private const val TAG = "Dagger Car"
    }

    fun drive() {
        Log.d(TAG, "나는 드라이버")
    }
}