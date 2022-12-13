package jp.co.archive_asia.dagger2practice.model

import jp.co.archive_asia.dagger2practice.model.Rims
import jp.co.archive_asia.dagger2practice.model.Tires
import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {

}