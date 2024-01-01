package leopardcat.studio.daggerhiltstudy.houses

import javax.inject.Inject

class House @Inject constructor() {

    private val alertSystem = AlertSystem()

    fun alert() {
        alertSystem.startAlerting()
    }
}