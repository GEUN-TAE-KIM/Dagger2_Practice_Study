package jp.co.archive_asia.dagger2practice

import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {

}