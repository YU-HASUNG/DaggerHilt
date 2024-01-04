package leopardcat.studio.daggerhiltstudy

import leopardcat.studio.daggerhiltstudy.houses.AlertSystem

class FakeAlertSystem : AlertSystem {
    override fun startAlerting() {
        println("fake alert from the other side.")
    }
}