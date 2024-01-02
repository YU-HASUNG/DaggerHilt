package leopardcat.studio.daggerhiltstudy.houses

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import leopardcat.studio.daggerhiltstudy.R
import javax.inject.Inject

class House @Inject constructor(
    @ActivityContext private val context: Context,
    private val alertSystem: AlertSystem
) {

    fun alert() {
        println(context.getString(R.string.app_name))
        alertSystem.startAlerting()
    }
}