package leopardcat.studio.daggerhiltstudy.houses

import android.content.Context
import leopardcat.studio.daggerhiltstudy.R

class NoiseAlertSystem(
    private val context: Context
): AlertSystem {
    override fun startAlerting() {
        println(context.getString(R.string.noise))
    }
}