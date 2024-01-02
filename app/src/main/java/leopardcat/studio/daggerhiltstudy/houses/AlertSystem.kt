package leopardcat.studio.daggerhiltstudy.houses

import javax.inject.Inject

class AlertSystem @Inject constructor() {

    fun startAlerting() {
        println("I am alerting...")
    }
}