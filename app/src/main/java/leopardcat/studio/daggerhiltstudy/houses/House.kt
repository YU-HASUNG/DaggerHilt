package leopardcat.studio.daggerhiltstudy.houses

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import leopardcat.studio.daggerhiltstudy.R
import javax.inject.Inject
import javax.inject.Named

class House @Inject constructor(@Lock private val alertSystem: AlertSystem) {

    fun alert() {
        alertSystem.startAlerting()
    }
}