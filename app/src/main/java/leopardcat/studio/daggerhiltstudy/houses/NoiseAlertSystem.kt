package leopardcat.studio.daggerhiltstudy.houses

import android.content.Context
import leopardcat.studio.daggerhiltstudy.R

class NoiseAlertSystem(): AlertSystem {
    override fun startAlerting() {
        println("Noise..Noise..Noise..Noise..")
    }
}