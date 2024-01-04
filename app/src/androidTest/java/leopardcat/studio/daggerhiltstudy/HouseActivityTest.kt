package leopardcat.studio.daggerhiltstudy

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import leopardcat.studio.daggerhiltstudy.houses.AlertSystem
import leopardcat.studio.daggerhiltstudy.houses.Noise
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class HouseActivityTest {

    @get:Rule(order = 1)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 2)
    var activityRule : ActivityScenarioRule<HouseActivity> = ActivityScenarioRule(HouseActivity::class.java)

    @Inject
    @Noise
    lateinit var alertSystem: AlertSystem

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun nothing() {
        Thread.sleep(50_000)
    }
}