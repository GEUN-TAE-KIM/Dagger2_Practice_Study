package jp.co.archive_asia.dagger2practice.model

import android.util.Log
import javax.inject.Inject

const val TAG = "Dagger Car"

//프로비전 메서드 겠지?
// 프러비전 -> 자체로 Provider에 의해 반환되는 인스턴스를 반환하는 메서드
class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {

    fun drive() {
        engine.start()
        Log.d(TAG, "나는 드라이버")
    }

    @Inject
    fun connectRemote(remote: Remote) {
        remote.enableRemote(this)
    }
}